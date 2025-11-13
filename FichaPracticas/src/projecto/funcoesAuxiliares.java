package projecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class funcoesAuxiliares {

    public static int contarLinhasFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int contadorLinhas = 0;

        while (sc.hasNextLine()) {
            contadorLinhas++;
            sc.nextLine();
        }

        return contadorLinhas;

    }

    public static int[] preencherVetor(int tamanho) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[tamanho];

        // Leitura de números para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }
}
