<<<<<<< HEAD
package model;

public class Piloto extends Pessoa{
    private String breve;


    public Piloto(String nome, String cpf, String breve) {
        this.nome = nome;
        this.cpf = cpf;
        this.breve = breve;
    }


    public String getBreve() {
        return breve;
    }

    public void setBreve(String breve) {
        this.breve = breve;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "| CPF: " + cpf + "| Brevê: " + breve;
    }
=======
package model;

public class Piloto extends Pessoa{
    private String breve;


    public Piloto(String nome, String cpf, String breve) {
        this.nome = nome;
        this.cpf = cpf;
        this.breve = breve;
    }


    public String getBreve() {
        return breve;
    }

    public void setBreve(String breve) {
        this.breve = breve;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "| CPF: " + cpf + "| Brevê: " + breve;
    }
>>>>>>> e14dc1975da4824c8ebd0bb7d83f58b08e2bbf0e
}