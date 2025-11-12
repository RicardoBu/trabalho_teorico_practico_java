package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int biggest=0;

        int[] array = new int[10];

        for(int i=0;i< array.length;i++) {

            // Insert data
            Scanner input = new Scanner(System.in);

            System.out.println("Insert  a number:");

            array[i] = input.nextInt();

        }

        for(int i=0;i< array.length;i++) {
            if(biggest>array[i]) {
                array[i] = biggest;
                System.out.println(biggest);

            }

        }

    }
}
