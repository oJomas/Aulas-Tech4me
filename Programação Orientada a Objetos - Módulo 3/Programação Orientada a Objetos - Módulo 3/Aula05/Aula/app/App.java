package app;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

import model.Endereco;
import model.Pessoa;
import model.Usuario;

public class App {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("***Tela de cadastro****");
        System.out.print("Quantos usuários você deseja cadastrar: ");
        int quantidadeDeFuncionarios = leia.nextInt();
        leia.nextLine();
        int opcao;
        //Instância = new (classe)
        Usuario listaDeUsuario[] = new Usuario[quantidadeDeFuncionarios];

        for (int i = 0; i < listaDeUsuario.length; i++){
            cadastraPessoa(leia, listaDeUsuario, i);
        }
       System.out.println("**** Tela de login ****");

       boolean achou = false;
        do{
            System.out.println("Digite seu email: ");
            String email = leia.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = leia.nextLine();
            for (int i = 0; i < listaDeUsuario.length; i++){
                if(listaDeUsuario[i].autenticar(email, senha));
                    achou = true;
            }
            
            if(achou){
                System.out.println("Seja bem-vindo!");
            }else{
                System.out.println("Usuário não encontrado!");
            }

        }while(!achou);
            
        }
       


        public static void cadastraPessoa(Scanner leia, Usuario listaDeUsuario[], int i) {
            
        
        System.out.println("***Tela de cadastro****");
        System.out.print("Quantos usuários você deseja cadastrar: ");
        int quantidadeDeFuncionarios = leia.nextInt();
        leia.nextLine();
        int opcao;
        //Instância = new (classe)
        Usuario listaDeUsuario[] = new Usuario[quantidadeDeFuncionarios];

        for (int i = 0; i < listaDeUsuario.length; i++){
            System.out.print("Informe seu nome: ");
            String nome = leia.nextLine();
            System.out.print("Informe seu CPF: ");
            String cpf = leia.nextLine();
            Pessoa p = new Pessoa(nome, cpf);

            System.out.print("Digite sua rua: ");
            String rua = leia.nextLine();
            System.out.print("Digite seu numero: ");
            int numero = Integer.parseInt(leia.nextLine());
            Endereco endereco = new Endereco(cpf, numero);

            System.out.print("Digite seu email: ");
            String email = leia.nextLine();
            System.out.print("Digite a sua senha: ");
            String senha = leia.nextLine();
            Usuario usuario = new Usuario(email, senha, p);

            listaDeUsuario[i] = usuario;
        
        }
    }
}
