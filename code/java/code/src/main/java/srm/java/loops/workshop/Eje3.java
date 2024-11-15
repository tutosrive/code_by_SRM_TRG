package srm.java.loops.workshop;

/*
    3. Escribir un programa que pida al usuario un número entero y muestre por pantalla si es un
    número primo o no.
 */

import java.util.Scanner;

public class Eje3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Contadores (primos, divisores)
        int number, divisores = 0;

        // Solicitar un número al usuario y leerlo
        System.out.println("Ingrese número a evaluar: ");
        number = read.nextInt();

        // Cerrar Scanner
        read.close();

        // Verificar los divisores desde 2 hasta el número - 1
        // Se omite el 1 porque todo número es divisible por 1 y por sí mismo
        for (int i = 2; i < number; i++) {
            // Validar si el número es divisble entre (i)
            if (number % i == 0) {
                // De ser así, aumentar el contador de divisores en +1
                divisores++;
            }
        }

        // Si la cantidad de divisores es igual a cero, significa que SÍ es primo
        if (divisores == 0) {
            System.out.println(number + " SÍ es primo!");
        }
        // Si la cantidad de divisores es mayor a cero, significa que NO es primo
        else {
            System.out.println(number + " NO es primo!");
        }
    }
}
