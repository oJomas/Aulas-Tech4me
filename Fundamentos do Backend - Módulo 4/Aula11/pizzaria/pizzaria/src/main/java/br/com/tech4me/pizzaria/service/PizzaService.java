package br.com.tech4me.pizzaria.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.pizzaria.shared.PizzaDTO;
import br.com.tech4me.pizzaria.shared.PizzariaCompletoDTO;

public interface PizzaService {
    List<PizzaDTO> obterTodas();
    Optional<PizzariaCompletoDTO> obterPorId(String id);
    PizzariaCompletoDTO cadastrar(PizzariaCompletoDTO pizza);
    Optional<PizzariaCompletoDTO> atualizarPorId(String id, PizzariaCompletoDTO pizza);
    void excluirPorId(String id);
}
