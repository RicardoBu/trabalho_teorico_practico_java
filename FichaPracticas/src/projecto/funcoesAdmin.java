package projecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPractica07.Ex01.textReader;
import static projecto.funcoesAuxiliares.*;

public class funcoesAdmin {

    public static void somaInteracoes() throws FileNotFoundException {
//        textReader("Files/interacoes.csv");
        int contador=0;
        File ficheiro = new File("Files/interacoes.csv");
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
        File ficheiro = new File("Files/interacoes.csv");
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
        File ficheiro = new File("Files/interacoes.csv");
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
        File ficheiro = new File("Files/interacoes.csv");
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
        File ficheiro = new File("Files/interacoes.csv");
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

    public static void receitaVisitas() throws FileNotFoundException{

//        int  contadorVisitas=0;
        int valorReceitas=0;
        File ficheiro = new File("Files/interacoes.csv");
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
        File ficheiro = new File("Files/interacoes.csv");
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
        File ficheiro = new File("Files/interacoes.csv");
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
        File ficheiro = new File("Files/interacoes.csv");
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

    public static void animalMaisInteracoes() throws FileNotFoundException{
        int  valorReceitas=0;
        File ficheiro = new File("Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        String linha = sc.nextLine();
        String[] itensLinhaVisita = linha.split(";");

//        for(int i=0; i<){
//
//        }

    }

    public static void animalMaisPopular() throws FileNotFoundException {
        int valorReceitas = 0;

        File ficheiro = new File("Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        String linha = sc.nextLine();
        String[] itensLinha = linha.split(";");
        String animalLinha = itensLinha[3];
        String[] vectorAnimais = new String[contarLinhasFicheiro("Files/interacoes.csv")];

        // criar array com todos os idAnimals
        for (int i = 0; i < vectorAnimais.length; i++) {
            vectorAnimais[i] = itensLinha[3];
        }
        contarRepeticoes(vectorAnimais, animalLinha);
    }

    public static int contarRepeticoes(String[] vector, String valor) throws FileNotFoundException {
        int contador = 0;

   // contador a cada vector[i]
            for (int i = 0; i < vector.length; i++) {

                    if (vector[i].equals(valor)) {
                        contador++;
                    }

            }


        return contador;
    }



    public static void escolhaFicheiro() throws FileNotFoundException {
        String opcao;

        Scanner input = new Scanner(System.in);


        System.out.println("---- ESCOLHA DE FICHEIRO ---- ");
        //perguntar qual o ficheiro que quer ver
        System.out.println("Qual o ficheiro que pretende abrir? ");
        opcao=input.next();
        switch(opcao) {
            case "animais": textReader("Files/animais.csv");
                break;
            case "clientes": textReader("Files/clientes.csv");
                break;
            case "interacoes": textReader("Files/interacoes.csv");
                break;

        }

    }
}
