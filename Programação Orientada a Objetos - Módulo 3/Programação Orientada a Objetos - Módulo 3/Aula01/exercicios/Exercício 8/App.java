import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        int fatorial = 1;
        if(num >= 0){
            for(int i = 1; i <= num; i++ ){
               fatorial *= i;
            }
        }else{
            System.out.println("Erro!! Por favor inicie novamente!!");
        }
        System.out.println("O fatorial de " + num + " é " + fatorial);

    }
}