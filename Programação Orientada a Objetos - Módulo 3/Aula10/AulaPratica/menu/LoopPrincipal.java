package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Passagem;

public class LoopPrincipal {
    private static Scanner scan;
    private static List<Passagem> passagens;
    
    public LoopPrincipal(){
        passagens = new ArrayList<>();
        scan = new Scanner(System.in);
    }
    public static void loopPrincipal(){
        do{
            
            mostraMenu();
            int opcao = Integer.parseInt(scan.nextLine());
            Tela tela = null;
                
            switch (opcao) {
                case 1:
                    tela = new TeladeCompras();
                    break;
                case 2:
                    tela = new TelaDeVendas();
                    break;
                case 3:
                    tela = new TelaDeBusca();
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;

            }
            if(tela != null){
                tela.mostrarTela(scan, passagens);
            }

        }while(opcao != 0);

    }

    
    public static void mostraMenu(){
        System.out.println("Sistema de compras de passagens");
        System.out.println("1 - Comprar passagem");
        System.out.println("2 - Listar passagens vendidas");
        System.out.println("3 - Buscar por passageiros");
        System.out.println("0 - sair");
    }
}
