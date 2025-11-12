package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Insert data

        Scanner input = new Scanner(System.in);

        // Declaring variables

        int num1,num2;



        // Reading num1
        System.out.println("Insert a number :");
        num1 = input.nextInt();

        // Reading num2
      System.out.println("Insert another number :");
        num2 = input.nextInt();

        while(num1 <=num2 ) {
            System.out.println(num1);
            num1+=1;

        }

    }
}
