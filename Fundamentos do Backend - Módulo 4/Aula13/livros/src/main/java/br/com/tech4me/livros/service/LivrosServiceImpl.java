package br.com.tech4me.livros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.livros.model.Livros;
import br.com.tech4me.livros.repository.LivrosRepository;
import br.com.tech4me.livros.shared.LivrosDTO;

@Service
public class LivrosServiceImpl implements LivrosService {
    
    @Autowired
    private LivrosRepository repository;

    @Override
    public List<LivrosDTO> obtertodas(){
        return repository.findAll().stream().map(l -> new LivrosDTO(l.getId(), l.getTitulo(), l.getAutor(), l.getGenero())).toList();
    }

    @Override
    public Optional<LivrosDTO> obterPorId(String id) {
        Optional<Livros> livros = repository.findById(id);
        
        if(livros.isPresent()){
            return Optional.of(new LivrosDTO(livros.get().getId(), livros.get().getTitulo(), 
                                            livros.get().getAutor(), livros.get().getGenero()));
        }
        return Optional.empty();
    }

    @Override
    public LivrosDTO cadastrar(LivrosDTO livros) {
        Livros l = new Livros(livros);
        repository.save(l);
        return new LivrosDTO(l.getId(), l.getTitulo(), l.getAutor(), l.getGenero());
    }

    @Override
    public Optional<LivrosDTO> atualizarPorId(String id, LivrosDTO livros) {
        Optional<Livros> livro = repository.findById(id);

        if(livro.isPresent()){
            Livros livroAtualizado = new Livros(livros);
            livroAtualizado.setId(id);
            repository.save(livroAtualizado);
            return Optional.of(new LivrosDTO(livroAtualizado.getId(), livroAtualizado.getTitulo(), 
                                                livroAtualizado.getAutor(), livroAtualizado.getGenero()));
        }
        return Optional.empty();
    }

    @Override
    public void excluirPorId(String id) {
        repository.deleteById(id);
        
    }
    
}
