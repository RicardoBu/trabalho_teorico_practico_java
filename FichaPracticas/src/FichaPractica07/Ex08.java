package FichaPractica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {


    public static void main() throws FileNotFoundException {

        // read

        Scanner in = new Scanner(new File("src/files/exercicio_08.csv"));



        double valorTotal = 0, valorLimpoProducto = 0, valorPrecoLimpo = 0;

        String line = in.nextLine();

        while (in.hasNextLine()) {
            line = in.nextLine();
            String[] lineItems = line.split(",");

            valorLimpoProducto = Double.parseDouble(lineItems[2]);
            valorPrecoLimpo = Double.parseDouble(lineItems[3]);

            valorTotal += valorLimpoProducto * valorPrecoLimpo;




        }
        System.out.println("Total: " + valorTotal);


    }
}
