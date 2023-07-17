<<<<<<< HEAD
package aplicacao;

import modelo.Usuario;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Usuario user = new Usuario();
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Tela de Cadastro");
        System.out.println("Digite o email: ");
        String login = leia.nextLine();
        System.out.println("Digite a senha: ");
        String senha = leia.nextLine();


        if(user.autenticar(email, senha))
        



        System.out.printf("Usuário: %s, Senha: s%s", user.getLogin(), user.getSenha());
    }
=======
package aplicacao;

import modelo.Usuario;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Usuario user = new Usuario();
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Tela de Cadastro");
        System.out.println("Digite o email: ");
        String login = leia.nextLine();
        System.out.println("Digite a senha: ");
        String senha = leia.nextLine();


        if(user.autenticar(email, senha))
        



        System.out.printf("Usuário: %s, Senha: s%s", user.getLogin(), user.getSenha());
    }
>>>>>>> e14dc1975da4824c8ebd0bb7d83f58b08e2bbf0e
}