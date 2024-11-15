package srm.java.loops.DoWhile;

import srm.java.own.Keyboard;
import srm.java.own.Printer;

/*
 * Solicita al usuario que ingrese una contraseña. Si la contraseña no 
 * es correcta, pide que la ingrese nuevamente hasta que coincida con la esperada.
*/

public class Example1 {
    public static void main(String[] args) {
        // Variables que serán usadas
        String passOriginal = "AsñDf", passUser;
        // Variable bandera ver (https://keepcoding.io/blog/uso-de-banderas-en-bucles-while/#%C2%BFQue_son_las_banderas_en_bucles_while)
        boolean correctPass = false;

        // Ejecutar bloque al menos una vez
        do {
            passUser = read.nextLine("Ingrese la contraseña: ");

            // Verificar si la contraseña ingresada es igual a la contraseña requerida
            if (passOriginal.equals(passUser)) {
                // Si son iguales, la bandera será true, permitiendo así salir del bucle sin "break"
                correctPass = true;
            } else {
                System.out.println("¡Contraseña incorrecta!");
                System.out.println("Intente nuevamente: ");
            }
        }
        // Finalmente se verifica si la bandera sigue siendo falsa, caso contrario sale
        while (!correctPass);

        System.out.println("¡Bienvenido al sistema!");
        System.out.println("Loading...");
    }
}
