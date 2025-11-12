package FichaPratica02;

import java.util.Scanner;

public class Exercicio16 {
    public  static void main(String[] args) {

        // Insert data

        Scanner input = new Scanner(System.in);

        // Declaring variables
        int num;
        String nrbills,nrbills200, nrbills100, nrbills50,nrbills20,nrbills10,nrbills5;

        // Reading num1

        System.out.println("Insert number :");
        num = input.nextInt();


        //200,100,50,20,10,5
        if(num >= 200) {
            nrbills200 = (num/200)+"200 EUR bills";
            if(num %200 > 0) {
                nrbills100= nrbills200+ (num/100)+"100 EUR bills";
                if(num%100 >0){
                    nrbills50=nrbills200 + nrbills100+ (num/50)+"50 EUR bills";
                    if(num%50 >0){
                        nrbills20= nrbills200 + nrbills100+ nrbills50+ (num/20)+"20 EUR bills";
                        if(num%20 >0){
                            nrbills10= nrbills200 + nrbills100+ nrbills50+ nrbills20+ (num/10)+"10 EUR bills";
                            if(num%10 >0){
                                nrbills5= nrbills200 + nrbills100+ nrbills50+ nrbills20+ nrbills10+ (num/5)+"5 EUR bills";
                            }
                        }
                    }
                }
            }
           /* nrbills = nrbills200, nrbills100, nrbills50,nrbills20,nrbills10,nrbills5 */

        }








    }
}
