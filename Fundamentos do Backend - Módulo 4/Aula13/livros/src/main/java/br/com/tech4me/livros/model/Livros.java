package br.com.tech4me.livros.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.tech4me.livros.shared.LivrosCompletoDTO;
import br.com.tech4me.livros.shared.LivrosDTO;

@Document("livros")
public class Livros {
    @Id
    private String id;
    private String titulo;
    private String autor;
    private String genero;
    private String idBiblioteca;


    public Livros(){

    }

    public static Livros fromLivros(LivrosDTO livrosDto){
        Livros livro = new Livros();
        livro.setId(livrosDto.id());
        livro.setTitulo(livrosDto.titulo());
        livro.setAutor(livrosDto.autor());
        livro.setGenero(livrosDto.genero());
        livro. setIdBiblioteca(livrosDto.biblioteca().getId());
        return livro;
    }

    public static Livros fromLivrosCompletoDTO(LivrosCompletoDTO livrosDto){
        Livros livro = new Livros();
        livro.setId(livrosDto.id());
        livro.setTitulo(livrosDto.titulo());
        livro.setAutor(livrosDto.autor());
        livro.setGenero(livrosDto.genero());
        livro. setIdBiblioteca(livrosDto.idBiblioteca());
        return livro;
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


    public String getIdBiblioteca() {
        return idBiblioteca;
    }


    public void setIdBiblioteca(String idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }
}
