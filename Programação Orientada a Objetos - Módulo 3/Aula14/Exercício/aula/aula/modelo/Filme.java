package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Filme implements Comparable<Filme>{
    private String nome;
    private LocalDate dataLancamento;
    private String autor;
    private String genero;

    public Filme() {
    }

    public Filme(String nome, String autor, String genero) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object obj){
        Filme filme = (Filme)obj;
        return this.getNome().equalsIgnoreCase(filme.getNome());
    }

    @Override
    public String toString() {
        //return "Filme [Nome = " + nome + ", Data de lançamento = " 
        //+ dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", Autor = " + autor + ", Genero = " + genero + "]";
        return "Nome: " + nome + " Data: " + dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public int compareTo(Filme o) {
       return this.getNome().compareToIgnoreCase(o.getNome());
    } 

}