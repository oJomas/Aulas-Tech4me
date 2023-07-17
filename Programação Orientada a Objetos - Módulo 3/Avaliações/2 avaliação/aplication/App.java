package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Implimento;
import model.Produto;
import model.Venda;

public class App{
    private int contador = 0; 
    
    Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<Produto> produto = new ArrayList<>();
        List<Venda> vendas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int opcao;
        do{
            menu();
            opcao = scan.nextInt();
            limpa();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
                case 1:
                    System.out.print("Digite o codigo do produto: ");
                    int codigo = scan.nextInt();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scan.nextLine();
                    scan.nextLine();
                    System.out.print("Digite o valor do produto: ");
                    double valor = scan.nextDouble();
                    System.out.print("Digite a Quantidade em estoque do produto: ");
                    int estoque = scan.nextInt();
                    Produto p = new Produto(nome, codigo, valor, estoque);
                    produto.add(p);
                    System.out.println("Produto incluido com sucesso!");
                    voltarMenu();
                    break;
                case 2:
                    System.out.println("Digite o código do produto: ");
                        int codigo2 = scan.nextInt();
                        Produto produto2 = new Produto(nome, codigo2, valor, estoque);
                        if(produto.equals(produto2.getcodigo())){
                            int posicao = produto.indexOf(produto2.getcodigo());
                            System.out.println(produto.get(posicao));
                        }else{
                            System.out.println("Produto não encontrado!");
                        }
                        
                    voltarMenu();
                    break;
                case 3:
                    DoubleSummaryStatistics estatica = produto.stream()
                    .collect(Collectors.summarizingDouble(Produto::getValor));
                    if(!produto.isEmpty()){
                        System.out.println("Apresentando lista dos produtos!");
                        produto.forEach(produtos ->{
                            System.out.println("Código do produto: " + produtos.getcodigo());
                            System.out.println("Nome do produto: " + produtos.getNome());
                            System.out.println("Valor unitário: " + produtos.getValor());
                            System.out.println("Quantidade em estoque: " + produtos.getQuantidadeEmEstoque());
                            System.out.println("\n==============================\n");
                        });
                        System.out.println("Apresentando o Valor máximo!");
                        System.out.printf("O Produto de mais caro foi de R$%.2f \n", estatica.getMax());
                        System.out.println("\n==============================");
                        System.out.println("Apresentando o Valor mínimo!");
                        System.out.printf("O Produto mais barato foi de R$%.2f \n", estatica.getMin());
                        System.out.println("\n==============================");
                        System.out.println("Apresentando a média dos produtos!");
                        System.out.printf("A média foi de R$%.2f", estatica.getAverage());
                        voltarMenu();
                        break;
                    }else{
                        System.out.println("Não há dados para exibir.");
                        voltarMenu();
                    }
                    
                case 4:
                    System.out.println("Apresentando o relatório de vendas!");
                    LocalDate dataDoRelatorio = LocalDate.now();
                    System.out.println(dataDoRelatorio);
                    
                    vendas.forEach(venda -> {
                        double total = venda.getQuantidadeVendida() * venda.getValorVendido();
                        double media = vendas.stream()
                        .collect(Collectors.averagingDouble(Venda :: getValorVendido));
                        System.out.println("Data da Venda: " + venda.getDataDaVenda());
                        System.out.println("Nome do produto: " + venda.getProdutoVendido());
                        System.out.println("Quantidade vendida: " + venda.getQuantidadeVendida());
                        System.out.println("Valor unitário: " + venda.getValorVendido());
                        System.out.println("valor total: " + total);
                        System.out.printf("A média das vendas é %.2f", media);
                        System.out.println("\n==============================\n");
                    });
                    
                    System.out.println("Digite [ENTER] para volta ao menu!");
                    voltarMenu();
                    break;
                case 5:
                    System.out.println("Apresentando a finalização da compra!" );
                    if(produto.isEmpty()){
                        System.out.println("Não há dados para exibir.");
                        voltarMenu();
                    }
                    System.out.print("Digite [ENTER] para ver todos");
                    String opcao2 = scan.nextLine();
                    Produto produtoVendido;
                    String dataDaVenda;
                    double valorDaVenda;
                    if(opcao2.equals("")){
                        int contador = 1;
                        for (Produto t : produto) {
                            System.out.println(contador + ":");
                            System.out.println(t);
                            System.out.println("\n==============================\n");
                            contador++;
                        }
                        System.out.println("Digite o número do produto que deseja: ");
                        int escolha = Integer.parseInt(scan.nextLine());
                        produtoVendido = (Produto) produto.get(escolha);
                    }
                    System.out.println("Digite a quantidade que deseja: ");
                    int quantidadevendida = Integer.parseInt(scan.nextLine());

                    if(quantidadevendida < produtoVendido.getQuantidadeEmEstoque()){
                        System.out.println("Digite a data da venda [dd/mm/yyyy]");
                        dataDaVenda = scan.nextLine();
                        System.out.print("Digite o valor do produto: ");
                        valorDaVenda = scan.nextDouble();
                        Venda venda = new Venda(quantidadevendida, produtoVendido, valorDaVenda);
                        venda.setDataDaVenda(LocalDate.parse(dataDaVenda, dtf));
                        vendas.add(venda);
                        System.out.println("Venda Finalizada!");
                    }else{
                        System.out.println("Não há essa quantidade no estoque!");
                        return;
                    }
                    voltarMenu();    
                    break;
                default:
                    System.out.println("Opção inválida!");
                    voltarMenu();
                    break;
            }

        }while(opcao != 0);
    }

    public static void menu(){ 
            System.out.println("***************************\n");
            System.out.println("***** Menu Principal *****\n");
            System.out.println("***************************\n");
            System.out.println("[0] Para Sair");
            System.out.println("[1] Para Incluir produto");
            System.out.println("[2] Para Consultar produto");
            System.out.println("[3] Para Listagem de produtos");
            System.out.println("[4] Para Vendas por período");
            System.out.println("[5] Para Realizar venda");
            System.out.print("Digite a opçao desejada: ");
        
    }
    public static void limpa(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    private static void voltarMenu(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite [ENTER] para voltar ao menu.");
        scan.nextLine();
        limpa();
    }








}




