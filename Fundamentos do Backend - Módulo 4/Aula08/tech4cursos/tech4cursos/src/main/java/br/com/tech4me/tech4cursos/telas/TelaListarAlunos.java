package br.com.tech4me.tech4cursos.telas;

import java.util.List;
import java.util.Scanner;


import org.springframework.data.repository.Repository;

import br.com.tech4me.tech4cursos.model.Aluno;
import br.com.tech4me.tech4cursos.repository.AlunoRepository;

public class TelaListarAlunos implements Tela<Aluno, Integer>{

    @Override
    public void executar(Scanner entrada, Repository<Aluno, Integer> repositorio) {
        AlunoRepository repo = (AlunoRepository) repositorio;
        List<Aluno> alunos = repo.findByOrderByNomeAsc();
        
        if(alunos.isEmpty()){
            System.out.println("Não há alunos para exibir.");
            entrada.nextLine();
            return;
        }

        System.out.println(repo.findById(2).get());
        entrada.nextLine();
    }
    
}
