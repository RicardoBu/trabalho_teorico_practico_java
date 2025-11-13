package projecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoesSoma {

    public static void somaInteracoes() throws FileNotFoundException {
//        textReader("Files/interacoes.csv");
        int contador=0;
        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        //contador de interacções

        String linha = sc.nextLine();



        while(sc.hasNextLine()){

            linha = sc.nextLine();
            contador++;
        }

        System.out.println("Total de interacções: "+contador);




    }

    public static void somaVisitas() throws FileNotFoundException {
        int  contadorVisitas=0;
        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        //contador de interacções

        String linha = sc.nextLine();

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensLinhaVisita = linha.split(";");
            if(itensLinhaVisita[2].equals("VISITA")){
                contadorVisitas++;
            }

        }
        System.out.println("Visitas: "+contadorVisitas);
//        System.out.println("Número de Visitas: "+contadorVisitas);
    }

    public static void somaEspectaculos() throws FileNotFoundException {

        int  contadorEspectaculos=0;
        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        String linha = sc.nextLine();

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensLinhaVisita = linha.split(";");
            if (itensLinhaVisita[2].equals("ESPETACULO")) {
                contadorEspectaculos++;
            }
        }  System.out.println("Espectaculos: "+contadorEspectaculos);

    }

    public static void somaAlimentacao() throws FileNotFoundException{

        int  contadorAlimentacao=0;
        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        String linha = sc.nextLine();

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensLinhaVisita = linha.split(";");
            if (itensLinhaVisita[2].equals("ALIMENTACAO")) {
                contadorAlimentacao++;
            }
        }  System.out.println("Alimentações: "+contadorAlimentacao);

    }

    public static void somaApadrinhamento() throws FileNotFoundException{

        int  contadorApadrinhamento=0;
        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        String linha = sc.nextLine();

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensLinhaVisita = linha.split(";");
            if (itensLinhaVisita[2].equals("APADRINHAMENTO")) {
                contadorApadrinhamento++;
            }
        }  System.out.println("APADRINHAMENTO: "+contadorApadrinhamento);

    }


}
