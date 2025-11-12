package FichaPratica02;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables

        int num;

        // Reading num1

        System.out.println("Insert number:");
        num = nrInput.nextInt();

        if(num%2== 0 ){

            System.out.println("Even number");
        } else {
            System.out.println("Odd number");

        }

    }
}
