package br.com.tech4me.pizzaria.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.pizzaria.shared.PizzaCompletoDTO;
import br.com.tech4me.pizzaria.shared.PizzaDTO;

public interface PizzaService {
    List<PizzaDTO> obterTodas();
    Optional<PizzaCompletoDTO> obterPorId(String id);
    PizzaCompletoDTO cadastrar(PizzaCompletoDTO pizza);
    Optional<PizzaCompletoDTO> atualizarPorId(String id, PizzaCompletoDTO pizza);
    void excluirPorId(String id);
}
