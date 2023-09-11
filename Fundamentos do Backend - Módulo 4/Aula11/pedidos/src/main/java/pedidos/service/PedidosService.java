package pedidos.service;

import java.util.List;
import java.util.Optional;


import pedidos.shared.PedidosCompletoDTO;
import pedidos.shared.PedidosDTO;

public interface PedidosService {
    List<PedidosCompletoDTO> obterTodos();
    Optional<PedidosDTO> obterPorId(String id);
    PedidosCompletoDTO cadastrarPedido(PedidosCompletoDTO pedidos);
    Optional<PedidosCompletoDTO> atualizarPorId (String id, PedidosCompletoDTO pedidos);
    Void excluirPorId(String id);

}
