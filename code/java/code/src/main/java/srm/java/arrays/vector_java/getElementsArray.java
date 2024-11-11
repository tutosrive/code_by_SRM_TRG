package srm.java.arrays.vector_java;

import srm.java.own.Printer;

public class getElementsArray {
    public static void main(String[] args) {
        int[] temperaturas = new int[20];

        for (int i = 0; i < temperaturas.length; i++) {
            int number = 10 + (int) (Math.random() * (30 - 10 + 1));
            temperaturas[i] = number;
        }

        // Obtener los elementos del array mediante índices
        for (int i = 0; i < temperaturas.length; i++) {
            Printer.wexe("Elemento en índice (" + i + "): " + temperaturas[i]);
        }

        Printer.warning("\n------------------------\n");
        // Obtener elementos directamente
        // For Each
        for (int element : temperaturas) {
            Printer.winfo("Elemento: " + element);
        }
    }
}
