package srm.java.loops.workshop;

import srm.java.own.Keyboard;
import srm.java.own.Printer;

/*
    4. Escribir un programa que pida al usuario una palabra y luego muestre por pantalla una a una
    las letras de la palabra introducida empezando por la última.
 */

public class Eje4 {
    public static void main(String[] args) {
        String word;
        int lenWord;
        char letter;

        word = Keyboard.readT("Ingrese una palabra: ");

        Keyboard.closeSc();

        lenWord = word.length();

        for (int i = lenWord - 1; i >= 0; i--) {
            letter = word.charAt(i);

            Printer.wexe(letter);
        }
    }
}
