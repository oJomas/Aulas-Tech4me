package br.com.tech4me.livros.shared;

import br.com.tech4me.livros.model.Biblioteca;
import br.com.tech4me.livros.model.Livros;

public record LivrosDTO(String id, String titulo, String autor, String genero, Biblioteca biblioteca) {
    
    public static LivrosDTO fromLivros(Livros livros, Biblioteca biblioteca){

        return new LivrosDTO(livros.getId(), livros.getTitulo(),livros.getGenero(), livros.getAutor(), biblioteca);
    }
}
