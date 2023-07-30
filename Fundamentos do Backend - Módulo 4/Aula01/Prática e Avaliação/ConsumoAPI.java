import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI{
    
    public static String buscaEndereco(String cep){  
        String endereço = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereço)).build();
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