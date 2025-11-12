package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        int[] array = new int[10];
        boolean Asc = true;

        for(int i=0;i< array.length;i++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Insert a number");

            array[i] = input.nextInt();
        }

        for( int i=0;i< array.length-1;i++) {

            if(array[i]>array[i+1]) {
                Asc = false;
                System.out.println("Descending order");
            } else if (array[i]<array[i+1]) {
                System.out.println("Ascending order");
            }
        }

    }
}
