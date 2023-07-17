package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import modelo.Filme;
import modelo.Ingresso;

public class App {
    
    public static void main(String[] args) {
        List<Filme> filmes = obterDadosFilmes();
        List<Ingresso> ingressos = obterListaDeIngressos(filmes);

        //forEach()
        System.out.println("\nApresentando itens da lista:");
        filmes.forEach(System.out::println); //O método forEach aplica uma ação para todos objetos da lista, a ação que este está aplicando é o println
        
        //sorted()
        System.out.println("\nApresentando itens da lista ordenado:");
        filmes.stream() //Origem do pipeline, iniciando o Stream com base na lista filmes
        .sorted((f1, f2) -> f1.getDataLancamento().compareTo(f2.getDataLancamento())) //O método sorted() é uma operação intermediaria que serve para ordenar
        //se nenhum parametro for informado o sorted verifica se o objeto armazenado na lista implementa a interface Comparable<>
        //se quisermos ordenar diferente de como foi definido na classe, podemos utilizar uma função lambda
        //função lambda para o sorted é aplicada a dois objetos: (f1,f2) -> qualquer comparação que retorne -1 ou 0 ou 1 (métodos compareTo())
        .forEach(System.out::println); 


        //filter()
        System.out.println("\nApresentar itens da lista que começam com a letra V");
        String letra = "V";
        filmes.stream()
        .filter(filme -> filme.getNome().toLowerCase().startsWith(letra.toLowerCase())) //O método filter serve para filtrar os objetos da lista
        //ele pede um teste lógico que será aplicado a todos objetos da lista, se verdadeiro adiciona no filtro, se falso remove
        .forEach(System.out::println);

        System.out.println("\nApresentando filmes de 2018: ");

        filmes.stream()
        .filter(filme -> filme.getDataLancamento().getYear() == 2018)
        .forEach(System.out::println);

        System.out.println("\nApresentando filmes de 01/10/2018 em diante: ");
        listarFilmesAposAnoInformado(filmes, 2002).forEach(System.out::println);

        //map()
        System.out.println("\nApresentar os diretores de todos os filmes: ");
        filmes.stream()
        .map(Filme::getAutor) //O método map serve para mapear um atributo do objeto armazenado na lista
        //podemos utilizar o map fazendo a chamada a um método get da classe filme (Filme::getAtributo)
        //ou podemos utilizar uma função lambda que será aplicada para todos objetos (f -> f.getAutor())
        .forEach(System.out::println); //Será apresentado apenas os autores

        System.out.println("\nApresentar os diretores junto com os filmes: ");
        filmes.stream()
        .forEach(f->{
            System.out.printf("Autor: %s - Filme: %s", f.getAutor(), f.getNome());
            System.out.println();
        });

        System.out.println("===================================================");
        System.out.println("Ingressos vendidos: ");
        ingressos.forEach(System.out::println);

        System.out.println("\nO valor médio das vendas foi de: ");
        
        double media = ingressos.stream()
        .collect(Collectors.averagingDouble(Ingresso::getValor));//O método collect() extrai os dados do Stream()
        //Ele pede como parâmetro uma função da classe Collectors que diz o que deve ser coletado
        //A função averagingDouble() realiza a soma e a divisão de todos os valores que foram passados como parâmetro
        //Neste exemplo passamos o getValor de cada Ingresso 

        System.out.printf("A média dos ingressos vendidos é de: R$%.2f\n", media);
        System.out.println("\nApresentando a estatistica dos ingressos vendidos");

        DoubleSummaryStatistics estatisca = ingressos.stream() //DoubleSummaryStatistics é um objeto que armazena uma estatistica de acordo com os valores que foram passados
        .collect(Collectors.summarizingDouble(Ingresso::getValor)); //summarizingDouble() retorna a estatistica do método que foi passado como parâmetro

        System.out.printf("O ingresso mais caro foi de: R$%.2f\n", estatisca.getMax()); // Máximo
        System.out.printf("O ingresso mais barato foi de: R$%.2f\n", estatisca.getMin()); // Minimo
        System.out.printf("A média dos ingressos foi de: R$%.2f\n", estatisca.getAverage()); // Média
        System.out.printf("O faturamento total foi de: R$%.2f\n", estatisca.getSum()); // Soma
        System.out.println("Foram vendidos " + estatisca.getCount() + " Ingressos"); // Quantidade
        
        List<Filme> filme = obterDadosFilmes();
        List<Ingresso> ingresso = obterListaDeIngressos(filme);

        Map<Integer, List<Filme>> filmePorAno = filmes.stream().
        collect(Collectors.groupingBy(filme -> filme.getDataLancamento().getYear()));
        
        
    }

    
    //método que faz um filtro na lista recebida como parametro para apresentar filmes posterior ao ano informado no parametro
    public static List<Filme> listarFilmesAposAnoInformado(List<Filme> filmes, int ano){
        List<Filme> listaFilmesPos2018;
        
        listaFilmesPos2018 = filmes.stream()
        .filter(filme -> filme.getDataLancamento().getYear() >= ano)
        .sorted((f1, f2) -> f1.getDataLancamento().compareTo(f2.getDataLancamento()))
        .collect(Collectors.toList());

        return listaFilmesPos2018;
    }

    //criando dados dos ingressos e obtendo uma lista com esses dados    
    public static List<Ingresso> obterListaDeIngressos(List<Filme> filmes){
        List<Ingresso> ingressos = new ArrayList<>();

        Ingresso i1 = new Ingresso(filmes.get(0), 25);
        ingressos.add(i1);

        Ingresso i2 = new Ingresso(filmes.get(3), 30);
        ingressos.add(i2);

        Ingresso i3 = new Ingresso(filmes.get(2), 10);
        ingressos.add(i3);

        Ingresso i4 = new Ingresso(filmes.get(2), 10);
        ingressos.add(i4);

        Ingresso i5 = new Ingresso(filmes.get(1), 50);
        ingressos.add(i5);

        return ingressos;
    }

    //criando dados dos filmes e retornando uma lista com esses dados
    public static List<Filme> obterDadosFilmes(){
        List<Filme> filmes = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Filme f4 = new Filme("Velozes e furiosos 20", "the rock" , "velocidade");
        f4.setDataLancamento(LocalDate.parse("01/06/2020", dtf));
        filmes.add(f4);


        Filme f1 = new Filme("Marley & eu", "Marley" , "Drama");
        f1.setDataLancamento(LocalDate.parse("01/06/2002", dtf));
        filmes.add(f1);

        Filme f2 = new Filme("Interestelar", "Roger" , "Ficcao");
        f2.setDataLancamento(LocalDate.parse("01/06/2018", dtf));
        filmes.add(f2);

        Filme f5 = new Filme("The lord of the rings", "Carlos" , "Ficcao");
        f5.setDataLancamento(LocalDate.parse("01/09/2020", dtf));
        filmes.add(f5);

        Filme f3 = new Filme("Vingadores", "João" , "Ação");
        f3.setDataLancamento(LocalDate.parse("01/10/2018", dtf));
        filmes.add(f3);

       
       

        return filmes;

    }
}
