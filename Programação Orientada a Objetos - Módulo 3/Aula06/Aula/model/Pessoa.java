package model;

public class Pessoa{
    private String nome;
    private String cpf;

    public void cumprimentar(){
        System.out.println("Olá, eu sou o(a) " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}