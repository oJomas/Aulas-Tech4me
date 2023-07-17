import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leia.nextInt();
        for(int i = 1; i <= num; i += 2){
            System.out.println("O número de impares é: " + i);
        }
    }
}