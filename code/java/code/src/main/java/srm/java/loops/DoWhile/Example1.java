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
            // Leer datos por teclado (contraseña introducida por el usuario)
            passUser = Keyboard.readT("Ingrese la contraseña: ");

            // Verificar si la contraseña ingresada es igual a la contraseña requerida
            if (passOriginal.equals(passUser)) {
                // Si son iguales, la bandera será true, permitiendo así salir del bucle sin "break"
                correctPass = true;
            } 
            // Si las contraseñas no coinciden
            else {
                // Mostrar mensajes que orienten al usuario
                Printer.werror("¡Contraseña incorrecta!");
                Printer.warning("Intente nuevamente: ");
            }
        }
        // Finalmente se verifica si la bandera sigue siendo falsa, caso contrario sale
        while (!correctPass);

        // Información que verifica la salida correcta
        Printer.winfo("¡Bienvenido al sistema!");
        Printer.warning("Loading...");
    }
}
