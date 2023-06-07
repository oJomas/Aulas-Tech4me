import java.util.Scanner;

class HelloWorld {
   public static void main(String[] args) {
      int livro = 0;
      final int maximo = 5;
      int escolha;
      String pulaLinha = "\n";
      Scanner leia = new Scanner(System.in);
    
      do{
         System.out.println("\nDigite o seu interesse 1: Adicionar | 2: Remover | 3: Ver | 0: sair ");
            escolha = leia.nextInt();
          if (escolha != 0) {
                leia.nextLine();
             while (livro < maximo){
                switch (escolha) {
                  case 1:
                    livro++;
                    System.out.println("Mais um livro foi adicionado: " + livro + pulaLinha);
                    System.out.println("O maximo de livros adicionados sao 5!" + pulaLinha);
                  } break;
             }
             while (livro > 0) {
                switch (escolha){
                    case 2:
                        livro = livro - 1;
                        System.out.println("Um livro foi removido: " + livro + pulaLinha);
                        break;
                     
                    case 3:
                        System.out.println("A quantidade de livros na pilha: " + livro + pulaLinha);
                        leia.nextLine();
                   } break;
                }
            }
        }while (escolha != 0);
            System.out.println("Programa finalizado!");
   }
}