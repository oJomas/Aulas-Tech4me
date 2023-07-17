import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        for(int i = 1; i < 11; i++){
            System.out.println("Digite a quantidade do produto " + i );
            int quantidade = leia.nextInt();
            System.out.println("Digite o valor do produto " + i );
            double valor = leia.nextDouble();
            double produto = quantidade * valor;
            System.out.println("O valor do produto: " + i + " é de " + produto + "R$");
            
        }
           
          


        

    
    }
}