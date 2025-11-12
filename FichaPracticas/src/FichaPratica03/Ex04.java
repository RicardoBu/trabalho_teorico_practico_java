package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Insert data

        Scanner input = new Scanner(System.in);

        int num, nrInput;
        num = 0;

        //Reading num

        System.out.println("Insert a number :");
        nrInput = input.nextInt();

        while (num <= nrInput) {

            System.out.println(num);
            num += 1;

        }
    }
}
