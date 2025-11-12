package FichaPratica02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Insert data

        Scanner input = new Scanner(System.in);

        // Declaring variables

        double num1, num2;

        // Reading note1

        System.out.println("Insert number:");
        num1 = input.nextDouble();

        // Reading note2

        System.out.println("Insert number:");
        num2 = input.nextDouble();

        // Reading operation

        System.out.println("Insert symbol of operation:");
        String operation = input.next();
        switch (operation) {

            case "+":
                System.out.println("Result:"+(num1 + num2));
                break;
            case "-":
                System.out.println("Result:"+(num1 - num2));
                break;
            case "*":
                System.out.println("Result:"+(num1 * num2));
                break;
            case "/":
                System.out.println("Result:"+(num1 / num2));
                break;
            default: System.out.println("Error! Insert a valid operator ");
        }

    }


}
