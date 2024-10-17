
/*
    1. Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla
    todos los números impares desde 1 hasta ese número separados por comas.
*/
import java.util.Scanner;

public class pares_1_n {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String answer = "Impares: [1";
        int number = 0;

        System.out.println("Ingrese límite (Entero positivo): ");
        number = read.nextInt();

        read.close();

        if (number < 0) {
            System.out.println("No se admiten negativos.");
        } else {
            for (int i = 2; i <= number; i++) {
                if (i % 2 != 0) {
                    answer += ", " + i;
                }
            }

            answer += "]";

            System.out.println(answer);
        }
    }
}