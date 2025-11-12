package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        int [] array = new int[10];
        int highestEvenNumber =-1;

        for(int i=0; i<array.length;i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Insert a number on array[" +i+"] ");

            array[i] = input.nextInt();

        }

        for(int i=0;i< array.length;i++) {

            if(array[i]%2 ==0) {
             if(highestEvenNumber == -1) {
                 highestEvenNumber = array[i];
             }
             if(array[i]> highestEvenNumber) {
                 highestEvenNumber= array[i];
             }
            }

        }

        if(highestEvenNumber==-1 ) {
            System.out.println("No even numbers ");
        }
        else {
            System.out.println("The highest even number"+highestEvenNumber);
        }



//        for(int i=0;i< array.length;i++) {
//
//            if(array[i]%2==0){
//                if(highestEvenNumber>array[i]){
//                    array[i] = highestEvenNumber;
//                    System.out.println("Highest:"+highestEvenNumber);
//
//                }
//            }
//
//        }

    }
}
