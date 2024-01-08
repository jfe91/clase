public class ExemArray {
    public static void main(String [] args) {

        int[] array = new int[10]; //Declaracion y creacion
        int tamanyo = array.length;

        String[]array2 =  {"Pepe","Maroa","Cata"}; //MANERA 2
        int medida = array.length;
        System.out.println(medida);


        array[3]=7;
        array[9]=array[3]*2;

        for (int indice = 0; indice < tamanyo; indice++)
        {

        //System.out.println(array[indice]);
            System.out.println("Vuelta numero : "+indice+1);
            System.out.println("["+array2[indice]+"]");


        }
    }
}