<<<<<<< HEAD
package aplicacao;

import model.Pizza;

public class App{
    public static void main(String[] args) {
        Pizza p = new Pizza("Frango", 30, 'p');

        System.out.println("Pizza criada");
        System.out.println();
    }
=======
package aplicacao;

import model.Pizza;

public class App{
    public static void main(String[] args) {
        Pizza pedido = new Pizza("Frango", 30, 'p');

        System.out.println("Pizza criada");
        System.out.println(pedido.pedidoIfood());
    }
>>>>>>> e14dc1975da4824c8ebd0bb7d83f58b08e2bbf0e
}