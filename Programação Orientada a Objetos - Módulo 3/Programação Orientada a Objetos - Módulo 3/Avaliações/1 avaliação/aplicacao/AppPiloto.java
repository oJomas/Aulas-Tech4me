<<<<<<< HEAD
package aplicacao;

import java.net.SocketTimeoutException;
import java.util.Scanner;

import model.Aeronave;
import model.Pessoa;
import model.Piloto;

public class AppPiloto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, cpf, breve;
        int saida = 0;
        System.out.print("Qual a quantidade no armazenamento: ");
        int quantidadePilotos = scan.nextInt();
        scan.nextLine();
        Piloto listaDePilotos[] = new Piloto[quantidadePilotos];
        Piloto piloto;
        do {
            System.out.println("Cadastrar piloto(1)");
            System.out.println("Listar pilotos cadastrados(2)");
            System.out.println("Localizar piloto(3)");
            System.out.println("Cadastrar aeronave(4)");
            System.out.println("Sair(0)");
            saida = scan.nextInt();

            if(saida == 1){
                for (int i = 0; i <= listaDePilotos.length; i++) {
                    System.out.print("Digite o nome do piloto: ");
                    nome = scan.nextLine();
                    System.out.print("Digite seu CPF: ");
                    cpf = scan.nextLine();
                    while (!cpf.matches("\\d{3}[.]{1}\\d{3}[.]{1}\\d{3}[-]{1}\\d{2}")) {
                        System.out.println("CPF incorreto!");
                        System.out.println("Digite um CPF válido: ");
                        cpf = scan.nextLine();
                    }
                    System.out.print("Digite sua brevê: ");
                    breve = scan.nextLine();
                    piloto = new Piloto(nome, cpf, breve);
                    listaDePilotos[i] = piloto;
                    System.out.println("Cadastros ocorrido com sucesso!");
                }
            } 

            else if (saida == 2) {
                if (listaDePilotos.length == 0) {
                    System.out.println("Não há pilotos cadastrados!");
                }else if(listaDePilotos.length > 1){
                     System.out.println(piloto.toString());
                }   
            }
                else if (saida == 3) {
                    Piloto encontrarPiloto = null;
                    boolean busca = false;
                    
                    System.out.print("Informe o CPF: ");
                    String CPF = scan.nextLine();
    
                    for (int i = 0; !busca && i <= listaDePilotos.length; i++) {
                        busca = CPF.equals(listaDePilotos[i].getCpf());
                        encontrarPiloto = listaDePilotos[i];
                    }
    
                    if (busca) {
                        System.out.printf("CPF: " + encontrarPiloto.getCpf());
                    } else if (encontrarPiloto == null) {
                        System.out.println("Piloto não encontrado!");

                    }  

                }   else if (saida == 4) {
                        if (listaDePilotos.length == 0) {
                            System.out.println("Primeiro cadastre o piloto!");
                        }else{
                            System.out.print("Digite o número da aeronave: ");
                            String numeroSerie = scan.nextLine();
                            scan.nextLine();
                            System.out.print("Digite o modelo: ");
                            String modelo = scan.nextLine();
                            Aeronave nave = new Aeronave(modelo, numeroSerie);
                            System.out.println("Aeronave cadastrada com sucesso!");
                            System.out.println(nave.toString());

                        }if(saida != 0 && saida != 1 && saida != 2 && saida != 3 && saida != 4){
                          System.out.println("Opção inválida!");  
                          
                        } 
                    }    
                   
            }while(saida != 0);    
        } 
    }

=======
package aplicacao;

import java.net.SocketTimeoutException;
import java.util.Scanner;

import model.Aeronave;
import model.Pessoa;
import model.Piloto;

public class AppPiloto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, cpf, breve;
        int saida = 0;
        System.out.print("Qual a quantidade no armazenamento: ");
        int quantidadePilotos = scan.nextInt();
        scan.nextLine();
        Piloto listaDePilotos[] = new Piloto[quantidadePilotos];
        Piloto piloto;
        do {
            System.out.println("Cadastrar piloto(1)");
            System.out.println("Listar pilotos cadastrados(2)");
            System.out.println("Localizar piloto(3)");
            System.out.println("Cadastrar aeronave(4)");
            System.out.println("Sair(0)");
            saida = scan.nextInt();

            if(saida == 1){
                for (int i = 0; i <= listaDePilotos.length; i++) {
                    System.out.print("Digite o nome do piloto: ");
                    nome = scan.nextLine();
                    System.out.print("Digite seu CPF: ");
                    cpf = scan.nextLine();
                    while (!cpf.matches("\\d{3}[.]{1}\\d{3}[.]{1}\\d{3}[-]{1}\\d{2}")) {
                        System.out.println("CPF incorreto!");
                        System.out.println("Digite um CPF válido: ");
                        cpf = scan.nextLine();
                    }
                    System.out.print("Digite sua brevê: ");
                    breve = scan.nextLine();
                    piloto = new Piloto(nome, cpf, breve);
                    listaDePilotos[i] = piloto;
                    System.out.println("Cadastros ocorrido com sucesso!");
                }
            } 

            else if (saida == 2) {
                if (listaDePilotos.length == 0) {
                    System.out.println("Não há pilotos cadastrados!");
                }else if(listaDePilotos.length > 1){
                     System.out.println(piloto.toString());
                }   
            }
                else if (saida == 3) {
                    Piloto encontrarPiloto = null;
                    boolean busca = false;
                    
                    System.out.print("Informe o CPF: ");
                    String CPF = scan.nextLine();
    
                    for (int i = 0; !busca && i <= listaDePilotos.length; i++) {
                        busca = CPF.equals(listaDePilotos[i].getCpf());
                        encontrarPiloto = listaDePilotos[i];
                    }
    
                    if (busca) {
                        System.out.printf("CPF: " + encontrarPiloto.getCpf());
                    } else if (encontrarPiloto == null) {
                        System.out.println("Piloto não encontrado!");

                    }  

                }   else if (saida == 4) {
                        if (listaDePilotos.length == 0) {
                            System.out.println("Primeiro cadastre o piloto!");
                        }else{
                            System.out.print("Digite o número da aeronave: ");
                            String numeroSerie = scan.nextLine();
                            scan.nextLine();
                            System.out.print("Digite o modelo: ");
                            String modelo = scan.nextLine();
                            Aeronave nave = new Aeronave(modelo, numeroSerie);
                            System.out.println("Aeronave cadastrada com sucesso!");
                            System.out.println(nave.toString());

                        }if(saida != 0 && saida != 1 && saida != 2 && saida != 3 && saida != 4){
                          System.out.println("Opção inválida!");  
                          
                        } 
                    }    
                   
            }while(saida != 0);    
        } 
    }

>>>>>>> e14dc1975da4824c8ebd0bb7d83f58b08e2bbf0e
