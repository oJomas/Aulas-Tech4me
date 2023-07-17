import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número de 1 à 12!");
        int mes = leia.nextInt();
        if(mes >= 1 && mes < 13 ){

            switch(mes){
                case 1:
                    System.out.println("O mês informado é Janeiro!");
                    break;
                case 2:
                    System.out.println("O mês informado é Fevereiro!");
                    break;
                case 3:
                    System.out.println("O mês informado é Março!");
                case 4:
                    System.out.println("O mês informado é Abril!");
                    break;
                case 5: 
                    System.out.println("O mês informado é Maio!");
                    break;
                case 6:
                    System.out.println("O mês informado é Junho!");
                    break;
                case 7:
                    System.out.println("O mês informado é Julho!");
                    break;
                case 8:
                    System.out.println("O mês informado é Agosto!");
                    break;
                case 9:
                    System.out.println("O mês informado é Setembro");
                    break;
                case 10:
                    System.out.println("O mês informado é Outubro!");
                    break;
                case 11:
                    System.out.println("O mês informado é Novembro!");
                    break;
                case 12:
                    System.out.println("O mês informado é Dezembro!");
                    break;

            }
        }


    }
}