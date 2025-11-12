package FichaPratica02;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables

        double sal,tax;

        // Reading sal

        System.out.println("Insert salary:");
         sal = nrInput.nextInt();

        if(sal<= 15000) {
            tax= sal*0.2;
            System.out.println("Amount of tax:" + tax);

        } else if( sal<=20000) {
            tax= sal*0.3;
            System.out.println("Amount of tax:" + tax);
        } else if( sal<=25000) {
            tax= sal*0.35;
            System.out.println("Amount of tax:" + tax);

        } else {
            tax= sal*0.4;
            System.out.println("Amount of tax:" + tax);
        }

    }
}
