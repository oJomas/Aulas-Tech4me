import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Filme;

public class App {
    public static void main(String[] args) {
        List<Filme> filmes = obterDadosFilmes();
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Digite o nome do Filme: ");
        String nome = scan.nextLine();
        System.out.print("Digite a data de lançamento: ");
        String dataLancamento = scan.nextLine();
        System.out.println("Digite o autor do filme: ");
        String autor = scan.nextLine();
        System.out.println("Digite o genêro do filme: ");
        String genero = scan.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Filme filme = new Filme(nome, autor, genero);
        filme.setDataLancamento(LocalDate.parse(dataLancamento, dtf));

        filmes.add(filme);

        System.out.println("Filmes cadastrados: ");

        //filmes.sort(null);
        for (Filme f : filmes) {
            System.out.println(f);
        }

        //Read Especifico
        System.out.println("Buscando por filme!");
        Filme f = new Filme(nome, genero, genero);
        filmes.contains(f);
        f.setNome(("Filme 1"));
        boolean achou = false;

       // filme.sort((f1, f2) -> f1.getDataLancamento().compareTo(f2.getDataLancamento()));
       //filmes.removeIf(null);
        //Forma de encontrar um dado com o contains

        if (filmes.contains(f)){
            System.out.println("Filme encontrado!!!");
            int posicao = filmes.indexOf(f);
            System.out.println(filmes.get(posicao));

        }else {
            System.out.println("Não filme não encontrado!");
        }

        //Forma de encontrar um dado com o equals

        for (Filme filme2 : filmes) {
            if(filme2.equals(f)){
                achou = true;
                System.out.println(f.equals(f));
                break;
            }
        }

        if(!achou){
            System.out.println("Não há esse(s) filme(s)!");
        }

        //Update
        System.out.println("Atualizar o Autor: ");
        String novoAutor = "Marcos";
        Filme filmeBusca = new Filme(novoAutor, novoAutor, novoAutor);
        filmeBusca.setNome("Filme 1");
        if(filmes.contains(filmeBusca)){
            //O indexOf é a posição que o dado está armazenado
            int posicao = filmes.indexOf(filmeBusca);
            Filme filmeEncontrado = filmes.get(posicao);
            filmeEncontrado.setAutor(novoAutor);
            System.out.println(filmes.get(posicao));
        }     
        
        //delete
        System.out.println("Deletando filme 1");
        Filme f8 = new Filme(novoAutor, novoAutor, novoAutor);
        f8.setNome("Filme 1");

        filmes.remove(f8);
        System.out.println("Lista Atualizada!");
        for (Filme filme2 : filmes) {
            System.out.println(filme2);
        }*/

        System.out.println("Lista de itens");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        
        filmes.forEach(System.out:: println);
    }
  
    public static void imprimir(Filme filme){
        System.out.println(filme);
    }
    public static List<Filme> obterDadosFilmes(){
        List<Filme> filmes = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");

        Filme f1 = new Filme("Marley & eu", "Marley", "Drama");
        f1.setDataLancamento(LocalDate.parse("01/06/2002", dtf));
        filmes.add(f1);
        Filme f2 = new Filme("Interestelar", "Roger", "Ficcao");
        f2.setDataLancamento(LocalDate.parse("01/06/2018"));
        filmes.add(f2);
        Filme f3 = new Filme("Vingadores", "Joao", "Ação");
        f3.setDataLancamento(LocalDate.parse("01/06/2015"));
        filmes.add(f3);
        Filme f4 = new Filme("The lord", "Vinicius", "Aventura");
        f4.setDataLancamento(LocalDate.parse("01/02/2014"));
        filmes.add(f4);
    }
}
