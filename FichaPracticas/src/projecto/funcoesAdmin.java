package projecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPractica07.Ex01.textReader;


public class funcoesAdmin {





    public static void animalMaisPopular() throws FileNotFoundException {
        int valorReceitas = 0;


        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        String linha = sc.nextLine();
        String[] itensLinha = linha.split(";");
//        String animalLinha = itensLinha[3];
        String[] vectorAnimais = new String[contarLinhasFicheiro("FichaPracticas/src/Files/interacoes.csv")];

        // criar array com todos os idAnimals
        for (int i = 0; i < vectorAnimais.length; i++) {
            vectorAnimais[i] = itensLinha[3];
        }

        // ver qual o indice do array vectorAnimais que se repete mais vezes
        for( int i=0;i< vectorAnimais.length-1;i++){
            String maior="";
//            int valorVectorAnimal = Double.parseDouble(vectorAnimais[i]);
            if(contarRepeticoes(vectorAnimais, vectorAnimais[i])>contarRepeticoes(vectorAnimais, vectorAnimais[i+1])){
                  maior= vectorAnimais[i];
                  System.out.println("Maior valor é: "+maior);
            };
        }
//        contarRepeticoes(vectorAnimais, animalLinha);
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


    public static void listarPadrinhosAnimal() throws FileNotFoundException {

        int valorReceitas=0,idAnimal;
        String idAnimalInteracao;

        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);

        String linha = sc.nextLine();
//        String[] itensLinha = linha.split(";");

        System.out.println("Insira um idAnimal:");
        idAnimal = sc.nextInt();

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensLinha = linha.split(";");
            String apadrinhamentos = itensLinha[2];
            if (itensLinha[2].equals("APADRINHAMENTO")) {
                System.out.println("Apadrinhamento: "+itensLinha[2]+" por animal: "+itensLinha[3]);
                System.out.println("Valor mensal de Maio do apadrinhamento: "+itensLinha[2]+" por animal: "+itensLinha[3]);
                System.out.println("Valor mensal de Junho do apadrinhamento: "+itensLinha[2]+" por animal: "+itensLinha[3]);
                System.out.println("Valor mensal de Julho do apadrinhamento: "+itensLinha[2]+" por animal: "+itensLinha[3]);
                System.out.println("Valor mensal de Agosto do apadrinhamento: "+itensLinha[2]+" por animal: "+itensLinha[3]);
                System.out.println("Nome do plano do apadrinhamento: "+itensLinha[4]+" por animal: "+itensLinha[3]);
//
            }
        }

        File ficheiro2 = new File("FichaPracticas/src/Files/clientes.csv");
        Scanner sc2 = new Scanner( ficheiro2);
        String linha2 = sc2.nextLine();

        String[] itensLinha = linha2.split(";");
        String apadrinhamentos = itensLinha[2];

        if (itensLinha[2].equals("PADRINHAMENTO")) {
            System.out.println(itensLinha[1]);
            idAnimalInteracao =  itensLinha[1];

            while(sc2.hasNextLine()) {
                linha = sc2.nextLine();
                if(linha.equals("idCliente")){
                    System.out.println("Nome"+itensLinha[1]+" Email: "+itensLinha[3]);
                }

            }

        }



    }

    public static void espectaculoMaisRentavel() throws FileNotFoundException {
        int valorReceitas=0,contador=0;
        String idAnimalInteracao;

        File ficheiro = new File("FichaPracticas/src/Files/interacoes.csv");
        Scanner sc = new Scanner( ficheiro);


        String linha = sc.nextLine();
        String[] itensLinha = linha.split(";");

        while(sc.hasNextLine()) {
            linha = sc.nextLine();

            String apadrinhamentos = itensLinha[2];
            if (itensLinha[2].equals("ESPETACULO")){

                contador+= Double.parseDouble(itensLinha[5]);
            }
            System.out.println("Receita total dos espectaculos"+contador);
        }
    }



    public static void escolhaFicheiro() throws FileNotFoundException {
        String opcao;

        Scanner input = new Scanner(System.in);


        System.out.println("---- ESCOLHA DE FICHEIRO ---- ");
        //perguntar qual o ficheiro que quer ver
        System.out.println("Qual o ficheiro que pretende abrir? ");
        opcao=input.next();
        switch(opcao) {
            case "animais": textReader("FichaPracticas/src/Files/animais.csv");
                break;
            case "clientes": textReader("FichaPracticas/src/Files/clientes.csv");
                break;
            case "interacoes": textReader("FichaPracticas/src/Files/interacoes.csv");
                break;

        }

    }

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
