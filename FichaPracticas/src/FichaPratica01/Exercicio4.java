package FichaPratica01;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){

        // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables A = π r²

        double area, radius,PI=3.14;


        // Reading radius

        System.out.println("Insert the radius");
        radius = nrInput.nextInt();

        // Calculate area
        area = PI*radius*radius;

        //Show results

        System.out.println("Area:" + area);
    }


}
