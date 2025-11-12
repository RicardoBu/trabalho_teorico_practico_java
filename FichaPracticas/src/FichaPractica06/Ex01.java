package FichaPractica06;

import java.util.Scanner;

public class Ex01 {

    public static String fazerBarulho(String animal) {


        switch(animal) {
            case "Cao": System.out.println("Au au au");
                break;
            case "Gato": System.out.println("“Miau");
                break;
            case "Peixe": System.out.println("“Glub Glub");
                break;
            case "Porco": System.out.println("Oinc oinc");
                break;
            case "Vaca": System.out.println("Muuuu");
                break;
            default: System.out.println("“Invalido");

        }

        return "1";
    }
    public  static void main(String[] args) {
String animal;

        Scanner input = new Scanner(System.in);
        System.out.println("Diga um animal");
        animal = input.next();
        fazerBarulho(animal);




    }
}
