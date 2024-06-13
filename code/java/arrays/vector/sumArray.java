package code.java.arrays.vector;

//Sumar elementos de dos elementos con la misma longitud, sumar elementos de las mismas posiciones
public class sumArray {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 3 };

        int suma = 0;

        System.out.println("Suma en posiciones:");

        // Para arreglos de la misma longitud
        for (int i = 0; i < array1.length; i++) { 
            suma = array1[i] / array2[i];
            System.out.println("La suma de posición [" + i + "]: " + suma);
        }

    }
}