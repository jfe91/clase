import java.util.Random;

public class ExemArray4 {
    public static void main(String[] args) {
        // Creo dos arrays de longitud aleatoria
        Random rand = new Random();
        int longitud1 = rand.nextInt(10) + 1;
        int longitud2 = rand.nextInt(10) + 1;

        int[] a1 = new int[longitud1];
        int[] a2 = new int[longitud2];

        // Lleno los arrays con números aleatorios
        for (int i = 0; i < a1.length; i++) {
            a1[i] = rand.nextInt(100); // Números aleatorios del 0 al 99
        }

        for (int i = 0; i < a2.length; i++) {
            a2[i] = rand.nextInt(100); // Números aleatorios del 0 al 99
        }

        // Determino la longitud del tercer array
        int longitud3 = Math.max(a1.length, a2.length);
        int[] a3 = new int[longitud3];

        // Comparo los elementos de a1 y a2 y llenar a3
        for (int i = 0; i < longitud3; i++) {
            if (i < a1.length && i < a2.length) {
                if (a1[i] >= a2[i]) {
                    a3[i] = a1[i];
                } else {
                    a3[i] = a2[i];
                }
            } else if (i < a1.length) {
                a3[i] = a1[i];
            } else {
                a3[i] = a2[i];
            }
        }

        // Imprime los arrays
        System.out.println("Array 1: " + java.util.Arrays.toString(a1));
        System.out.println("Array 2: " + java.util.Arrays.toString(a2));
        System.out.println("Array 3: " + java.util.Arrays.toString(a3));
    }
}
