package FichaPratica02;

import java.util.Scanner;

public class Exercicio4 {
   public static void main(String[] args) {

       // Insert data

       Scanner nrInput = new Scanner(System.in);

       // Declaring variables

       int position, points;

       // Reading sal

       System.out.println("Insert salary:");
       position = nrInput.nextInt();

       switch(position) {

           case 1 : System.out.println("Ganhou 10 pontos");
           case 2 : System.out.println("Ganhou 8 pontos");
       }
    }
}
