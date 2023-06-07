package modelo;
public class Pessoa {
    private String pessoa;
    private String cpf;
    private double salario;

    public void setPessoa(String pessoa){
        this.pessoa = pessoa;
    }
    public String getPessoa(){
        return this.pessoa;
    }

    public void setCpf(String cpf){
       if (cpf.matches("\\d{3}\\d{3}\\d{3}\\{12}")) {
        this.cpf = cpf;
       }else{
        this.cpf = "ERRO!!!";
       }

        
    }
    public String getCpf(){
        return this.cpf;
    }
   
    public void setSalario(double salario){
        calcularSalario(salario);
    }
    public double getSalario(){
        return this.salario;
    }

    public void calcularSalario(double salarioBruto){
        salario = salarioBruto - (salarioBruto * 0.1);
    }
}
