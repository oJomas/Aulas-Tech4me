package br.com.tech4music.musicas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.tech4music.musicas.shared.MusicaDto;


@Document("musicas")
public class Musicas {
    @Id
    private String id;
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    private Integer anoLancamento;
    private String compositor;

    public Musicas() {

    }

    public Musicas(MusicaDto CadastrarMusicas){
        setId(CadastrarMusicas.id());
        setTitulo(CadastrarMusicas.titulo());
        setArtista(CadastrarMusicas.artista());
        setAlbum(CadastrarMusicas.album());
        setGenero(CadastrarMusicas.genero());
        setAnoLancamento(CadastrarMusicas.anoLancamento());
        setCompositor(CadastrarMusicas.compositor());

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
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
}
