package FichaPratica03;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        // Declaring variables
        int num1, num2;

        // Insert data

        Scanner input = new Scanner(System.in);

        // Reading num1

        System.out.println("Insert the first number :");
        num1 = input.nextInt();

        // Reading num2

        System.out.println("Insert the second number :");
        num2 = input.nextInt();
        // 1st:num1 2st:num2;

        while (num1 <= num2) {

            if (num1 % 5 == 0) {
                System.out.println("Multiples of 5: " + num1);
            }

            num1++;
        }


    }

}
