package java.br.com.tech4me.musicas.musicas.controller;

import java.br.com.tech4me.musicas.musicas.model.Musicas;
import java.br.com.tech4me.musicas.musicas.repository.MusicasRepository;
import java.util.List;

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


@RestController
@RequestMapping("/musicas")
public class MusicasController {
    
    @Autowired
    private MusicasRepository repositorio;

    @PostMapping
    private ResponseEntity<String> cadastrarMusicas(@RequestBody Musicas musica){
        if(musica != null){
            repositorio.save(musica);
            String mensagem = "Nome: " + musica.getNome() + " Artista: " + musica.getArtista();
            return new ResponseEntity<>(mensagem, HttpStatus.CREATED);

        }
        String mensagem = "Música inválida!";
        return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
    }

    @GetMapping
    private ResponseEntity<List<Musicas>> consultarMusicas(){
        List<Musicas> listaMusicas = repositorio.findAll();
        return new ResponseEntity<>(listaMusicas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private Musicas musicaEspecifica(@PathVariable String id){
        Musicas musica = repositorio.findById(id).orElse(null);
        return musica;
    }

    @PutMapping("/{id}")
    private ResponseEntity<Musicas> atualizarMusica(@PathVariable String id, @RequestBody Musicas musicaNova){
        Musicas musica = repositorio.findById(id).orElse(null);
        if(musica != null) {
            musica.setNome(musicaNova.getNome());
            musica.setArtista(musicaNova.getArtista());
            return new ResponseEntity<>(musica, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Musicas> deletaMusica(@PathVariable String id){
        repositorio.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
