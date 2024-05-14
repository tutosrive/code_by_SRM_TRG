package code.java.Loops;

/*
    El concepto de encontrar los primeros 100 números primos,
    cambia el concepto de ir en un rango definido, la condición ya no será ir hasta el límite del rango, 
    la condición de salida es encontrar 100 primos, no importa el rango
 */

public class first_100PrimeNumbers {
    public static void main(String[] args) { 
        int countPrime = 1, divisores = 0;

        for (int i = 2; countPrime <= 100; i++) {
            // Ciclo para recorrer los números desde 2 hasta 1 número antes que el número a
            // verificar
            // Si number == 6 ciclo irá hasta 5
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    // Aumentar en 1 los divisores
                    divisores++;
                }
            }

            // Si no hay divisores, significa que es primo (se tiene en cuenta que se pasó
            // por alto el 1 y el mismo número)
            if (divisores == 0) {
                // Imprimimos el número primo encontrado
                System.out.println(i);
                // Se aumenta en 1 a 1 el cuantos números primos se han encontrado hasta llegar
                // a 100
                countPrime++;
            }

            // Importante reniciar el valor de los divisore, por cada iteración
            divisores = 0;
        }
    }
}
