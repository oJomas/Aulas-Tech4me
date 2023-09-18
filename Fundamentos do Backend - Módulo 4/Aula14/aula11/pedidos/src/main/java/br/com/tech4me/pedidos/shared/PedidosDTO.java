package br.com.tech4me.pedidos.shared;

import br.com.tech4me.pedidos.model.Pedido;
import br.com.tech4me.pedidos.model.Pizza;

public record PedidosDTO(String id, String nomeCliente, Pizza pizza, Double valor) {
        public static PedidosDTO fromPedido(Pedido pedido, Pizza pizza) {
        return new PedidosDTO(pedido.getId(), pedido.getNomeCliente(),
        pizza, pedido.getValor());
    }
}
