package FichaPractica06;

import java.util.Scanner;

public class Ex03 {

    /**
     * Função que analisa um número e retorna se é par ou impar
     *
     * @param num Número a ser analisado
     * @return true se par || false se ímpar
     */
    public static boolean parImpar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Função que analisa um número e retorna se é positivo ou negativo
     *
     * @param num Número a ser analisado
     * @return true se positivo || false se negativo
     */
    public static boolean positivoNegativo(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Função que analisa um número e retorna se é primo ou não
     *
     * @param num Número a ser analisado
     * @return true se primo || false se não primo
     */
    public static boolean primo(int num) {
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Função que analisa um número e retorna se é perfeito ou não
     *
     * @param num Número a ser analisado
     * @return true se perfeito || false se não perfeito
     */
    public static boolean perfeito(int num) {

        int somaDivisores = 0;

        // numero perfeito = soma de todos os divisores
        // num = soma de todos os divisores
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                somaDivisores = somaDivisores + i;

        }

        if (num == somaDivisores) {
            System.out.println("Numero perfeito");
            return true;

        } else {
            System.out.println("Numero nao perfeito");
            return false;
        }


    }

    /**
     * Função que analisa um número e retorna se é triangular ou não
     *
     * @param num Número a ser analisado
     * @return true se triangular || false se não triangular
     */
    public static boolean triangular(int num) {

        // numero triangular = i(i+1)/2;

        for (int i = 0; i < num; i++) {
            if (((i * (i - 1)) / 2) == num) {

                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um numero:");
        num = input.nextInt();
        triangular(num);
//        perfeito(num);
        if(triangular(num)) {
            System.out.println("Numero triangular");
        } else {
             System.out.println("Numero nao triangular");;
        }

    }
}