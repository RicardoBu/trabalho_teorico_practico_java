package FichaPractica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex02 {

    public static void writingFile(String caminho) throws FileNotFoundException {
        String texto = "Um texto qualquer";

        File ficheiro = new File("src/Files/exemplo2.txt");

        PrintWriter writer = new PrintWriter(ficheiro);

        writer.println(texto);
        writer.println("Outro exemplo");

        writer.close();


    }

    static void main(String[] args) throws FileNotFoundException {
        writingFile("src/Files/exemplo2.txt");
    }
}
