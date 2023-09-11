package pedidos.shared;

import pedidos.model.Pizza;

public record PedidosDTO(String id, String nomeCliente, Pizza pizza) {
    
}
