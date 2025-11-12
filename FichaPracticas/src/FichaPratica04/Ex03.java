package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Declaring variables
        int value1,value2, tries;

        Scanner input = new Scanner(System.in);

        System.out.println("Player1:Insert a value between 0 and 100");
        value1= input.nextInt();

        System.out.println("Player2:Insert a value between 0 and 100");
        value2= input.nextInt();




        while( value1!=value2) {

            if(value1>value2) {
                System.out.println("Value2 is smaller than value1");
            } else {
                System.out.println("Value2 is bigger than value1");
            }

            System.out.println("Try again");
            System.out.println("Player2:Insert a value between 0 and 100");
            value2= input.nextInt();


        }


    }
}
