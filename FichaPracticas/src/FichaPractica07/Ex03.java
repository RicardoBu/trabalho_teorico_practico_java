package FichaPractica07;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPractica07.Ex01.textReader;
import static FichaPractica07.Ex02.writingFile;




public class Ex03 {

    public static void copyFile(String origem, String destino) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(origem));
        PrintWriter pw = new PrintWriter(new File(destino));

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            pw.println(linha);
        }

        pw.close();



    }

    public static void main(String[] args) throws FileNotFoundException {
        copyFile("src/Files/exemplo.txt","src/Files/exemplo2.txt");

    }
}
