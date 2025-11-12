package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
   public static void main(String[] args) {

       // Declaring variables

       int nrInput,average=0,count=0;

       // Insert data

       Scanner input = new Scanner(System.in);

       //Reading input

       System.out.println("Insert a number :");
       nrInput = input.nextInt();

       while(nrInput != -1) {

           average= average + nrInput; // sums the input with the value 0 of average
           // Reading num
           System.out.println("Insert a number :");
           nrInput = input.nextInt();


           count+=1; // counts the times the average sum is done

       }

       average= average/count; // does the average after each loop
       System.out.println("Average:"+average);





    }
}
