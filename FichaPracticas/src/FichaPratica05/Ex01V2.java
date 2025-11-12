package FichaPratica05;

import java.util.Scanner;

public class Ex01V2 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] vector = new int[10];

        for(int i=0;i< vector.length;i++) {
            System.out.println("Insira um numero no Array["+i+"]");
            vector[i] = input.nextInt();


        }

        for(int i=0;i<vector.length;i++) {
            System.out.println(vector[i]);
        }


    }
}
