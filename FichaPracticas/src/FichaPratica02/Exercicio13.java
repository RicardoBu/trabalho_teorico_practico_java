package FichaPratica02;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        // Insert data

        Scanner input = new Scanner(System.in);

        // Declaring variables

        int hours, min;
        String pmTime,amTime;

        // Reading hours

        System.out.println("Insert hours:");
        hours = input.nextInt();


        // Reading min

        System.out.println("Insert minutes:");
        min = input.nextInt();


        if(hours>=12) {
            pmTime= (hours-12)+":"+min;
           ;
            System.out.println("Time: "+""+pmTime+"PM");
        } else {
            amTime= hours+":"+min;
            System.out.println("Time: "+""+amTime+"AM");
        }

    }
}
