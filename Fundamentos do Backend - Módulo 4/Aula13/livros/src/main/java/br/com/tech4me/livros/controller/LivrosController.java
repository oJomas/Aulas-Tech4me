package br.com.tech4me.livros.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.livros.service.LivrosService;
import br.com.tech4me.livros.shared.LivrosCompletoDTO;
import br.com.tech4me.livros.shared.LivrosDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/livros")
public class LivrosController {
    
    @Autowired
    private LivrosService service;

    @GetMapping("/porta")
    private String obterPorta(@Value("{local.server.port}") String porta){
        return "A porta dessa instância é a: " + porta;
    }

    @GetMapping
    private ResponseEntity<List<LivrosCompletoDTO>> obterLivros(){
        return new ResponseEntity<>(service.obtertodas(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<LivrosDTO> obterLivrosPorId(@PathVariable String id){
        if(service.obterPorId(id).isPresent()){
            return new ResponseEntity<>(service.obterPorId(id).get(), HttpStatus.OK);
        }

        return new ResponseEntity<LivrosDTO>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    private ResponseEntity<LivrosCompletoDTO> cadastrarLivro(@RequestBody LivrosCompletoDTO livros){
        return new ResponseEntity<>(service.cadastrarLivros(livros), HttpStatus.OK);
    }
   
    @PutMapping("/{id}")
    public ResponseEntity<LivrosCompletoDTO> atualizarLivro(@RequestBody LivrosCompletoDTO livro, @PathVariable String id) {
        Optional<LivrosCompletoDTO> livroAtualizar = service.atualizarPorId(id, livro);

        if(livroAtualizar.isPresent()){
            return new ResponseEntity<>(livroAtualizar.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/{id}")
    private ResponseEntity<LivrosDTO> excluirLivro(@PathVariable String id){
        service.excluirPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
