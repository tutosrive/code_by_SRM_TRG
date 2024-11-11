package srm.java.loops.workshop;

import srm.java.own.Keyboard;
import srm.java.own.Printer;

/*
    2. Escribir un programa que almacene la cadena de caracteres pass123 en una variable,
    pregunte al usuario por la contraseña hasta que introduzca la contraseña correcta.

 */

public class Eje2 {
    public static void main(String[] args) {
        String password = "pass123", passUser;

        do {
            passUser = Keyboard.readT("Ingrese la contraseña correcta: ");

            if (!passUser.equals(password)) {
                Printer.warning("Intente nuevamente: ");
            }
        } while (!passUser.equals(password));

        Keyboard.closeSc();

        Printer.winfo("Bienvenido usuario.\nLoading...");

    }
}
