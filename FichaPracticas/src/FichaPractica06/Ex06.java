package FichaPractica06;

import java.util.Scanner;
import static FichaPractica06.Ex05.*;

public class Ex06 {

    public static void main(String[] args) {
         int tamanho;
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o tamanho do  vector");
        tamanho= input.nextInt();
         int [] vector = new int [tamanho];
         for(int i=0;i< vector.length;i++) {

             System.out.println("Insira numero para o vector");
             vector[i] = input.nextInt();


         }



         System.out.println("O maior numero é: "+maior(vector));
        System.out.println("O menor numero é: "+menor(vector));
        if (crescente(vector)) {
            System.out.println("O vector  é crescente");
        } else {
            System.out.println("O vector  não é crescente");
        }





    }
}
