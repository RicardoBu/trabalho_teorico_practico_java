package FichaPratica02;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables

        int num1, num2,num3;

        // Reading num1

        System.out.println("Insert number:");
        num1 = nrInput.nextInt();

        // Reading num2

        System.out.println("Insert another  number:");
        num2 = nrInput.nextInt();

        // Reading num3

        System.out.println("Insert another  number:");
        num3 = nrInput.nextInt();



            if(num1<num2 && num2<num3){
                System.out.println("Lowest number:"+num1);
            }
            else if(num2<num1 && num1<num3){
                System.out.println("Lowest number:"+num2);
            }
            else if(num3<num2 && num2<num1) {
                System.out.println("Lowest number:"+num3);
            }





    }
}
