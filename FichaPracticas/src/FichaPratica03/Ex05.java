package FichaPratica03;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        // Insert data

        Scanner input = new Scanner(System.in);

        // Declaring variables
        int num,nrInput;
        String message;

        num =1;

        // Reading num

        System.out.println("Insert a number :");
        nrInput = input.nextInt();

        // Reading message

        System.out.println("Insert message:");
        //Limpeza de buffer
        input.nextLine();
        message = input.nextLine();

        while (num <= nrInput) {

            System.out.println(message);
            num += 1;

        }

    }
}
