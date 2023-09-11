package br.com.tech4me.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.biblioteca.service.BibliotecaService;
import br.com.tech4me.biblioteca.shared.BibliotecaDTO;

@RestController
@RequestMapping("/Biblioteca")
public class BibliotecaController {
    @Autowired
    private BibliotecaService service;

    @PostMapping
    public ResponseEntity<BibliotecaDTO> cadastrarPedidos(@RequestBody BibliotecaDTO bibli){
        return new ResponseEntity<>(service.cadastrar(bibli), HttpStatus.CREATED);
    }

    @GetMapping
    private ResponseEntity<List<BibliotecaDTO>> obterTodosOsLivros(){
        return new ResponseEntity<>(service.obterTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<BibliotecaDTO> obterPedidosPorId(@PathVariable String id){
        if(service.obterPorId(id).isPresent()){
            return new ResponseEntity<>(service.obterPorId(id).get(), HttpStatus.OK);
        }
        return new ResponseEntity<BibliotecaDTO>(HttpStatus.NOT_FOUND);

  
    }
}
