package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    static void main(String[] args) {


        // Declaring variables
        int times,num,inputTimes=0,cresCount=0, decCount=0;
        String order;

        // Insert data

        Scanner input = new Scanner(System.in);

        // Reading nrQuantity

        System.out.println("How many numbers you want :");
        times = input.nextInt();


        while(times!=0) {


     //Reading num

            System.out.println("Insert a number :");
            inputTimes= input.nextInt();
            times--;

            if(inputTimes>times) {
                cresCount++;

            } else if(inputTimes<times) {
                decCount++;
            }


            // num5>num4>num3>num2>num1
            //num1<num2...


        }
        if( cresCount>0) {
            System.out.println("Increasing");
        }
        if(decCount>0) {
            System.out.println("Decreasing");
        }
    }
}
