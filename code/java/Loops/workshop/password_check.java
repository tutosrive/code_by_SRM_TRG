/*
    2. Escribir un programa que almacene la cadena de caracteres pass123 en una variable,
    pregunte al usuario por la contraseña hasta que introduzca la contraseña correcta.

 */

import java.util.Scanner;

public class password_check {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String password = "pass123", passUser = "";

        do {
            System.out.println("Ingrese la contraseña correcta: ");
            passUser = read.nextLine();

            if (!passUser.equals(password)) {
                System.out.println("Intente nuevamente: ");
            }
        } while (!passUser.equals(password));

        read.close();

        System.out.println("Bienvenido usuario.\nLoading...");

    }
}
