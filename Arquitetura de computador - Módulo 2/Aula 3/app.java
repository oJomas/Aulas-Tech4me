import java.util.Scanner;

class exercício_calculadora{
   public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int tamanho;
    int velocidade;
    final int bits = 8;
    System.out.println("Digite a velocidade da sua internet: ");
    velocidade = read.nextInt();
    System.out.println("Digite o tamanho do arquivo[mb]:");
    tamanho = read.nextInt();

    System.out.println("O tempo de download: " + (tamanho / (velocidade / bits) );


   }
}