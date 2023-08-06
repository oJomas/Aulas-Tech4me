package br.com.tech4me.model;

public class Produtos{
    private String descricao;
    private double valor;
    private TipoItem tipo;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    
    }
    public TipoItem getTipo() {
        return tipo;
    }
    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }
}