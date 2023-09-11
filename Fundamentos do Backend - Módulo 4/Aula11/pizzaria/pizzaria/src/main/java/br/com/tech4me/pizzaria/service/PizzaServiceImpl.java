package br.com.tech4me.pizzaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.pizzaria.model.Pizza;
import br.com.tech4me.pizzaria.repository.PizzaRepository;
import br.com.tech4me.pizzaria.shared.PizzaDTO;
import br.com.tech4me.pizzaria.shared.PizzariaCompletoDTO;

@Service
public class PizzaServiceImpl implements PizzaService{

    @Autowired
    private PizzaRepository repositorio;

    @Override
    public List<PizzaDTO> obterTodas() {
        return repositorio.findAll().stream().map(p -> new PizzaDTO(p.getId(),
                                 p.getSabor(), p.getIngredientes())).toList();
    }

    @Override
    public Optional<PizzariaCompletoDTO> obterPorId(String id) {
        Optional<Pizza> pizza = repositorio.findById(id);

        if(pizza.isPresent()){
            return Optional.of(new PizzariaCompletoDTO(pizza.get().getId(), pizza.get().getSabor(),pizza.get().getIngredientes(),
                                                        pizza.get().getTamanho(), pizza.get().getValor()));
        }
    
        return Optional.empty();

    }

    @Override
    public PizzariaCompletoDTO cadastrar(PizzariaCompletoDTO pizza) {
        Pizza p = new Pizza(pizza);
        repositorio.save(p);
        return new PizzariaCompletoDTO(p.getId(), p.getSabor(), p.getIngredientes(), p.getTamanho(), p.getValor());
    }

    @Override
    public Optional<PizzariaCompletoDTO> atualizarPorId(String id, PizzariaCompletoDTO dto) {
        Optional<Pizza> pizza = repositorio.findById(id);

        if (pizza.isPresent()) {
            Pizza pizzaAtualizar = new Pizza(dto);
            pizzaAtualizar.setId(id);
            repositorio.save(pizzaAtualizar);
            return Optional.of(new PizzariaCompletoDTO(pizzaAtualizar.getId(), pizzaAtualizar.getSabor(), pizzaAtualizar.getIngredientes(),
            pizzaAtualizar.getTamanho(), pizzaAtualizar.getValor()));
        }

        return Optional.empty();
    }

    @Override
    public void excluirPorId(String id) {
        repositorio.deleteById(id);
    }
    
}
