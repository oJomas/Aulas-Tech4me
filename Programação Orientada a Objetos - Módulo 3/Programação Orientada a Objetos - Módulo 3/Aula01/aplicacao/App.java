<<<<<<< HEAD
package aplicacao;

import modelo.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setPessoa("Joao");
        p.setCpf("123456789111");
        p.setSalario(1000);

        System.out.printf("Pessoa 1: Nome %s, CPF: %s, Salário: R$%.2f", p.getPessoa(), p.getCpf(), p.getSalario());
    }
=======
package aplicacao;

import modelo.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setPessoa("Joao");
        p.setCpf("123456789111");
        p.setSalario(1000);

        System.out.printf("Pessoa 1: Nome %s, CPF: %s, Salário: R$%.2f", p.getPessoa(), p.getCpf(), p.getSalario());
    }
>>>>>>> e14dc1975da4824c8ebd0bb7d83f58b08e2bbf0e
}