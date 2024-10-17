/*
    5. Escribir un programa en el que se pregunte al usuario por una frase y una letra, y muestre por
    pantalla el número de veces que aparece la letra en la frase.
 */

import java.util.Scanner;

public class count_letter_repeated {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String frase = "";
        char letter;
        int count = 0;

        System.out.println("Ingrese una frase: ");
        frase = read.nextLine();

        System.out.println("Ingrese una letra: ");
        letter = read.next().charAt(0);

        read.close();

        for (char let : frase.toCharArray()) {
            if (letter == let) {
                count++;
            }
        }

        if (count > 0) {
            if (count > 1) {
                System.out.println("'" + letter + "'" + ", se repite " + count + " veces.");
            } else {
                System.out.println(letter + ", no se repite (Solo está una vez)");
            }
        } else {
            System.out.println("No se encontró la letra en: " + frase);
        }
    }
}