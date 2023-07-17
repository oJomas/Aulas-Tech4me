package menu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import model.Passageiro;
import model.Passagem;

public class TeladeCompras implements Tela {

    @Override
    public void mostrarTela(Scanner scan, List<Passagem> passagens) {
        System.out.println("******* Telas de compras *******");
        System.out.print("Digite o nome do passageiro: ");
        String nome = scan.nextLine();
        System.out.print("Digite o código do passageiro: ");
        String codigo = scan.nextLine();
        Passageiro passageiro = new Passageiro(nome, codigo);
        System.out.println("Digite a data da viagem [dd/mm/aaaa]: ");
        String data = scan.nextLine();
        System.out.println("Digite o valor da viagem: ");
        double valor = Double.parseDouble((scan.nextLine()));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Passagem passagem = new Passagem(LocalDate.parse(data,df), valor, passageiro);

        System.out.println("Quantas passagens vão ser comprada?");
        int quantidade = scan.nextInt();
        System.out.println("Qual o valor da passagem?");
    
    }
    
   
   
}
