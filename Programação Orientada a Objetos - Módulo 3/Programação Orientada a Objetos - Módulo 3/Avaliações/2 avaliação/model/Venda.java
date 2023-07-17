package model;

import java.time.LocalDate;



public class Venda {
    private LocalDate dataDaVenda;
    private Produto produtoVendido;
    private int quantidadeVendida;
    private double valorVendido;
   

    
    public Venda(int quantidadeVendida, Produto produto, double valorVendido) {  
        this.quantidadeVendida = quantidadeVendida;
        this.produtoVendido = produto;
        this.valorVendido = valorVendido;
    }
    public LocalDate getDataDaVenda() {
        return dataDaVenda;
    }
    public void setDataDaVenda(LocalDate dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }
    public Produto getProdutoVendido() {
        return produtoVendido;
    }
    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }
    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }
    public double getValorVendido() {
        return valorVendido;
    }
    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }
   
   

    
}
