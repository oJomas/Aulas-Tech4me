package model;

public class Cliente extends Pessoa{
    private String codigoCliente;

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public void cumprimentar() {
        System.out.println("Olá, eu sou cliente: " + getNome());
    }
    
}
