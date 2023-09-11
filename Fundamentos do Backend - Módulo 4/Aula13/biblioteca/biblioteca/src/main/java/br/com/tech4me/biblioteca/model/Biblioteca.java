package br.com.tech4me.biblioteca.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.tech4me.biblioteca.shared.BibliotecaDTO;

@Document("/Biblioteca")
public class Biblioteca {
    @Id
    private String id;
    private String nomeEstante;
    private Livros idLivro;
    private int quantidadeDeLivros;
    private Double valorDosLivros;

    public Biblioteca(BibliotecaDTO dto){
        setId(dto.id());
        setNomeEstante(dto.nomeEstante());
        setIdLivro(dto.idLivro());
        setQuantidadeDeLivros(dto.quantidadeDeLivros());
        setValorDosLivros(dto.valorDosLivros());
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeEstante() {
        return nomeEstante;
    }

    public void setNomeEstante(String nomeEstante) {
        this.nomeEstante = nomeEstante;
    }

    public Livros getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Livros idLivro) {
        this.idLivro = idLivro;
    }

    public Integer getQuantidadeDeLivros() {
        return quantidadeDeLivros;
    }

    public void setQuantidadeDeLivros(int quantidadeLivros) {
        this.quantidadeDeLivros = quantidadeLivros;
    }

    public Double getValorDosLivros() {
        return valorDosLivros;
    }

    public void setValorDosLivros(Double valorDosLivros) {
        this.valorDosLivros = valorDosLivros;
    }

}
