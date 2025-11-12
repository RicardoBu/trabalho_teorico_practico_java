package FichaPratica02;

import java.util.Scanner;

public class Exercicio12 {
    public  static void main(String[] args) {

        // Insert data

        Scanner input = new Scanner(System.in);

        int option;

        // Reading operation

        System.out.println("Insert option:");
         option = input.nextInt();
        switch(option) {
            case 1:
                System.out.println("Create");
                break;
            case 2:
                System.out.println("Update");
                break;
            case 3:
                System.out.println("Delete");
                break;
            case 4:

                break;

            default: System.out.println("Error! Insert a valid option ");
        }

    }
}
