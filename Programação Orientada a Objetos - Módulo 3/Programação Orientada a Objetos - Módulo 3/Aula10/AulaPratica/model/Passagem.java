package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Passagem{
    public static final String Passagem = null;
    private LocalDate dataViagem;
    private double valor;
    private Passageiro passageiro;


    public Passagem(LocalDate parse, double valor2, Passageiro passageiro2) {
    }

    public LocalDate getDataViagem() {
        return dataViagem;
    }
    
    public void setDataViagem(LocalDate dataViagem) {
        this.dataViagem = dataViagem;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    @Override
        public String toString(){
            return String.format("Passagem [%s - %.2f - s%]", getDataViagem().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), getValor(), getPassageiro());
        }

}