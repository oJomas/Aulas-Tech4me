package br.com.tech4me.pedidos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.tech4me.pedidos.shared.PedidosCompletoDTO;
import br.com.tech4me.pedidos.shared.PedidosDTO;

@Document("pedidos")
public class Pedido {
    @Id
    private String id;
    private String nomeCliente;
    private String idPizza;
    private Double valor;
    
    public Pedido(){

    }

    public static Pedido fromPedidosCompletoDTO(PedidosCompletoDTO pedidoDto){
        Pedido pedido = new Pedido();
        pedido.setId(pedidoDto.id());
        pedido.setNomeCliente(pedidoDto.nomeCliente());
        pedido.setIdPizza(pedidoDto.idPizza());
        pedido.setValor(pedidoDto.valor());
        return pedido;
    }

    public static Pedido fromPedidoDTO(PedidosDTO pedidoDto){
        Pedido pedido = new Pedido();
        pedido.setId(pedidoDto.id());
        pedido.setNomeCliente(pedidoDto.nomeCliente());
        pedido.setIdPizza(pedidoDto.pizza().getId());
        pedido.setValor(pedidoDto.valor());
        return pedido;
    }

    /* public Pedido(PedidosCompletoDTO pedidoDto) {
        setId(pedidoDto.id());
        setNomeCliente(pedidoDto.nomeCliente());
        setIdPizza(pedidoDto.idPizza());
        setValor(pedidoDto.valor());
    } */
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdPizza() {
        return idPizza;
    }
    public void setIdPizza(String idPizza) {
        this.idPizza = idPizza;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
