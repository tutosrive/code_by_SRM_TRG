package srm.java.loops;

import srm.java.own.Keyboard;
import srm.java.own.Printer;

//Verificar si un sólo número es primo

/*
    Un número es primo si y solo si tiene 2 divisores, el 1 y el mismo número,
    en matemática es así, pero en lógica de programación cambia, no es necesario comprobar 
    de divisor el número 1, todo número es divisble entre 1, y tampoco el mismo número, todo 
    número es divisible por sí mismo.
 */
public class one_numberCousin {
    public static void main(String[] args) {
        // Número a verificar
        int number, divisores = 0;

        // Ingresar el número a verificar si es primo
        number = Keyboard.readI("Ingrese un número a verificar si es primo: ");

        // Cerrar Scanner
        Keyboard.closeSc();

        // Ciclo para recorrer los números desde 2 hasta 1 número antes que el número a
        // verificar
        // Si number == 6 ciclo irá hasta 5
        for (int i = 2; i < number; i++) {
            // Verificar por cada valor de i si number es divisible exactamente en ese valor
            // i
            // Cuando i = 2 y number = 8
            // Si 8 % 2 == 0 (esto es verdadero) se sumará un divisor más
            if (number % i == 0) {
                // Aumentar en 1 los divisores
                divisores++;
            }
        }

        // Si no hay divisores, significa que es primo (se tiene en cuenta que se pasó
        // por alto el 1 y el mismo número)
        if (divisores == 0) {
            Printer.wexe(number + " SÍ es primo.");
        } else {
            Printer.wexe(number + " NO es primo.");
        }
    }
}
