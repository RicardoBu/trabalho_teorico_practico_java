package FichaPratica02;

import java.util.Scanner;

public class Exercicio8 {

   public static void main(String[] args) {

       // Insert data

       Scanner nrInput = new Scanner(System.in);

       // Declaring variables

       double note1,note2,note3,mean;

       // Reading note1

       System.out.println("Insert grade:");
       note1 = nrInput.nextDouble();

       // Reading note2

       System.out.println("Insert grade2:");
       note2 = nrInput.nextDouble();

       // Reading note3

       System.out.println("Insert grade3:");
       note3 = nrInput.nextDouble();

       // Calculate special mean
       mean = (note1*0.25)+ (note2*0.35) + (note3*0.4);

       // System.out.println("Média: "+mean);
       if(mean>= 9.5 ){
           System.out.println("Média: "+mean);
           System.out.println("You passed");
       } else {
           System.out.println("Média: "+mean);
           System.out.println("Not passed");

       }

    }
}
