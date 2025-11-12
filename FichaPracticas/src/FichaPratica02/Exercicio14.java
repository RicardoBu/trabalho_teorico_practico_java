package FichaPratica02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        // Insert data

        Scanner input = new Scanner(System.in);

        // Declaring variables
        int num1, num2, num3;
        String result;


        // Reading num1

        System.out.println("Insert number 1:");
        num1 = input.nextInt();

        // Reading num2

        System.out.println("Insert number 2:");
        num2 = input.nextInt();

        // Reading num3

        System.out.println("Insert number 3:");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            if(num2<num3){
                result = num1 + ">" + num2 + ">" + num3;
                System.out.println(result);
                // 1 2 3
            }else{
                result = num1 + ">" + num3 + ">" + num2;
                System.out.println(result);
                // 1 3 2
            }
        }

        else if (num2 < num1 && num2 < num3) {
            if(num1<num3) {
                result = num2 + ">" + num1 + ">" + num3;
                System.out.println(result);
                //2 1 3
            } else {
                result = num2 + ">" + num3 + ">" + num1;
                System.out.println(result);
                // 2 3 1
            }

        } else if (num3< num2 && num3<num1) {
             if (num2 < num1 ) {
                result = num3 + ">" + num2 + ">" + num1;
                System.out.println(result);
                // 3 2 1
            } else   {
                result = num3 + ">" + num1 + ">" + num2;
                System.out.println(result);
                // 3 1 2

        }


        }
    }
}
