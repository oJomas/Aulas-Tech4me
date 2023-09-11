package br.com.tech4me.biblioteca.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.biblioteca.model.Biblioteca;

public interface BibliotecaRepository extends MongoRepository<Biblioteca, String>{
    
}
