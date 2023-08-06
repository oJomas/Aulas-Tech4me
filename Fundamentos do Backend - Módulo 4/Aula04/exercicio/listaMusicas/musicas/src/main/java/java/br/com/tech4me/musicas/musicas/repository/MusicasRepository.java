package java.br.com.tech4me.musicas.musicas.repository;

import java.br.com.tech4me.musicas.musicas.model.Musicas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicasRepository extends MongoRepository<Musicas, String> {
    
}
