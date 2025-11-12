package FichaPratica02;

import java.util.Scanner;

public class Exercicio2 {
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
            System.out.println("20% tax:" + tax);

        } else {
          tax= sal*0.3;
            System.out.println("30% tax:" + tax);
        }





    }
}
