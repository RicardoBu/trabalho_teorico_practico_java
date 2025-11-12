//package FichaPractica07;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Ex09 {
//
//    public static void pesquisarMusica(String caminho) throws FileNotFoundException {
//
//        File ficheiro = new File(caminho);
//        Scanner sc = new Scanner(ficheiro);
//
//        Scanner input = new Scanner(System.in);
//
//        String genero,artista,line,generoFicheiro,artistaFicheiro;
//        int duracao,duracaoFicheiro,valor,nrMusicas,opcao=0;
//
//        while(sc.hasNextLine()) {
//            line= sc.nextLine();
//            String[] lineItems = line.split(",");
//
//
//            generoFicheiro= lineItems[2];
//            artistaFicheiro= lineItems[2];
//            duracaoFicheiro = Double.parseDouble(lineItems[3]);
//        }
//
//        do {
//            switch(opcao) {
//                case 1: System.out.println("Insira o género");
//                genero= input.next();
//                break;
//                case 2:  System.out.println("Insira o artista");
//                artista = input.next();
//                    break;
//                case 3: System.out.println("Insira a duracao");
//                duracao= input.nextInt();
//                    break;
//                case 4:  System.out.println("Insira o valor");
//                valor= input.nextInt();
//                    break;
//                case 5: System.out.println("Insira o numero de musicas");
//                nrMusicas= input.nextInt();
//                    break;
//                case 6: System.out.println("Sair");
//                    break;
//                default: System.out.println("Insira uma opcao valida");
//
//            }
//
//
//        } while(opcao !=6);
//    }
//    static void main(String[] args) throws FileNotFoundException {
//        pesquisarMusica("src/Files/exercicio_09.csv");
//
//    }
//}
//
////Comparar valor do utilizador com o valor do ficheiro
//// Utilizador: inputNext()  Ficheiro: sc.hasNext()