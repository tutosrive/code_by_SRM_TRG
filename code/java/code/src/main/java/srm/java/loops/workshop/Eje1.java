package srm.java.loops.workshop;

import srm.java.own.Keyboard;
import srm.java.own.Printer;

/*
    1. Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla
    todos los números impares desde 1 hasta ese número separados por comas.
*/

public class Eje1 {
    public static void main(String[] args) {
        String answer = "Impares: [1";
        int number;

        number = Keyboard.readI("Ingrese límite (Entero positivo): ");

        Keyboard.closeSc();

        if (number < 0) {
            Printer.werror("No se admiten negativos.");
        } else {
            for (int i = 2; i <= number; i++) {
                if (i % 2 != 0) {
                    answer += " " + i;
                }
            }

            answer += "]";

            Printer.wexe(answer);
        }
    }
}