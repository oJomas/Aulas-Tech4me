package model;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Filme implements Comparable<Filme>, Comparator<Filme>{
    private String nome;
    private LocalDate dataLancamento;
    private String autor;
    private String genero;

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
    public boolean equals(Object obj) {
        Filme filme = (Filme)obj;
        return this.getNome().equalsIgnoreCase(filme.getNome());

    }


    @Override
    public String toString() {
        return "Nome: " + nome + ", Data de Lancamento: " + dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", Autor: " + autor + ", Genero: " + genero;
                
    }

    @Override
    public int compareTo(Filme o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
        
    }

    @Override
    public int compare(Filme o1, Filme o2) {
       return (o1.getDataLancamento().compareTo(o1.getDataLancamento()));
    }

  
}
