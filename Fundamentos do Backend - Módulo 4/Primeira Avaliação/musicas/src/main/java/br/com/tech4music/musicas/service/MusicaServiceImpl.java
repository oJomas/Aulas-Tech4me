package br.com.tech4music.musicas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4music.musicas.model.Musicas;
import br.com.tech4music.musicas.repository.MusicaRepository;
import br.com.tech4music.musicas.shared.MusicaDto;

@Service
public class MusicaServiceImpl implements MusicaService {
    
    @Autowired
    private MusicaRepository repositorio;

    @Override
    public List<MusicaDto> obterTodas(){
        return repositorio.findAll().stream().map(p -> new MusicaDto(p.getId(), p.getTitulo(), p.getArtista(), p.getAlbum(),
                                                                     p.getGenero(), p.getAnoLancamento(), p.getCompositor())).toList();
    }
    
    @Override
    public Optional<MusicaDto> obterPorId(String id){
        Optional<Musicas> musicas = repositorio.findById(id);

        if(musicas.isPresent()){
            return Optional.of(new MusicaDto(musicas.get().getId(), musicas.get().getTitulo(), musicas.get().getArtista(), musicas.get().getAlbum(),
            musicas.get().getGenero(), musicas.get().getAnoLancamento(), musicas.get().getCompositor()));
        }

        return Optional.empty();
    }

    @Override
    public MusicaDto cadastrar(MusicaDto musicas){
        Musicas m = new Musicas(musicas);
        repositorio.save(m);
        return new MusicaDto(m.getId(), m.getTitulo(), m.getArtista(), m.getAlbum(),
        m.getGenero(), m.getAnoLancamento(), m.getCompositor());
    }


    @Override
    public Optional<MusicaDto> atualizarPorId(String id, MusicaDto musica){
        Optional<Musicas> musicas = repositorio.findById(id);

        if(musicas.isPresent()){
            Musicas musicaAtualizada = new Musicas(musica);
            musicaAtualizada.setId(id);
            repositorio.save(musicaAtualizada);
            return Optional.of(new MusicaDto(musicaAtualizada.getId(), musicaAtualizada.getTitulo(), musicaAtualizada.getArtista(), 
                                            musicaAtualizada.getAlbum(), musicaAtualizada.getGenero(), 
                                            musicaAtualizada.getAnoLancamento(), musicaAtualizada.getCompositor()));
        }

        return Optional.empty();
    }

    @Override
    public void excluirPorId(String id){
        repositorio.deleteById(id);
    }

}
