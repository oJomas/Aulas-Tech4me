package br.com.tech4music.musicas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4music.musicas.model.Musicas;

public interface MusicaRepository extends MongoRepository<Musicas, String> {
    
}
