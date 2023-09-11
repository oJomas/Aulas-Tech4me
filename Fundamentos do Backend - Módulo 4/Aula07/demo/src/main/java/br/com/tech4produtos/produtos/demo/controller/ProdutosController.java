package br.com.tech4produtos.produtos.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4produtos.produtos.demo.model.Produtos;
import br.com.tech4produtos.produtos.demo.repository.ProdutosRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    
    @Autowired
    private ProdutosRepository repositorio;

    @GetMapping
    public List<Produtos> obterTodos(){
        return repositorio.findAll();
    }
}
