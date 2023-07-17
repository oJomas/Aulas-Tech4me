import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número!");
        int numero = leia.nextInt();

        System.out.println("Sucessor: " + (numero + 1));
        System.out.println("Antecessor: " + (numero - 1));

    }
}
