package srm.java.java_lang;

public class java_Math1 {
    public static void main(String[] args) {
        /*
         * Habitualmente Math y sus funciones retornan datos de tipo "double"
         * en la mayoría de casos es necesario hacer casteos al dato requerido
         */

        System.out.println("\nPotencias de números: \n");
        /*
         * 
         * Math.pow(double a, double b) => "a" "elevado" a la "b"
         */

        // Elevar 12 al "cuadrado"
        // Casteo a entero a = base, b = exponente
        int a = 12, b = 2;
        int doceCuadrado = (int) Math.pow(a, b);
        System.out.printf("12² = %d%n", doceCuadrado);

        // Elevar arreglo de números al "cubo"
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 90, 567, 345, 5657 };

        // Recorrer los números uno a uno
        for (int n : numeros) {
            a = n; // Base
            b = 3; // Exponente/Potencia
            // De tipo entero, casteo a entero...
            int nCubo = (int) Math.pow(a, b);

            // salida de información
            System.out.printf("%d³ = %d%n", n, nCubo);
        }

        /* ------------------------------------------ */

        System.out.println("\nRaíz cuadrada: \n");
        // Math.sqrt(double a) => Raíz Cuadrada de "a"
        a = 25;
        int raizCuadrada25 = (int) Math.sqrt(a);
        System.out.printf("Raíz Cuadrada de (%d) = %d%n", a, raizCuadrada25);

        // Raízcuadrada de arreglo de números
        int[] numerosA = { 1, 121, 3, 12, 45, 67, 90, 98, 87, 100, 43, 21, 88, 99, 666, 55, 777, 999 };

        // Recorrer números uno a uno
        for (int n : numerosA) {
            a = n;
            // Laraíz cuadrada se necesita en double
            // para después verificar, si tiene decimales, no es raíz exacta y es un error
            // sin embargo...
            double raizCuadradaN = Math.sqrt(a);

            /*
             * Se verifica que se castea todo a entero
             * si el módulo de "raizCuadradaN" es igual al número actual del arreglo
             * si es una raíz exacta
             */
            boolean condicionRaiz = (int) (raizCuadradaN % a) == raizCuadradaN;

            /*
             * Se crea un String con operador ternario
             * si la condición es verdadera sea guarda el valor de lo que nos dió la raíz
             * pero en String, caso contrario (false), se dice que "No existe"
             */
            String raiz = (condicionRaiz) ? String.valueOf((int) raizCuadradaN) : "No existe";

            // Se imprime por consola la información
            System.out.printf("Raíz Cuadrada de (%s) = %s%n", a, raiz);
        }
    }
}
