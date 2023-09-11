package br.com.tech4me.biblioteca.shared;

import br.com.tech4me.biblioteca.model.Biblioteca;
import br.com.tech4me.biblioteca.model.Livros;

public record BibliotecaDTO(String id, String nomeEstante, Livros idLivro, int quantidadeDeLivros, Double valorDosLivros) {
    
    public static BibliotecaDTO fromBiblioteca(Biblioteca Biblioteca, Livros livro){
        return new BibliotecaDTO(Biblioteca.getId(), Biblioteca.getNomeEstante(), Biblioteca.getIdLivro(),
        Biblioteca.getQuantidadeDeLivros(), Biblioteca.getValorDosLivros());
        }
}
