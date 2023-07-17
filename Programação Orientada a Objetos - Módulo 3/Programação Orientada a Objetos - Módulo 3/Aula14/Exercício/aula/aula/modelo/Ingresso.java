package modelo;

import java.time.LocalDate;

public class Ingresso {
    private Filme filme;
    private double valor;
    private LocalDate dataDaVenda;
    public Ingresso(Filme filme, double valor) {
        this.filme = filme;
        this.valor = valor;
    }

    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "filme: " + filme.getNome() + ", Valor: " + valor;
    }

    public LocalDate getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(LocalDate dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

}
