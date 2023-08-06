package java.br.com.tech4me.musicas.musicas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Musicas{
    private String nome;
    private String artista;
    @Id
    private String id;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}