package br.com.tech4me.pedidos.shared;

import br.com.tech4me.pedidos.model.Pedido;

public record PedidosCompletoDTO(
    String id,
    String nomeCliente, 
    String idPizza, 
    Double valor
    ) {

    public static PedidosCompletoDTO fromPedido(Pedido pedido) {
        return new PedidosCompletoDTO(pedido.getId(), pedido.getNomeCliente(),
         pedido.getIdPizza(),pedido.getValor());
    }
    
}
