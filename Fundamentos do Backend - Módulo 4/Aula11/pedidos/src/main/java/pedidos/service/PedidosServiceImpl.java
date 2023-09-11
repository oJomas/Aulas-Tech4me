package pedidos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pedidos.repositorio.PedidosRepository;
import pedidos.shared.PedidosCompletoDTO;
import pedidos.shared.PedidosDTO;

public class PedidosServiceImpl implements PedidosService {
    @Autowired
    private PedidosRepository repositorio;

    @Override
    public List<PedidosCompletoDTO> obterTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterTodos'");
    }

    @Override
    public Optional<PedidosDTO> obterPorId(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterPorId'");
    }

    @Override
    public PedidosCompletoDTO cadastrarPedido(PedidosCompletoDTO pedidos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarPedido'");
    }

    @Override
    public Optional<PedidosCompletoDTO> atualizarPorId(String id, PedidosCompletoDTO pedidos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPorId'");
    }

    @Override
    public Void excluirPorId(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluirPorId'");
    }

    
}
