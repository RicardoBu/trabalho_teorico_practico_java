package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int yearlyTotal =0;

        int[] comissoes = new int[12];

        for( int i=0;i< comissoes.length;i++) {

            // Insert data
            Scanner input = new Scanner(System.in);

            System.out.println("Insert  a comission:");
            comissoes[i] = input.nextInt();
        }

        for(int i=0;i< comissoes.length;i++) {
           System.out.println("Total comissions:"+yearlyTotal);
            yearlyTotal+=comissoes[i];
        }

    }
}
