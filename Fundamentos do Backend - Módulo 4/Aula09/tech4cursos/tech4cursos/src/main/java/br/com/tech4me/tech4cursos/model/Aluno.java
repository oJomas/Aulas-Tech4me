package br.com.tech4me.tech4cursos.model;

import jakarta.persistence.*;

@Entity
@Table(schema = "cursos", name = "aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricula;
	private String nome;
	private String cpf;
	private Integer idade;
    
    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
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
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("Matricula: %s - Nome: %s - Idade %d",
        getMatricula(), getNome(), getIdade());
    }
}
