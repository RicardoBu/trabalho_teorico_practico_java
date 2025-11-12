package FichaPratica04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        // Declaring variables
        int val1,val2;

        String yN,operation;

        // Insert data

        Scanner input = new Scanner(System.in);



//       System.out.println("Do you want to start? ");
//        yN= input.next();

        do {

            // Reading val1
            System.out.println("Insert a value :");
            val1 = input.nextInt();
            // Reading val2
            System.out.println("Insert another value :");
            val2 = input.nextInt();

            System.out.println("Insert an arithmetic operation  :");
            operation = input.next();

            switch (operation) {
                case "+":  System.out.println("Result:"+(val1 + val2));
                    break;
                case "-":  System.out.println("Result:"+(val1 - val2));
                    break;
                case "*":  System.out.println("Result:"+(val1 * val2));
                    break;
                case "/":  System.out.println("Result:"+(val1 / val2));
                    break;
                default: System.out.println("Do you wish to continue? ");
                    yN= input.next();



        }
            System.out.println("Do you wish to continue? ");
            yN= input.next();


    } while (yN.equals("yes"));
}
}
