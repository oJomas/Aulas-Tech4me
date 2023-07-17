package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Contato;

public class Telas {
    Scanner scan = new Scanner(System.in);
        List<Contato> contatos = new ArrayList<>();
        int opcao;

        public void opcoesDeMenu(){
            System.out.println("1 - cadastrar contato");
            System.out.println("2 - listar contatos");
            System.out.println("3 - buscar contatos");
            System.out.println("0 - fechar programa"); 
            System.out.print("opção : ");
            opcao = scan.nextInt();
            scan.nextLine();
        }

        public void cadastrarContato(){
            Contato contato = new Contato();
            System.out.print("nome :");
            p.setNome(scan.nextLine());
            System.out.print("telefone :");
            p.setTelefone(Integer.parseInt(scan.nextLine()));
            contatos.add(p); 

            boolean busca = false;
            for (Contato contatos : contatos) {
                if (p.equals(contatos)){
                    busca = true;
                    System.out.println("Existe essa pessoa!");
                    break;
                }
            }

            if(!busca){
                contatos.add(contato);
                System.out.println("Contato cadastrado!");
            }
        }

        public void listarContatos(){
            if(contatos.isEmpty()){
                System.out.println("Não há contatos cadastrados!");
                return;
            }

            System.out.println("Lista de contatos!");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
        
        public void loopPrincipal(){
            do{
                opcoesDeMenu();
                switch (opcao) {
                    case 1:
                        cadastrarContato();
                        break;
                    case 2:
                        listarContatos();


                    default:
                        break;
                }
            }while (opcao != 0);
        }

}
