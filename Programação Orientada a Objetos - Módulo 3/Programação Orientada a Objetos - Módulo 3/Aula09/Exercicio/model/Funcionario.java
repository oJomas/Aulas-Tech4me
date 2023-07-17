package model;

public class Funcionario extends Pessoa {
    private double salario;

    @Override
    public void cumprimentar() {
        System.out.println("Olá, eu sou p funcionário: " + getNome());
    }
    


}
