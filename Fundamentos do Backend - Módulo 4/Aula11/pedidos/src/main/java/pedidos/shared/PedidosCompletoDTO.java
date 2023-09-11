package pedidos.shared;

import java.util.List;

import pedidos.model.Pedidos;
import pedidos.model.Pizza;
import pedidos.model.Tamanho;

public record PedidosCompletoDTO(String id, String sabor, List<String> ingredientes, Tamanho tamanho, double valor) {

    public static PedidosDTO fromPedido(Pedidos pedido, Pizza pizza){
    return new PedidosDTO(pedido.getId(), pedido.getNomeCliente(), pedido.getValor());
    }
}
