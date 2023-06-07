import java.util.Scanner;

public class exercício  {
   public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String algoritmo[] = new String[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + i + 1 + "passo do algoritmo: ");
            algoritmo[0] = leia.nextLine();
        }
        for (int i = 0; i < algoritmo.leangth; i++) {
            System.out.println("passo: " + (i+1) + "" + algoritmo[i]);
        }
        System.out.println("Fim do algoritmo!");
   }
}