package FichaPractica06;

import java.util.Scanner;

public class Ex02 {

    public static boolean inteiroPositivo( int num) {

      if(num<0) {
          return false;
      } else {
          return true;
      }

    }
    public static void main(String[] args) {
        int num=0;


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Insira um numero");
            num = input.nextInt();
        }


        while(!inteiroPositivo(num)) ;

        for( int i=0;i<num;i++) {
            System.out.print("*");
        }


    }
}
