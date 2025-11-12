package FichaPratica04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Declaring variables
        String option;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose an option");
        option = input.next();
        do {


            switch (option) {
                case "Create":
                    System.out.println("Created option");
                    break;
                case "Update":
                    System.out.println("Updated option");
                    break;
                case "Delete":
                    System.out.println("Updated option");
                    break;
                case "Exit":
                    System.out.println("Updated option");
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Choose an option");
            option= input.next();

        }
        while (!option.equals("Exit")) ;
    }


    }

