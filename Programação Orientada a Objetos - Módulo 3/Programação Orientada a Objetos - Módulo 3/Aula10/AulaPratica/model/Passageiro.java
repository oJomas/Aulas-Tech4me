package model;

public class Passageiro{
    private String nome;
    private String codigoPassageiro;

    public Passageiro(String nome2, String codigo) {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigoPassageiro() {
        return codigoPassageiro;
    }
    public void setCodigoPassageiro(String codigoPassageiro) {
        this.codigoPassageiro = codigoPassageiro;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s Código do Cliente: %s", getNome(), getCodigoPassageiro());
    }
        
    
}