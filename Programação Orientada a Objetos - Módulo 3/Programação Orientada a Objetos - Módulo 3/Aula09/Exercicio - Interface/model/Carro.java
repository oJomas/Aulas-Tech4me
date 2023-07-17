package model;

public class Carro implements Autenticavel{
    private String marca;
    private String modelo;
    private String placa;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString(){
        return String.format("Marca: %s Modelo: %s Placa: %s ", getMarca(), getModelo(), getPlaca());
    }
    

    @Override
    public String obterCredencial() {
       return toString();
    }
}
