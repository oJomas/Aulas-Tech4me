<<<<<<< HEAD
package model;

public class Aeronave {
    private String modelo;
    private String numeroSerie;

    
    public Aeronave(String modelo, String numeroString) {
        this.modelo = modelo;
        this.numeroSerie = numeroString;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumeroString() {
        return numeroSerie;
    }
    public void setNumeroString(String numeroString) {
        this.numeroSerie = numeroString;
    }

    
    @Override
    public String toString(){
        return "Modelo: " + modelo + ", Número da Aeronáve: " + numeroSerie;
    }
}
=======
package model;

public class Aeronave {
    private String modelo;
    private String numeroSerie;

    
    public Aeronave(String modelo, String numeroString) {
        this.modelo = modelo;
        this.numeroSerie = numeroString;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumeroString() {
        return numeroSerie;
    }
    public void setNumeroString(String numeroString) {
        this.numeroSerie = numeroString;
    }

    
    @Override
    public String toString(){
        return "Modelo: " + modelo + ", Número da Aeronáve: " + numeroSerie;
    }
}
>>>>>>> e14dc1975da4824c8ebd0bb7d83f58b08e2bbf0e
