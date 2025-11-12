package FichaPratica03;

public class Ex07 {
    public static void main(String[] args) {

        int num = 1, sum = 0;

        while (num <= 100) {

            System.out.println(num);
            sum = sum + num;
            num += 1;
            System.out.println("Soma:" + sum);
        }


    }
}
