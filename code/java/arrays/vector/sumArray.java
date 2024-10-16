package code.java.arrays.vector;

//Sumar elementos de dos elementos con la misma longitud, sumar elementos de las mismas posiciones
public class sumArray {
    public static void main(String[] args) {
        // Arreglos de enteros
        int[] array1 = { 1, 2, 3 }; 
        int[] array2 = { 1, 2, 3 };

        // Variable de suma
        int suma = 0;

        // Salida de información
        System.out.println("Suma en posiciones:");

        // Para arreglos de la misma longitud
        for (int i = 0; i < array1.length; i++) { 
            // la suma será igual a la suma de los elementos de ambos arreglos en 
            // la posición i (0, 1, 2)
            suma = array1[i] + array2[i];
            // Imprimir por consola la suma de cada posición
            System.out.println("La suma de posición [" + i + "]: " + suma);
        }

    }
}