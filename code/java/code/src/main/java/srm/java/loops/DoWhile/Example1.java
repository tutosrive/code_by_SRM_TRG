package srm.java.loops.DoWhile;

import srm.java.own.Keyboard;
import srm.java.own.Printer;

/*
 * Solicita al usuario que ingrese una contraseña. Si la contraseña no 
 * es correcta, pide que la ingrese nuevamente hasta que coincida con la esperada.
*/

public class Example1 {
    public static void main(String[] args) {
        String passOriginal = "AsñDf", passUser;
        boolean correctPass = false;

        do {
            passUser = Keyboard.readT("Ingrese la contraseña: ");

            if (passOriginal.equals(passUser)) {
                correctPass = true;
            } else {
                Printer.werror("¡Contraseña incorrecta!");
                Printer.warning("Intente nuevamente: ");
            }
        } while (!correctPass);

        Printer.winfo("¡Bienvenido al sistema!");
        Printer.warning("Loading...");
    }
}
