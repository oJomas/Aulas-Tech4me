package br.com.tech4me.biblioteca.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.tech4me.biblioteca.model.Biblioteca;
import br.com.tech4me.biblioteca.repository.BibliotecaRepository;
import br.com.tech4me.biblioteca.shared.BibliotecaDTO;

@Service
public class BibliotecaServiceImpl implements BibliotecaService {

    private BibliotecaRepository repository;

    @Override
    public List<BibliotecaDTO> obterTodos() {
        return repository.findAll().stream().map(b -> new BibliotecaDTO(b.getId(), b.getNomeEstante(), b.getIdLivro(),
                                                     b.getQuantidadeDeLivros(), b.getValorDosLivros())).toList();
    }

    @Override
    public Optional<BibliotecaDTO> obterPorId(String id) {
        Optional<Biblioteca> biblioteca = repository.findById(id);

        if(biblioteca.isPresent()){
            return Optional.of( new BibliotecaDTO(biblioteca.get().getId(), biblioteca.get().getNomeEstante(), biblioteca.get().getIdLivro(),
            biblioteca.get().getQuantidadeDeLivros(), biblioteca.get().getValorDosLivros()));
        }

        return Optional.empty();
    }

    @Override
    public BibliotecaDTO cadastrar(BibliotecaDTO bibli) {
       Biblioteca b = new Biblioteca(bibli);
       repository.save(b);
       return new BibliotecaDTO(b.getId(), b.getNomeEstante(), b.getIdLivro(), b.getQuantidadeDeLivros(), b.getValorDosLivros());
    }

    @Override
    public Optional<BibliotecaDTO> atualizarPorId(BibliotecaDTO dto, String id) {
        Optional<Biblioteca> bibli = repository.findById(id);

        if(bibli.isPresent()){
            Biblioteca bibliAtualizada = new Biblioteca(dto);
            bibliAtualizada.setId(id);
            repository.save(bibliAtualizada);
            return Optional.of( new BibliotecaDTO(bibliAtualizada.getId(), bibliAtualizada.getNomeEstante(), bibliAtualizada.getIdLivro(),
                                                    bibliAtualizada.getQuantidadeDeLivros(), bibliAtualizada.getValorDosLivros()));
        }
        return Optional.empty();
    }

    @Override
    public void excluirPorId(String id) {
        repository.deleteById(id);
    }
    
}
