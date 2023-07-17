package model;

public class Pessoa implements Autenticavel{
    private String nome;
    private String cpf;
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
    
    @Override
    public String toString(){
        return String.format("Nome:%s CPF: %s ", getNome(), getCpf());
    
    
    }
    @Override
    public String obterCredencial() {
       return toString();
    }
}
