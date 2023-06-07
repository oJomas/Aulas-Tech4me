package modelo;
public class Conta {
    private String titulor;
    private int numeroConta;
    private double saldo;

    public void depostiar(double valorDeposito){
        saldo += valorDeposito;
    }

    public void sacar(double valorSaque){
        saldo -= valorSaque;
    }

    public void trasnferrir(String nomeTransferir){
        
    }


    //#region Getters and Setters

    public String getTitulor() {
        return titulor;
    }
    public void setTitulor(String titulor) {
        this.titulor = titulor;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //#endregion


}
