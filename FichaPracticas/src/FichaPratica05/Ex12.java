package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] matriz1 = new int[10];
        int[] matriz2 = new int[10];
        int[][] matrizFinal = new int[10][2];

        // Ler matriz1
        for (int linha = 0; linha < matriz1.length; linha++) {

        }

        // Ler matriz2
        for (int linha = 0; linha < matriz2.length; linha++) {

        }

        // Apresentar matrizTotal
        for (int linha = 0; linha < matrizFinal.length; linha++) {
            for (int coluna = 0; coluna < matrizFinal[0].length; coluna++) {
                System.out.print(matrizFinal[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }

        System.out.println();


    }
}
