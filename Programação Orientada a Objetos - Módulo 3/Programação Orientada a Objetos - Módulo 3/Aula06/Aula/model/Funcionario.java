package model;

public class Funcionario extends Pessoa{
    private double salario;

    public void calcularSalario(double salarioBruto){
        salario = salarioBruto - (salarioBruto * 0.1);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
