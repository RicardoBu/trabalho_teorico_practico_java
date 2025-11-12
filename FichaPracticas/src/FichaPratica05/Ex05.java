package FichaPratica05;

import java.util.Scanner;

public class Ex05 {

    static void main(String[] args) {

        int[] array = new int[10];
        int average =0,totalSum=0;

        for(int i=0;i< array.length;i++) {
            // Insert data
            Scanner input = new Scanner(System.in);

            System.out.println("Insert  a number:");

            array[i] = input.nextInt();
        }

        for(int i=0;i< array.length;i++) {

            totalSum+=array[i];
            average = totalSum/ array.length;



        }

    }
}
