import java.util.Scanner;

public class App{
  
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);   
        double media, aprovado;
        String nome;
        int contagem = 0, alunos;
         do{   
            System.out.println("Quantos alunos sao?");
            alunos = leia.nextInt();
            while (alunos != contagem) {
                System.out.print("Digite o nome dos alunos: ");
                nome = leia.nextLine();
                leia.nextLine();
                System.out.print("Digite a média final do aluno: ");
                media = leia.nextDouble();
                contagem++;

                if (media >= 6) {
                    aprovado = (alunos * media);
        
                    System.out.println("O percentual de aprovados é " + aprovado);
                    System.out.println("Nome: " + nome + " média: " + media);
                }else
                    System.out.println("Infelizmente sua média não o suficiente!");
            }

        }while(alunos == contagem);  
       
            
    }

}