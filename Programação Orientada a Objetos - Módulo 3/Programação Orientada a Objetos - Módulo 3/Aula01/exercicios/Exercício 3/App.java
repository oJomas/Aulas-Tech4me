import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a lagura da área: ");
        int lagura = leia.nextInt();
        System.out.println("Digite o comprimento da área: ");
        int comprimento = leia.nextInt();
        double area = (double) lagura * comprimento;
        System.out.println("A área de terra é: " + area + " metros ao quadrado!");

    }
}