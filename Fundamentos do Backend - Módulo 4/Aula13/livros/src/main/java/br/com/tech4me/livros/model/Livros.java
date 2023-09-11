package br.com.tech4me.livros.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.tech4me.livros.shared.LivrosDTO;

@Document("livros")
public class Livros {
    @Id
    private String id;
    private String titulo;
    private String autor;
    private String genero;

    public Livros(LivrosDTO dto){
        setId(dto.id());
        setTitulo(dto.titulo());
        setAutor(dto.autor());
        setGenero(dto.genero());
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
