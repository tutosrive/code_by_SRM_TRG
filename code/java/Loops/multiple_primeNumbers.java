package code.java.Loops;

//En este ejercicio se verificarán si los números en un rango definido son o no primos
//Extraer los números primos en el rango [1 - 100]

import java.util.Scanner;

public class multiple_primeNumbers {
    public static void main(String[] args) {
        // Lectura de datos por teclado
        Scanner read = new Scanner(System.in);

        // Definición de variables
        int limit = 0, divisores = 0;

        // Pedir datos al usuario
        System.out.print("Ingrese el límite del rango: ");
        limit = read.nextInt();

        //Cerrar Scanner
        read.close();

        // Recorrer números desde 2 hasta límite (1 se omite porque no es primo)
        for (int i = 2; i <= limit; i++) {
            // Ciclo para recorrer los números desde 2 hasta 1 número antes que el número a verificar
            for (int j = 2; j < i; j++) {
                // Verificar por cada valor de i si number es divisible exactamente en ese valor
                if (i % j == 0) {
                    // Aumentar en 1 los divisores
                    divisores++;
                }
            }

            // Si no hay divisores, significa que es primo (se tiene en cuenta que se pasó
            // por alto el 1 y el mismo número)
            if (divisores == 0) {
                //Imprimir valores primos
                System.out.println(i);
            }

            //Importante reniciar el valor de los divisore, por cada iteración
            divisores = 0;
        }
    }
}
