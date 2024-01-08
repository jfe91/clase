public class prueba {
    public static void main(String[] args) {
        String[] palabras = {"alba", "alonso", "hamilton", "trembolona", "helipuerto"};
        String larga = "";
        int letras = 0;

        for (int index = 0; index < palabras.length; index++) {
            if (palabras[index].length() >= letras) {
                larga = palabras[index];
                letras = palabras[index].length();
            }
        }

        System.out.println("La palabra más larga es: " + larga);
        System.out.println("Tiene " + letras + " letras");
    }
}