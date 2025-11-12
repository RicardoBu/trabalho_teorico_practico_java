package FichaPratica01;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables

        int nr1,nr2,sum,subt,mult,divd;

        // Reading nr1

        System.out.println("Insert some number");
        nr1 = nrInput.nextInt();

        //Reading nr2

        System.out.println("Insert another number");
        nr2 = nrInput.nextInt();

        // Calculate sum
        sum = nr1 + nr2;

        // Calculate subt
        subt = nr1 - nr2;

        // Calculate mult
        mult = nr1*nr2;

        // Calculate divd
        divd = nr1/nr2;

        //Show results

        System.out.println("Sum:" + sum);
        System.out.println("Subtraction:" + subt);
        System.out.println("Multiplication:" + mult);
        System.out.println("Division:" + divd);



    }
}
