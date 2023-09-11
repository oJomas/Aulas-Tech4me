package br.com.tech4me.livros.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4me.livros.model.Livros;

public interface LivrosRepository extends MongoRepository<Livros, String>{
    
}
