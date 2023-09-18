package br.com.tech4me.livros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.livros.httpClient.BibliotecaClient;
import br.com.tech4me.livros.model.Biblioteca;
import br.com.tech4me.livros.model.Livros;
import br.com.tech4me.livros.repository.LivrosRepository;
import br.com.tech4me.livros.shared.LivrosCompletoDTO;
import br.com.tech4me.livros.shared.LivrosDTO;

@Service
public class LivrosServiceImpl implements LivrosService {
    
    @Autowired
    private LivrosRepository repository;

    @Autowired
    BibliotecaClient livroClient;

    @Override
    public List<LivrosCompletoDTO> obtertodas(){
        return repository.findAll().stream().map(l -> LivrosCompletoDTO.fromLivrosCompletoDTO(l)).toList();
    }


    @Override
    public Optional<LivrosDTO> obterPorId(String id) {
        Optional<Livros> livros = repository.findById(id);
        
        if(livros.isPresent()){
            Biblioteca biblioteca = livroClient.obterLivroPorId(livros.get().getIdBiblioteca());
            return Optional.of(LivrosDTO.fromLivros(livros.get(), biblioteca));
        }
        return Optional.empty();
    }

    @Override
    public LivrosCompletoDTO cadastrarLivros(LivrosCompletoDTO livrosDto) {
        Livros livro = Livros.fromLivrosCompletoDTO(livrosDto);

        Biblioteca biblioteca = livroClient.obterLivroPorId(livro.getIdBiblioteca());

        if(biblioteca.getQuantidadeDeLivros() >= 1){
            livroClient.cadastrarLivro(biblioteca);
            biblioteca.setQuantidadeDeLivros(biblioteca.getQuantidadeDeLivros() - 1);
            livroClient.atualizarLivro(biblioteca.getId(), biblioteca);
        }
        return LivrosCompletoDTO.fromLivrosCompletoDTO(livro);
    }

    @Override
    public Optional<LivrosCompletoDTO> atualizarPorId(String id, LivrosCompletoDTO livrosDto) {
        Optional<Livros> livro = repository.findById(id);

        if(livro.isPresent()){
            Livros livroAtualizado = Livros.fromLivrosCompletoDTO(livrosDto);
            livroAtualizado.setId(id);
            Biblioteca biblioteca = livroClient.obterLivroPorId(livroAtualizado.getId());
            repository.save(livroAtualizado);
            livroClient.atualizarLivro(id, biblioteca);
        }
        return Optional.empty();
    }

    @Override
    public void excluirPorId(String id) {
        livroClient.excluirPorId(id);
        
    }
    
}
