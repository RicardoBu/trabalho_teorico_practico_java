package FichaPratica01;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){

       // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables

        int nr1, nr2;


        // Reading nr1

        System.out.println("Insert some number");
        nr1 = nrInput.nextInt();

        //Reading nr2

        System.out.println("Insert another number");
        nr2 = nrInput.nextInt();

        // Permutate
        nr2 = nr2*nr1;
        nr1= nr2/nr1;
        nr2= nr2/nr1;






        // nr1 tem que ter o valor do nr2 e nr2 tem que ter o valor do nr1

        //Show results

        System.out.println("Number1:" + nr1); // valor impresso nr2
        System.out.println("Number2:" + nr2); // valor impresso nr1
    }
}
