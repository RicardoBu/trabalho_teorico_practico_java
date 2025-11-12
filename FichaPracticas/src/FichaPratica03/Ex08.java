package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public  static void main(String[] args) {

        // Insert data

        Scanner input = new Scanner(System.in);
        int num,minNum,maxNum;

        // Reading num1
        System.out.println("Insert a number :");
        num = input.nextInt();
        minNum=num-5;
        maxNum=num+5;



        while( minNum<num  ) {

            System.out.println(minNum);
            minNum+=1;// 5
        }
        while (maxNum>num) {
            System.out.println(maxNum); //10
             maxNum-=1;
        }







    }
}
