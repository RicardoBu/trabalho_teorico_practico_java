package FichaPractica06;

public class Ex05 {

    public static int maior(int[] vector) {
        int maiorValor=vector[0];
        for(int i=0;i< vector.length;i++) {

            if(vector[i]>maiorValor) {
                maiorValor=vector[i];
                // 2>3

            }
        }

        return maiorValor;
    }


    public static int menor(int[] vector) {
        int menorValor=vector[0];
        for(int i=0;i< vector.length;i++) {

            if(vector[i]<menorValor) {
                menorValor=vector[i];
                // 2>3

            }
        }




        return menorValor;
    }


    public static boolean crescente(int[] vector) {
        boolean crescente=true;
        for(int i=1;i< vector.length;i++) {

//            if(vector[i]>vector[i+1]) {
                 if (vector[i]> vector[i-1]) {
                   return crescente;
                // vector[0]>vector[1]
                // vector[1]>vector[2]

            }
        }




        return !crescente;
    }
}
