package FichaPratica01;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables

        int area, perimeter,height,width;

        // Reading height

        System.out.println("Insert the height");
        height = nrInput.nextInt();

        // Reading width

        System.out.println("Insert the height");
        width = nrInput.nextInt();

        // Calculate area
        area = height*width;

        // Calculate perimeter
        perimeter = (2*height) + (2*width);

        //Show results

        System.out.println("Area:" + area);
        System.out.println("Perimeter:" + perimeter);

    }
}
