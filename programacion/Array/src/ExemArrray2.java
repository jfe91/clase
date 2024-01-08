import java.util.Scanner;

public class ExemArrray2 {
    private static int indice;

    public static void main(String[] args) {
        int[] array = new int[15];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Tu array tiene los siguientes valores:");

        for (int indice=0; indice < array.length; indice++) {
            array[indice] = (int) (Math.random()*100+1);
        }

        for (int indice=0; indice < array.length; indice ++);
        {
            System.out.println("[" + array[indice] + "]");

        }


    }
}
