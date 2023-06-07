import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        String passo1;
        String passo2;
        String passo3;
        String passo4;
        String passo5;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escreva o passo 1 ");
        passo1 = leia.nextLine();
        System.out.println("Escreva o passo 2 ");
        passo2 = leia.nextLine();
        System.out.println("Escreva o passo 3 ");
        passo3 = leia.nextLine();
        System.out.println("Escreva o passo 4 ");
        passo4 = leia.nextLine();
        System.out.println("Escreva o passo 5 ");
        passo5 = leia.nextLine();
        System.out.println("Os passos serao" + "\n" + passo1 + "\n" + passo2 + "\n" + passo3 + "\n" + passo4 + "\n" + passo5);
        
    }
}