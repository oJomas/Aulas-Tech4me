package br.com.tech4me.pizzaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.pizzaria.model.Pizza;
import br.com.tech4me.pizzaria.repository.PizzaRepository;
import br.com.tech4me.pizzaria.shared.PizzaCompletoDTO;
import br.com.tech4me.pizzaria.shared.PizzaDTO;

@Service
public class PizzaServiceImpl implements PizzaService{

    @Autowired
    private PizzaRepository repositorio;

    @Override
    public List<PizzaDTO> obterTodas() {
        return repositorio.findAll()
                        .stream()
                        .map(p -> new PizzaDTO(p.getId(), p.getSabor(), p.getIngredientes()))
                        .toList(); 
    }

    @Override
    public Optional<PizzaCompletoDTO> obterPorId(String id) {
        Optional<Pizza> pizza = repositorio.findById(id);

        if(pizza.isPresent()){
            return Optional.of(new PizzaCompletoDTO(pizza.get().getId(),
             pizza.get().getSabor(), pizza.get().getIngredientes(), pizza.get().getTamanho(),
             pizza.get().getValor(), pizza.get().getQtdEstoque()));
            
        }

        return Optional.empty();
    }

    @Override
    public PizzaCompletoDTO cadastrar(PizzaCompletoDTO pizzaDto) {
        Pizza p = new Pizza(pizzaDto);
        repositorio.save(p);
        
        return new PizzaCompletoDTO(p.getId(), p.getSabor(), p.getIngredientes(), p.getTamanho(), p.getValor(), p.getQtdEstoque());
    }

    @Override
    public Optional<PizzaCompletoDTO> atualizarPorId(String id, PizzaCompletoDTO dto) {
        Optional<Pizza> pizza = repositorio.findById(id);

        if (pizza.isPresent()) {
            Pizza pizzaAtualizar = new Pizza(dto);
            pizzaAtualizar.setId(id);
            repositorio.save(pizzaAtualizar);
            return Optional.of(new PizzaCompletoDTO(pizzaAtualizar.getId(),
            pizzaAtualizar.getSabor(), pizzaAtualizar.getIngredientes(),
            pizzaAtualizar.getTamanho(), pizzaAtualizar.getValor(), pizzaAtualizar.getQtdEstoque()));
        }

        return Optional.empty();
    }

    @Override
    public void excluirPorId(String id) {
        repositorio.deleteById(id);
    }
    
}
