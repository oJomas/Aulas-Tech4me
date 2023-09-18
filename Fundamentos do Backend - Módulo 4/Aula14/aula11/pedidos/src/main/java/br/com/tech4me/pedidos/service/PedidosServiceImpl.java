package br.com.tech4me.pedidos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.pedidos.httpClient.PizzariaClient;
import br.com.tech4me.pedidos.model.Pedido;
import br.com.tech4me.pedidos.model.Pizza;
import br.com.tech4me.pedidos.repository.PedidosRepository;
import br.com.tech4me.pedidos.shared.PedidosDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import br.com.tech4me.pedidos.shared.PedidosCompletoDTO;

@Service
public class PedidosServiceImpl implements PedidosService{
    @Autowired
    PedidosRepository repositorio;

    @Autowired
    PizzariaClient cliente;

    @Override
    public List<PedidosCompletoDTO> obterTodos() {
        return repositorio.findAll().stream()
        .map(p -> PedidosCompletoDTO.fromPedido(p))
        .toList();
    }

    @CircuitBreaker(name = "obterPizzaPorId", fallbackMethod = "fallbackObterPorId")
    @Override
    public Optional<PedidosDTO> obterPorId(String id) {
        Optional<Pedido> pedido = repositorio.findById(id);

        if(pedido.isPresent()){
            Pizza pizza = cliente.obterPizzaPorId(pedido.get().getIdPizza());
            return Optional.of(PedidosDTO.fromPedido(pedido.get(), pizza));
        }

        return Optional.empty();
    }

    public Optional<PedidosDTO> fallbackObterPorId(String id, Exception e){
        Optional<Pedido> pedido = repositorio.findById(id);

        if(pedido.isPresent()){
            Pizza pizza = null;
            return Optional.of(PedidosDTO.fromPedido(pedido.get(), pizza));
        }

        return Optional.empty();
    }

    @Override
    public PedidosCompletoDTO cadastrarPedido(PedidosCompletoDTO pedidoDto) {
        Pedido pedido = Pedido.fromPedidosCompletoDTO(pedidoDto);

        Pizza pizza = cliente.obterPizzaPorId(pedidoDto.idPizza());
        if(pizza.getQtdEstoque() >= 1){
            repositorio.save(pedido);
            pizza.setQtdEstoque(pizza.getQtdEstoque() - 1);
            cliente.atualizarPizza(pizza.getId(), pizza);
        }

        return PedidosCompletoDTO.fromPedido(pedido);
    }

    @Override
    public Optional<PedidosCompletoDTO> atualizarPorId(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPorId'");
    }

    @Override
    public void excluirPorId(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluirPorId'");
    }

    
}
