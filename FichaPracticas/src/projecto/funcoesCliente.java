package projecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoesCliente {

    public static void filtrarAnimais() throws FileNotFoundException {

        File ficheiro = new File("FichaPracticas/src/Files/animais.csv");
        Scanner sc = new Scanner( ficheiro);

        int indexDisponivel=0;


        String linha = sc.nextLine();
        while(sc.hasNextLine()) {

            linha = sc.nextLine();
            String[] itensLinha = linha.split(";");

            String habitats = itensLinha[3];

            String[] somaLinhasHabitat = new String[contarLinhasFicheiro("FichaPracticas/src/Files/animais.csv")-1];

               for(int i=0;i<contarLinhasFicheiro("FichaPracticas/src/Files/animais.csv")-1;i++){
                  somaLinhasHabitat[i] = habitats;
               }



            // verificar as repeticoes em habitat
            for( int i=0; i<somaLinhasHabitat.length;i++){
                boolean repetido= false;
                for(int j=0; j<somaLinhasHabitat.length;j++) {
                    if(somaLinhasHabitat[i] == somaLinhasHabitat[j] && i != j){
                        repetido = true;

//                        break;
                    }
                }
                //Imprime habitats sem repeticao
                if(!repetido) System.out.println(" " + somaLinhasHabitat[i] + " ");
            }

            int quantidadeHabitats = indexDisponivel;

            String[] vectorHabitatsAjustado = new String[quantidadeHabitats];
            for( int i=0; i<vectorHabitatsAjustado.length;i++) {
                vectorHabitatsAjustado[i] = somaLinhasHabitat[i];
            }
            System.out.println("Habitats unicos"+vectorHabitatsAjustado);
        }




    }

    public static void jogo(){

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
}
