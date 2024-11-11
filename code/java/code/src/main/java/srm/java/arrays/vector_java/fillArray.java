package srm.java.arrays.vector_java;

import srm.java.own.Printer;

public class fillArray {
    public static void main(String[] args) {
        int[] temperaturas = new int[20];

        // En un rango de la misma longitud de temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            // Generar un número aleatrorio entre 1 y 30
            int number = 10 + (int) (Math.random() * (30 - 10 + 1));
            // Agregar el número aleatorio generado al arreglo/vector de temperaturas
            temperaturas[i] = number;
        }

        // Imprimir por consola los temperaturas agregadas
        for (int n : temperaturas) {
            Printer.wexe(n);
        }
    }
}
