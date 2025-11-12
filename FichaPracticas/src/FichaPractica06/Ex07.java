package FichaPractica06;

import java.util.Scanner;

public class Ex07 {



    public static void main(String[] args) {
        String caracter;
        int linhas,colunas;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira numero de linhas ");
        linhas= input.nextInt();

//        int[] vectorlinhas = new int[linhas];

        System.out.println("Insira numero de colunas ");
        colunas= input.nextInt();

//        int[] vectorColunas = new int[colunas];


        int[][] matrizFinal = new int[linhas][colunas];


        System.out.println("Insira um caracter");
        caracter= input.next();





        for(int i=0; i<matrizFinal.length;i++) {
            System.out.println(caracter);
        }


//        for(int i=0;i>matrizFinal[0].length && i<matrizFinal[linhas-1].length;i++) {
//
//
//            for(int j=0;j>matrizFinal[0][0] && j<matrizFinal[linhas-1][colunas-1];j++) {
//                System.out.print("");
//
//            }
//
//
//
//        }



//
        for(int i=0; i<matrizFinal[0].length;i++) {
            System.out.print(caracter);
        }


    }
}
