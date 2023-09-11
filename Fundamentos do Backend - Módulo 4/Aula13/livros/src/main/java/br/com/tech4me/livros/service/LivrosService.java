package br.com.tech4me.livros.service;

import java.util.List;
import java.util.Optional;
import br.com.tech4me.livros.shared.LivrosDTO;

public interface LivrosService {
    List<LivrosDTO> obtertodas();
    Optional<LivrosDTO> obterPorId(String id);
    LivrosDTO cadastrar (LivrosDTO livros);
    Optional <LivrosDTO> atualizarPorId(String id, LivrosDTO livros);
    void excluirPorId(String id);
}

