package model;

public class Produto {
    private String nome;
    private int codigo;
    private double valor;
    private int quantidadeEmEstoque;

    
    public Produto(String nome, int codigo, double valor, int quantidadeEmEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getcodigo() {
        return codigo;
    }
    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return String.format("codigo: s% |Nome: s% | Valor: %.2f | Em estoque: %d", 
        getcodigo(), getNome(), getValor(), getQuantidadeEmEstoque());
    }
}
