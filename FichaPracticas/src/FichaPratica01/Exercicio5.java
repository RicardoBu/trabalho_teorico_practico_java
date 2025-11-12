package FichaPratica01;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables

        double nr1,nr2,nr3, mean;

        // Reading nr1

        System.out.println("Insert some number");
        nr1 = nrInput.nextInt();

        //Reading nr2

        System.out.println("Insert another number");
        nr2 = nrInput.nextInt();

        //Reading nr3

        System.out.println("Insert another number");
        nr3 = nrInput.nextInt();

        // Calculate another mean
        mean = (nr1*0.2) + (nr2*0.3) + (nr3*0.5);

        //Show results

        System.out.println("Mean:" + mean);

    }
}
