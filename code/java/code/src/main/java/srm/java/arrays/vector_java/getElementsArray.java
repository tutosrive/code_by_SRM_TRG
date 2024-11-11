package srm.java.arrays.vector_java;

public class getElementsArray {
    public static void main(String[] args) {
        int[] temperaturas = new int[20];

        for (int i = 0; i < temperaturas.length; i++) {
            int number = 10 + (int) (Math.random() * (30 - 10 + 1));
            temperaturas[i] = number;
        }

        // Obtener los elementos del array mediante índices
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Elemento en índice (" + i + "): " + temperaturas[i]);
        }

        System.out.println("\n------------------------\n");
        // Obtener elementos directamente
        // For Each
        for (int element : temperaturas) {
            System.out.println("Elemento: " + element);
        }
    }
}
