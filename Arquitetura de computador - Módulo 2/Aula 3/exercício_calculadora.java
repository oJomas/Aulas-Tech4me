import java.util.Scanner;

class exercício_calculadora{
   public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double tamanho;
    double velocidade;
    final int bits = 8;
    System.out.println("Digite a velocidade da sua internet: ");
    velocidade = read.nextInt();
    System.out.println("Digite o tamanho do arquivo[mb]:");
    tamanho = read.nextInt();
    //O (int) vai transforma o double em int, arrendondando o resultado.
    int minuto = (int)(tamanho / (velocidade / bits) % 3600) / 60;
    int segundo = (int)(tamanho / (velocidade / bits)) % 60;
    int hora = (int)(tamanho / (velocidade / bits)) / 3600;
   
    if(hora <= 0 && minuto >= 1) {
      System.out.println("O tempo de download: " + minuto + " minuto(s) " + segundo + " segundo(s)");
    }if(hora <= 0 && minuto <= 0) {
      System.out.println("O tempo de download: " + segundo + " segundo(s)");
    }if(hora >= 1 && minuto >= 1){
      System.out.println("O tempo de download: " + hora + " hora(s), " + minuto + " minuto(s), " + segundo + " segundo(s)");
    }
   }
}

