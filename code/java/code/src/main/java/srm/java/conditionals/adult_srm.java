package srm.java.conditionals;

/*
    Desarrollar un algoritmo que imprima lo siguiente:
        - Si la persona es mayor o tiene 18 años (Colombia) -> 'Eres mayor de edad.'
        - Si edad menor a 0 (negativa) ó igual a 0 (ilógico) ó edad mayor a 118 (demasiado viejo) -> 'Edad errónea.'
        - Caso contrario -> 'Eres menor de edad.'

    Como nota adicional porfavor comente o imprima el valor que toma un (else)
*/

import srm.java.own.Keyboard;
import srm.java.own.Printer;

public class adult_srm {
    public static void main(String[] args) {
        // Definición de varibales
        int age;

        // Pedir información al usuraio
        // Lectura de datos por teclado (es el Leer del pseudocódigo - pseint)
        age = Keyboard.readI("Ingrese su edad: ");

        // Cerrar el Scanner (ya no permite ingresar más información)
        Keyboard.closeSc();

        // Filtro edades negativas o demasiado grandes
        if (age <= 0 || age > 118) {
            Printer.werror("Edad errónea.");

            // El valor que toma este else es (age > 0 and age < 120)
        } else {
            // Edad mayor ó igual a 18
            if (age >= 18) {
                Printer.wexe("Eres mayor de edad.");

                // El valor que toma este else es (age < 18)
            } else {
                Printer.wexe("Eres menor de edad.");
            }
        }
    }
}