package aplicacao;

import model.Cliente;
import model.Funcionario;
import model.Pessoa;

public class App {
    public static void main(String[] args) {
      Pessoa pessoa = new Pessoa();
      pessoa.setNome("Carlos");
      pessoa.setCpf("123");
      pessoa.cumprimentar();
      Funcionario funcionario = new Funcionario();
      funcionario.setNome("joao");
      funcionario.setCpf("1234");
      funcionario.cumprimentar();
      Cliente cliente = new Cliente();
      cliente.setNome("ana");
      cliente.setCpf("1234");
      cliente.cumprimentar();

      Pessoa pessoas[] = new Pessoa [3];

    }
}
