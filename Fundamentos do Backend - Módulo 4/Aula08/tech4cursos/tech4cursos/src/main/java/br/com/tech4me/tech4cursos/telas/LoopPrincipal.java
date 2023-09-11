package br.com.tech4me.tech4cursos.telas;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import br.com.tech4me.tech4cursos.repository.AlunoRepository;


@Component
public class LoopPrincipal {
    @Autowired
    private ApplicationContext context;

    private Scanner entrada = new Scanner(System.in);

    public void loop(){
        int opcao = 0;
        Tela tela = null;
        Repository repositorio = null;

        do {
            limpa();
            System.out.println("**************");
            System.out.println("MENU PRINCIPAL");
            System.out.println("**************");
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3- Buscar");
            System.out.println("0- Sair");
            System.out.println("Opção: ");
            opcao = Integer.parseInt(entrada.nextLine());
            limpa();
            switch (opcao) {
                case 2:
                    tela = new TelaListarAlunos();
                    repositorio = context.getBean(AlunoRepository.class);
                    break;
            
                default:
                    break;
            }

            if (tela != null) {
                tela.executar(entrada, repositorio);
            }

        } while (opcao != 0);

    }


    public void limpa(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
