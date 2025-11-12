package FichaPractica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex01 {

    public static void textReader(String caminho) throws FileNotFoundException {


        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);


//             System.out.println(sc.nextLine());
        while(sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }

        sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        textReader("src/Files/exemplo.txt");

    }


}
