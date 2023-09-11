package br.com.tech4me.biblioteca.service;

import java.util.List;
import java.util.Optional;


import br.com.tech4me.biblioteca.shared.BibliotecaDTO;

public interface BibliotecaService {
    List<BibliotecaDTO> obterTodos();
    Optional<BibliotecaDTO> obterPorId(String id);
    BibliotecaDTO cadastrar(BibliotecaDTO bibli);
    Optional<BibliotecaDTO> atualizarPorId(BibliotecaDTO bibli, String id);
    void excluirPorId(String id);
}
