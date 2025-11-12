package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // Declaring variables

        int nrInput=1,firstIntInit=0,firstIntEnd=25,countFirstInt=0,
                secondIntInit=26,secondIntEnd=50,countSecondInt=0,
                thirdIntInit=51,thirdIntEnd=75,countThirdInt=0,
               fourthIntInit=76, fourthIntEnd=100, countFourthInt=0;

        // Insert data

        Scanner input = new Scanner(System.in);

        //Reading input



        while(nrInput>=0) {


            // Reading num
            System.out.println("Insert a number :");
            nrInput = input.nextInt();

            if(nrInput>=firstIntInit && nrInput<=firstIntEnd ) {
                countFirstInt++;

            }
            if(nrInput>=secondIntInit && nrInput<=secondIntEnd ) {
                countSecondInt++;

            }
            if(nrInput>=thirdIntInit && nrInput<=thirdIntEnd ) {
                countThirdInt++;

            }
            if(nrInput>=fourthIntInit && nrInput<=fourthIntEnd ) {
                countFourthInt++;

            }


        }
        System.out.println("[0,25] :"+countFirstInt);
        System.out.println("[26,50] :"+countSecondInt);
        System.out.println("[51,75] :"+countThirdInt);
        System.out.println("[76,100] :"+countFourthInt);

    }
}
