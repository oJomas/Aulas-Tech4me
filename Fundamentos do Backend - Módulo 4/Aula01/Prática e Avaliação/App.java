import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Digite o se CEP: ");
        String cep = scan.nextLine();
        String cepEncontrado = ConsumoAPI.buscaEndereco(cep);
        System.out.println("Endereço encontrado!");
        System.out.println(cepEncontrado);
        scan.close();
        //Ctrl + shift + p = digite "Export jar" para pode executar no CMD*/
      System.out.println("Em inglês digite uma fruta!");
      String fruta = scan.nextLine();
      String frutaDigitada = ConsumindoOutraAPI.tabelaFrutas(fruta);
      System.out.println("Tabela Nutricional: ");
      System.out.println(frutaDigitada);
      scan.close();
   }

   
    
    
}
