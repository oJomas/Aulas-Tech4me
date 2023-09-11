package br.com.tech4me.tech4cursos.telas;

import java.util.Scanner;

import org.springframework.data.repository.Repository;

import br.com.tech4me.tech4cursos.model.Aluno;
import br.com.tech4me.tech4cursos.repository.AlunoRepository;

public class TelaBuscarAluno implements Tela<Aluno, Interger> {

    @Override
    public void executar(Scanner scan, Repository<Aluno, Interger> repositorio) {
        AlunoRepository repo = (AlunoRepository) repositorio;
        System.out.println("Digite o nome aluno que quer encontrar: ");
        String nome = scan.nextLine();
        Aluno aluno = repo.findBy(nome);
    }
    
}
