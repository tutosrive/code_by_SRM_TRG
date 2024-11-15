package srm.java.loops.workshop;

import java.util.Scanner;

/*
    5. Escribir un programa en el que se pregunte al usuario por una frase y una letra, y muestre por
    pantalla el número de veces que aparece la letra en la frase.
 */

public class Eje5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Variable donde se almacenará la frase
        String frase;
        // Variable donde se almacenará la letra a buscar
        char letter;
        // Contador de letras incializado en 0
        int count = 0;

        System.out.println("Ingrese una frase: ");
        // Se pide al usuario una frase y se lee por teclado
        frase = read.nextLine().toLowerCase(); // Frase en minúscula

        // Se pide al usuario una letra y se lee por teclado
        // Leer en índice 0, y letra en minúscula
        System.out.println("Ingrese una letra: ");
        letter = read.next().toLowerCase().charAt(0);

        read.close();

        // Recordar que el String, es un arreglo de "char" y puede ser convertido a un
        // array por tanto
        for (char let : frase.toCharArray()) {
            // Se verifica letra por letra
            if (letter == let) {
                // Si la letra actual del String, es igual a la buscada por el usuario, aumentar
                // contador
                count++;
            }
        }

        // Se verifica que el contador sea mayor a cero
        if (count > 0) {
            // Si se repite más de una vez
            if (count > 1) {
                System.out.println("La letra " + letter + ", se repite " + count + " veces");
            }
            // SI se repite sólo una vez
            else {
                System.out.println("La letra" + letter + " se repite una única vez.");
            }
        }
        // En el caso que la letra buscada por el usuario no está en la frase
        else {
            System.out.println("No se encontró la letra " + letter + ", en " + frase);
        }
    }
}