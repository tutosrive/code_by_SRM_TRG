package code.java.Loops.workshop;

/*
    3. Escribir un programa que pida al usuario un número entero y muestre por pantalla si es un
    número primo o no.
 */

 import java.util.Scanner;

public class is_prime {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number = 0, divisores = 0;

        System.out.println("Ingrese número a evaluar: ");
        number = read.nextInt();

        read.close();

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                divisores++;
            }
        }

        if (divisores == 0){
            System.out.println(number + " SÍ es primo!");
        } else {
            System.out.println(number + " NO es primo!");
        }
    }
}
