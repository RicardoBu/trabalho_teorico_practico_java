package FichaPratica01;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args){
        // Insert data

        Scanner nrInput = new Scanner(System.in);

        // Declaring variables

        double
          hourTime, minTime,secondsTime,sumMinutes,sumSeconds,
          minSong1,secondsSong1, minSong2,
           secondsSong2,minSong3,secondsSong3,
          minSong4,secondsSong4,minSong5,secondsSong5;

        // Reading song1

        System.out.println("Insert minutes first music");
      minSong1 = nrInput.nextInt();

        System.out.println("Insert seconds first music");
        minSong1 = nrInput.nextInt();
       secondsSong1 =  nrInput.nextInt();

        // Reading song2
        System.out.println("Insert minutes second music");
        minSong2 = nrInput.nextInt();

        System.out.println("Insert seconds second music");
        secondsSong2 =  nrInput.nextInt();

        //Reading song3
        System.out.println("Insert minutes third music");
        minSong3 = nrInput.nextInt();

        System.out.println("Insert seconds third music");
        secondsSong3 =  nrInput.nextInt();

        //Reading song4

        System.out.println("Insert minutes fourth music");
        minSong4 = nrInput.nextInt();
        System.out.println("Insert seconds third music");
        secondsSong4 =  nrInput.nextInt();

        //Reading song5
        minSong5 = nrInput.nextInt();
        System.out.println("Insert minutes fifth music");
        minSong5 = nrInput.nextInt();

        System.out.println("Insert seconds fifth music");
        secondsSong5 =  nrInput.nextInt();


        // Calculate time
        sumMinutes = minSong1+minSong2+minSong3+minSong4+minSong5;
        hourTime = sumMinutes/60;
        minTime =  hourTime -60;
        sumSeconds = secondsSong1+secondsSong2+secondsSong3+secondsSong4+secondsSong5;
        secondsTime =  (minTime -sumSeconds)/60;


                //Show results

                System.out.println("Total Album:" + hourTime + "h" + minTime + "m" + secondsTime + "s"); // valor impresso nr2



    }
}