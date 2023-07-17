package aplicacao2;

public class Pessoa {
    private String nome;
    private String CPF;
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        CPF = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cpf) {
        CPF = cpf;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: " + nome + " CPF: " + CPF);
    }
}
