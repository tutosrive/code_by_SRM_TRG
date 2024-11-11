package srm.java.loops.workshop;

import srm.java.own.Keyboard;
import srm.java.own.Printer;

/*
 * 9. Escribe un programa que le pida al usuario que ingrese las notas de un alumno.
 * El programa debe seguir pidiendo notas hasta que el usuario ingrese un -1 (menos uno). 
 * Luego, el programa debe calcular y mostrar el promedio de las notas ingresadas 
*/
public class Eje9 {
    public static void main(String[] args) {
        // Variables requeridas
        float nota, promedio = 0;
        int cantidadNotas = 0;

        // Ejecutar primero y luego verificar la condición de salida
        do {
            // Leer y almacenar nota ingresada
            nota = Keyboard.readF("Ingrese una nota: ");
            // Se toma en cuenta un sistema de notas de 0 a 5 (-1 es laopción de salida)
            if (nota < -1 || nota > 5) {
                Printer.werror("No se permiten notas menores a 0 ni mayores a 5. Si desea salir, ingrese -1.");
                Printer.warning("Intente nuevamente: ");
            }

            // Siempre que la nota ingresada sea mayor a la opción de salida (-1)
            // ¡Esto para evitar restar la nota del promedio!
            if (nota > -1) {
                promedio += nota;
                cantidadNotas++;
            }
        }
        // Una vez ejecutado el bloque do{...}, se verifica la opción de salida
        // (nota == -1; sale del ciclo)
        while (nota != -1);

        // Calcular el promedio
        promedio = promedio / cantidadNotas;
        // Mostrar el promedio por consola
        Printer.wexe("Promedio de notas: " + promedio);
    }
}
