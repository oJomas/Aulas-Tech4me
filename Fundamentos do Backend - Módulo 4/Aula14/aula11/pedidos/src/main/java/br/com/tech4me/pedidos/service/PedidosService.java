package br.com.tech4me.pedidos.service;

import java.util.List;
import java.util.Optional;
import br.com.tech4me.pedidos.shared.PedidosDTO;
import br.com.tech4me.pedidos.shared.PedidosCompletoDTO;

public interface PedidosService {
    List<PedidosCompletoDTO> obterTodos();
    Optional<PedidosDTO> obterPorId(String id);
    PedidosCompletoDTO cadastrarPedido(PedidosCompletoDTO pedidos);
    Optional<PedidosCompletoDTO> atualizarPorId(String id);
    void excluirPorId(String id);

}
