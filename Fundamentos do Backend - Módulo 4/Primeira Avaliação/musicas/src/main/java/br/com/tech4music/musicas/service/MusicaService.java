package br.com.tech4music.musicas.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4music.musicas.shared.MusicaDto;

public interface MusicaService {
    List<MusicaDto> obterTodas();
    Optional<MusicaDto> obterPorId(String id);
    MusicaDto cadastrar(MusicaDto musica);
    Optional<MusicaDto> atualizarPorId(String id, MusicaDto musica);
    void excluirPorId(String id);
}
