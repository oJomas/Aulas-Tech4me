import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = leia.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = leia.nextInt();
         if(num1 < num2){
            for(int i = 0; i <= num2; i += 2){
                System.out.println("Os pares do número 1 e 2 é " + i);
            }
            }else if(num2 < num1){
            for(int i = 0; i <= num1; i += 2){
                System.out.println("Os pares do número 1 e 2 é " + i);
            }
            }else if(num1 == num2){
            num1 = 10;
            for(int i = 0; i <= num1; i += 2){
                System.out.println("Os números estao iguais! " + i);
            }
        }
        
    }
}