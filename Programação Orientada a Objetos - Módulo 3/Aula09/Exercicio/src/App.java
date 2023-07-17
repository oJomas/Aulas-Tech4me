package src;
import java.util.ArrayList;
import java.util.List;

import model.*;
import model.Funcionario;
import model.Pessoa;

public class App{
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("joao");
        Cliente cliente = new Cliente();
        cliente.setNome("Ana");

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(funcionario);
        pessoas.add(cliente);

        for (Pessoa pessoa : pessoas) {
            pessoa.cumprimentar();
        }
    }
}