import java.util.*;

public class ExemArray3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int total = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número (entre 0 y 20):");
        int numero = teclado.nextInt();

        // Llenamos el array
        for (int indice = 0; indice < array.length; indice++) {
            array[indice] = (int) (Math.random() * 20 + 1);
        }

        // Contamos cuántas veces aparece el número en el array
        for (int indice = 0; indice < array.length; indice++) {
            if (array[indice] == numero) {
                total++;
            }
        }

        // Imprimimos el contenido del array
        System.out.println("El array contiene los siguientes elementos:");
        for (int indice = 0; indice < array.length; indice++) {
            System.out.println("[" + array[indice] + "]");
        }

        // Mostramos el resultado
        if (total == 0) {
            System.out.println("\nEl número " + numero + " no se encuentra en el array.");
        } else {
            System.out.println("\nSe ha encontrado el número " + numero + " " + total + " veces.");
        }
    }
}