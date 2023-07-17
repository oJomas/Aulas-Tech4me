package model;

public class Contato {
    private String nome;
    private int telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        //s%: Faz com que mostre do tipo "String" e %d: Faz com que mostre do tipo "int"
        return String.format("Nome: s%, Telefone: %d", nome, telefone);
    }

    @Override
    public boolean equals(Object obj) {
        Contato contato = (Contato) obj;
        return getTelefone() == contato.getTelefone();
    }
  
    
}
