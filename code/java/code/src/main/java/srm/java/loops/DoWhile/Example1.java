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
            passUser = read.nextLine("Ingrese la contraseña: ");

            if (passOriginal.equals(passUser)) {
                correctPass = true;
            } else {
                System.out.println("¡Contraseña incorrecta!");
                System.out.println("Intente nuevamente: ");
            }
        } while (!correctPass);

        System.out.println("¡Bienvenido al sistema!");
        System.out.println("Loading...");
    }
}
