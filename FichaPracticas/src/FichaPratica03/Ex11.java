package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    static void main(String[] args) {
        int num=0, inc,limit;

        // Insert data

        Scanner input = new Scanner(System.in);



        //Reading limit

        System.out.println("Insert a limit number :");
        limit = input.nextInt();

        //Reading increment

        System.out.println("Insert an increment amount :");
        inc = input.nextInt();

        while (num<=limit) {
            System.out.println(num);
            num = num+inc;
        }

    }
}
