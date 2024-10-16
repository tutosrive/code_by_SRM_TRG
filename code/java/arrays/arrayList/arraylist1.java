import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> pares = new ArrayList<>();

        // Método add()
        // Aañadir los números 2, 4, 6, 8 y 10 al arreglo pares
        pares.add(2);
        pares.add(4);
        pares.add(6);
        pares.add(8);
        pares.add(10);

        System.out.println("ARREGLO INICIAL: ");

        // imprimir arreglo directamente
        System.out.println(pares);

        // ¿Cuál es la longitud/tamaño del arreglo?
        System.out.println("Longitud/Tamaño arreglo: " + pares.size());

        // Posiciones: (1, 2, 3, 4, 5)
        // Ahora arreglo es igual a: {2, 4, 6, 8, 10}
        // Índices: (0, 1, 2, 3, 4)

        // Método remoce()
        // Eliminar valor del índice 2 (Eliminará el número 6)
        pares.remove(2);

        // Posiciones: (1, 2, 3, 4)
        // Ahora arreglo es igual a: {2, 4, 8, 10}
        // Índices: (0, 1, 2, 3)

        // Método set
        // Reemplazar valor del índice 1 con 12 (Reemplazará el número 4)
        pares.set(1, 12);

        // Posiciones: (1, 2, 3, 4)
        // Ahora arreglo es igual a: {2, 12, 8, 10}
        // Índices: (0, 1, 2, 3)

        System.out.println("ARREGLO FINAL: ");

        // imprimir arreglo directamente
        System.out.println(pares);

        // ¿Cuál es la longitud/tamaño del arreglo?
        System.out.println("Longitud/Tamaño arreglo: " + pares.size());
    }
}
