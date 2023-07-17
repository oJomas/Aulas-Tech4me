package aplicacao2;

import java.util.HashMap;

import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", "1234");
        Pessoa p2 = new Pessoa("Pedro", "123");
        Pessoa p3 = new Pessoa("Ana", "321");

        // Map<chave, objeto>
        Map<String, Pessoa> pessoas = new HashMap<>();

        pessoas.put(p1.getCPF(), p1);
        pessoas.put(p2.getCPF(), p2);
        pessoas.put(p3.getCPF(), p3);

        System.out.println(pessoas);

        pessoas.entrySet().forEach(item ->{

            System.out.println("Chave: " + item.getKey());
            System.out.println(item.getValue());
        });
    }
}