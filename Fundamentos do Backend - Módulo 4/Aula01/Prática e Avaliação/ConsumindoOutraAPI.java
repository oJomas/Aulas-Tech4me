import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumindoOutraAPI {
    
    public static String tabelaFrutas(String fruta){
        String nutricional = "https://www.fruityvice.com/api/fruit/" + fruta;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(nutricional)).build();
        HttpResponse <String> response;
        try {
           response = client.send(request, HttpResponse.BodyHandlers.ofString());
           return response.body();
       } catch (IOException | InterruptedException e) {
           //mostra a linha que ocorreu o erro
           e.printStackTrace();
       }
       return "";
     }
}


