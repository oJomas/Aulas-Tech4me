package br.com.tech4music.musicas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import br.com.tech4music.musicas.service.MusicaService;
import br.com.tech4music.musicas.shared.MusicaDto;

@RestController
@RequestMapping("musicas")
public class MusicasController {
    
    @Autowired
    private MusicaService servico;

    @GetMapping
    private ResponseEntity<List<MusicaDto>> obterMusicas(){
        return new ResponseEntity<>(servico.obterTodas(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<MusicaDto> obterPorId(@PathVariable String id){
        if(servico.obterPorId(id).isPresent()){
            return new ResponseEntity<>(servico.obterPorId(id).get(), HttpStatus.OK);
        }
        
        return new ResponseEntity<MusicaDto>(HttpStatus.NOT_FOUND);

    }

    @PostMapping
    private ResponseEntity<MusicaDto> cadastrarMusica(@RequestBody MusicaDto musica){
        return new ResponseEntity<>(servico.cadastrar(musica), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    private ResponseEntity<MusicaDto> atualizarMusica(@PathVariable String id,
                                                        @RequestBody MusicaDto musica){
        Optional<MusicaDto> musicaAtualizar = servico.atualizarPorId(id, musica);
        
        if(musicaAtualizar.isPresent()) {
            return new ResponseEntity<>(musicaAtualizar.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }  
    
    @DeleteMapping("/{id}")
    private ResponseEntity<Void> deletarMusica(@PathVariable String id){
        servico.excluirPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
