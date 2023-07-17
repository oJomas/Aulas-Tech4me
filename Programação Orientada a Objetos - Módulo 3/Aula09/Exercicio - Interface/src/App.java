
import java.util.ArrayList;
import java.util.List;

import model.*;

public class App{
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.setMarca("Fiat");
        carro.setModelo("Não sei");
        carro.setPlaca("123-abc");

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("1234");
        pessoa.setNome("joao");

        Autenticador autenticador = new Autenticador();
        autenticador.adicionarCredencial(carro.toString());
        autenticador.adicionarCredencial(pessoa.toString());

        List<Autenticavel> autenticaveis = new ArrayList<>();

        autenticaveis.add(carro);
        autenticaveis.add(pessoa);

        for (Autenticavel autenticavel : autenticaveis) {
            if(autenticador.autenticar(autenticavel)){
                System.out.println("Deu certo!");
            }else
                System.out.println("Deu errado!");
            
        }

       
    }
}
