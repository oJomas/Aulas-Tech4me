import java.util.Scanner;

public class App{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       System.out.print("Escreva uma frase que deseje ser invertida: ");
       String frase = scan.next();
       String fraseInvertida = new StringBuilder(frase).reverse().toString(); 
        System.out.println(fraseInvertida);




    }
}