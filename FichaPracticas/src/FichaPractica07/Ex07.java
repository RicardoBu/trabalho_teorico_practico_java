package FichaPractica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPractica07.Ex01.textReader;

public class Ex07 {
    public static void main(String[] args) throws FileNotFoundException {

        int somaLinhas=0,somaPalavras=0;

        //Ler


        File ficheiro = new File("src/files/exercicio_07.txt");
        Scanner sc = new Scanner(ficheiro);
        Scanner sc2 = new Scanner(ficheiro);



        //Imprimir as linhas e palavras existentes

        while(sc.hasNextLine() ) {
            sc.nextLine();


           somaLinhas+=1;


        }

        while(sc2.hasNext()){
            sc2.next();
            somaPalavras+=1;

        }
        System.out.println("Nr de linhas: "+somaLinhas+" Nr de palavras: "+somaPalavras);

    }
}
