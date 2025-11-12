package FichaPratica01;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables

        double nr1, nr2,nr3,price;

        // Reading nr1

        System.out.println("Insert price");
        nr1 = nrInput.nextInt();

        //Reading nr2

        System.out.println("Insert another price");
        nr2 = nrInput.nextInt();

        //Reading nr3

        System.out.println("Insert another price");
        nr3 = nrInput.nextInt();

        // Calculate discount
        price = (nr1 + nr2 + nr3) *0.9;

        //Show results

        System.out.println("Price with discount:" + price); // valor impresso nr2


    }
}
