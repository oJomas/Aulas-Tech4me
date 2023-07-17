import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a área do primeiro lado do triângulo:");
        double lado1 = leia.nextDouble();
        System.out.println("Digite a área do segundo lado do triângulo:");
        double lado2 = leia.nextDouble();
        System.out.println("Digite a área do terceiro lado do triângulo:");
        double lado3 = leia.nextDouble();
        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("O triângulo é um eqüilátero!");
        }else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("O triângulo é um escaleno!");
        }else{
            System.out.println("O triângulo é um isóscele !");
        }
        
    }
}