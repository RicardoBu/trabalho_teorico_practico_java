package FichaExtraCiclos;

public class Ex03 {
    public static void main(String[] args) {

        int i, x, result;
        i = 1;
        x = i + 1;
        while (i < 10) {
            System.out.println("Tabuada de " + i + ":");
            result = i * i;
            System.out.println(i + " * " + i + " = " + result);
            result = i * x;
            System.out.println(i + " * " + x + " = " + result);
            i++;
            x++;


        }

    }
}
