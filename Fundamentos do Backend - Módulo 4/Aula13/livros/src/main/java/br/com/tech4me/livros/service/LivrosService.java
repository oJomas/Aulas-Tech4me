package br.com.tech4me.livros.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.livros.shared.LivrosCompletoDTO;
import br.com.tech4me.livros.shared.LivrosDTO;

public interface LivrosService {
    List<LivrosCompletoDTO> obtertodas();
    Optional<LivrosDTO> obterPorId(String id);
    LivrosCompletoDTO cadastrarLivros (LivrosCompletoDTO livros);
    Optional <LivrosCompletoDTO> atualizarPorId(String id, LivrosCompletoDTO livros);
    void excluirPorId(String id);
}

