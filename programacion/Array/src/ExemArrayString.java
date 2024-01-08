public class ExemArrayString {
    public static void main(String[] args) {
        String[] palabras = {"alba", "alonso", "hamilton es mejor", "trembolona", "helipuerto"};
        String larga = "";
        int letras = 0;

        for (int index = 0; index < palabras.length; index++) {
            if (palabras[index].length() >= larga.length()) {
                larga = palabras[index];
                letras = larga.length();
            }
        }

        System.out.println("La palabra más larga es: " + larga);
        System.out.println("Tiene " + letras + " letras");
    }
}