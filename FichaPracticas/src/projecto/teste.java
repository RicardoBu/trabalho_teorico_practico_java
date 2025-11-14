package projecto;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static projecto.funcoesAdmin.*;
import static projecto.funcoesReceita.*;
import static projecto.funcoesSoma.*;
import static projecto.funcoesCliente.*;


public class teste {


    public static void loginMenu() throws FileNotFoundException {
        int opcaoMenu;
        String utilizador="",password="";
        do {

            Scanner input = new Scanner(System.in);
            System.out.println("Qual o tipo de utilizador?");
            System.out.println("ADMIN");
            System.out.println("CLIENTE");

            opcaoMenu = input.nextInt();


            switch(opcaoMenu) {
                case 1:
                    System.out.println("Insira o seu nome de utilizador");
                    utilizador = input.next();
                    System.out.println("Insira a password");
                    password = input.next();
                    if(utilizador.equals("admin") && password.equals("code")) {
                    admin();
                }


                    break;
                case 2: cliente();
                    break;
                case 0: //Sair
                    break;
                default: System.out.println("Opção inválida");

            }

        } while(opcaoMenu !=0);
    }

    public static void admin() throws FileNotFoundException {
        int opcao;
        do {

            Scanner input = new Scanner(System.in);

            System.out.println("-- ADMIN --");

            System.out.println("1-- Listar conteúdo dos ficheiros");
            System.out.println("2 - Estatísticas gerais de interações");
            System.out.println("3 - Receita total por tipo de interação");
            System.out.println("4 - Animal mais popular");
            System.out.println("5 - Top 3 espécies com mais apadrinhamentos");
            System.out.println("6 - Listar padrinhos de um animal");
            System.out.println("7 - Espetáculo mais rentável");
            System.out.println("8 - Ranking de animais em perigo de extinção");
            System.out.println("9 - Estatísticas por habitat");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma das opções:");
            opcao = input.nextInt();

            switch(opcao) {
                case 1: //listar conteudos

                    escolhaFicheiro();
                    //
                    break;
                case 2: // estatísticas gerais de interações
                    // que estatísticas?
                     somaInteracoes();
                    somaVisitas();
                    somaEspectaculos();
                    somaAlimentacao();
                    somaApadrinhamento();
                    break;
                case 3: //Receita total por tipo de interação
                     receitaVisitas();
                     receitaEspectaculos();
                     receitaAlimentacao();
                     receitaApadrinhamento();
                    // soma total de todas as interacções
                    break;
                case 4: //Animal mais popular
                    // animal com mais interacções
                    animalMaisPopular();

                    break;
                case 5: //Top 3 espécies com mais apadrinhamentos
                    // animal que tenha apadrinhamento dentro de nomeEvento
                    break;
                case 6: //Listar padrinhos de um animal
                    // devolver todos os idclientes que tenham nomeEvento == apadrinhamento
                    listarPadrinhosAnimal();
                    break;
                    case 7: //Espetáculo mais rentável
                        // nomeEvento com maior valor pago
                break;
                case 8: //Ranking de animais em perigo de extinção
                    //ranking de popularidade de animais?
                    break;
                case 9: //Estatísticas por habitat
                    break;

                default: System.out.println("Opção inválida");
            }

        } while(opcao !=0);

    }

    public static void cliente() throws FileNotFoundException {
        int opcao;
        do{

            Scanner input = new Scanner(System.in);
            System.out.println("1 - Ver catálogo de animais por habitat");
            System.out.println("2 - Ver atividades de um animal (espetáculos e alimentações)");
            System.out.println("3 - Simular apadrinhamento de um animal");
            System.out.println("4 - Encontrar \"amigos de zoo\"");
            System.out.println("5 - Jogo: adivinha a espécie");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma das opções:");
            opcao = input.nextInt();

            switch(opcao) {

                case 1: //Ver catálogo de animais por habitat
                    // filtrar animais por habitat
                    filtrarAnimais();
                    break;
                case 2: // Ver atividades de um animal (espetáculos e alimentações)
                    // depois de escolher um animal, filtrar espectáculos e alimentação
                    break;
                case 3: //Simular apadrinhamento de um animal
                    break;
                case 4: //Jogo: adivinha a espécie
                    jogo();
                    break;
                case 0: //Sair
                    break;
                default: System.out.println("Opção inválida");


            }



        } while(opcao!=0);

    }

    public static void main(String[] args) throws FileNotFoundException {
        loginMenu();
    }


}
