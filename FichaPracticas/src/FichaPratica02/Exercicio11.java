package FichaPratica02;

import java.util.Scanner;

public class Exercicio11 {
   public  static void main(String[] args) {
       // Insert data

       Scanner input = new Scanner(System.in);

       // Declaring variables

       double averageBalance, amount,currBalance;


       // Reading averageBalance

       System.out.println("Insert averageBalance:");
       averageBalance = input.nextDouble();

       // Reading amount

       System.out.println("To deposit please use positive number (ex: 100). To withdraw please use a negative number (ex: -100)");
       System.out.println("Insert desired amount :");
       amount = input.nextDouble();




       currBalance= averageBalance+amount;


       if(currBalance<=0) {
           System.out.println("Error!Not enough balance");
       } else {
           System.out.println("Current balance:"+currBalance);
       }

    }
}
