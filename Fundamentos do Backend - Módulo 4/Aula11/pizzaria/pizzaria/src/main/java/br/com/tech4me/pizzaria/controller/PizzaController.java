package br.com.tech4me.pizzaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.pizzaria.service.PizzaService;
import br.com.tech4me.pizzaria.shared.PizzaDTO;
import br.com.tech4me.pizzaria.shared.PizzariaCompletoDTO;

@RestController
@RequestMapping("/pizzas")
public class PizzaController { 

    @Autowired
    private PizzaService servico;

    @GetMapping("/porta")
    private String obterPorta(@Value("${local.server.port}") String porta){
        return "A porta dessa instância é a: " + porta;
    }
    
    @GetMapping
    private ResponseEntity<List<PizzaDTO>> obterPizzas(){
        return new ResponseEntity<>(servico.obterTodas(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<PizzariaCompletoDTO> obterPizzaPorId(@PathVariable String id){
        if (servico.obterPorId(id).isPresent()) {
            return new ResponseEntity<>(servico.obterPorId(id).get(), HttpStatus.OK);
        }

        return new ResponseEntity<PizzariaCompletoDTO>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    private ResponseEntity<PizzariaCompletoDTO> cadastrarPizza(@RequestBody PizzariaCompletoDTO pizza){
        return new ResponseEntity<>(servico.cadastrar(pizza), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> excluirPizzaPorId(@PathVariable String id){
        servico.excluirPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    private ResponseEntity<PizzariaCompletoDTO> atualizarPizza(@PathVariable String id, 
                                                    @RequestBody PizzariaCompletoDTO pizza){
        Optional<PizzariaCompletoDTO> pizzaAtualizar = servico.atualizarPorId(id, pizza);

        if (pizzaAtualizar.isPresent()) {
            return new ResponseEntity<>(pizzaAtualizar.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
