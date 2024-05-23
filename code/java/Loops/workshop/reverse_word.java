package code.java.Loops.workshop;

/*
    4. Escribir un programa que pida al usuario una palabra y luego muestre por pantalla una a una
    las letras de la palabra introducida empezando por la última.
 */

import java.util.Scanner;

public class reverse_word {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String word = "";
        int lenWord = 0;
        char letter;

        System.out.println("Ingrese una palabra: ");
        word = read.nextLine();

        read.close();

        lenWord = word.length();

        for (int i = lenWord - 1; i >= 0; i--){
            letter = word.charAt(i);

            System.out.println(letter);
        }
    }
}
