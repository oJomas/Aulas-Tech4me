package menu;

import java.util.List;
import java.util.Scanner;

import model.Passagem;

public interface Tela {

    void mostrarTela(Scanner scan, List<Passagem> passagens);

}
