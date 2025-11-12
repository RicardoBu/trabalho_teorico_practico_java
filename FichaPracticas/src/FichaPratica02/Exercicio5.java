package FichaPratica02;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables

        int num1, num2;

        // Reading num1

        System.out.println("Insert number:");
        num1 = nrInput.nextInt();

        // Reading num2

        System.out.println("Insert another  number:");
        num2 = nrInput.nextInt();

        if(num1==num2) {
            System.out.println("Same numbers" );
        } else {
            if(num1<num2){
               /* System.out.println("First:"+num1);
                System.out.println("Second:"+num2); */
                System.out.println(num1+""+num2);
            } else {
                /*System.out.println("First:"+num2);
                System.out.println("Second:"+num1); */
                System.out.println(num2+""+num1);
            }

        }



    }
}
