package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int num=2,nrInput,evenNr;

        // Insert data

        Scanner input = new Scanner(System.in);

        //Reading input

        System.out.println("Insert a number :");
        nrInput = input.nextInt();

        while(num<=nrInput) {

            evenNr= num%2;
            if(evenNr ==0) {
                System.out.println(num);
                num=num+2;
            }


        }

    }
}
