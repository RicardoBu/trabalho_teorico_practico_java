package projecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoesReceita {

    public static void receitaVisitas() throws FileNotFoundException {

//        int  contadorVisitas=0;
        int valorReceitas=0;
        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        //contador de interacções

        String linha = sc.nextLine();

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensLinhaVisita = linha.split(";");
            if(itensLinhaVisita[2].equals("VISITA")){
//                contadorVisitas++;
                valorReceitas+=Double.parseDouble(itensLinhaVisita[5]);

            }

        }
        System.out.println("Receita total das visitas: "+valorReceitas);

    }

    public static void receitaEspectaculos() throws FileNotFoundException{
        int  valorReceitas=0;
        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        String linha = sc.nextLine();

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensLinhaVisita = linha.split(";");
            if (itensLinhaVisita[2].equals("ESPETACULO")) {
                valorReceitas+=Double.parseDouble(itensLinhaVisita[5]);
            }
        }  System.out.println("Receita total dos Espectaculos: "+valorReceitas);
    }

    public static void receitaAlimentacao() throws FileNotFoundException{
        int  valorReceitas=0;
        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        String linha = sc.nextLine();

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensLinhaVisita = linha.split(";");
            if (itensLinhaVisita[2].equals("ALIMENTACAO")) {
                valorReceitas+=Double.parseDouble(itensLinhaVisita[5]);
            }
        }  System.out.println("Receita total da Alimentacao: "+valorReceitas);

    }

    public static void receitaApadrinhamento() throws FileNotFoundException{
        int  valorReceitas=0;
        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        String linha = sc.nextLine();

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensLinhaVisita = linha.split(";");
            if (itensLinhaVisita[2].equals("APADRINHAMENTO")) {
                valorReceitas+=Double.parseDouble(itensLinhaVisita[5]);
            }
        }  System.out.println("Receita total do Apadrinhamento: "+valorReceitas);

    }
}
