package br.com.tech4me.livros.shared;

import br.com.tech4me.livros.model.Livros;

public record LivrosCompletoDTO(String id, String titulo, String autor, String idBiblioteca, String genero) {
    
    public static LivrosCompletoDTO fromLivrosCompletoDTO(Livros livros){
        return new LivrosCompletoDTO(livros.getId(), livros.getTitulo(), livros.getAutor(),
                                         livros.getIdBiblioteca(), livros.getGenero());
    }
}
