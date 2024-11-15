package srm.java.conditionals;

/*
    Desarrollar un algoritmo que imprima lo siguiente:
        - Si la persona es mayor o tiene 18 años (Colombia) -> 'Eres mayor de edad.'
        - Si edad menor a 0 (negativa) ó igual a 0 (ilógico) ó edad mayor a 118 (demasiado viejo) -> 'Edad errónea.'
        - Caso contrario -> 'Eres menor de edad.'

    Como nota adicional porfavor comente o imprima el valor que toma un (else)
*/

import java.util.Scanner;

public class adult_srm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Definición de varibales
        int age;

        // Pedir información al usuraio
        // Lectura de datos por teclado (es el Leer del pseudocódigo - pseint)
        age = read.nextInt("Ingrese su edad: ");

        // Cerrar el Scanner (ya no permite ingresar más información)
        read.close();

        // Filtro edades negativas o demasiado grandes
        if (age <= 0 || age > 118) {
            System.out.println("Edad errónea.");

            // El valor que toma este else es (age > 0 and age < 120)
        } else {
            // Edad mayor ó igual a 18
            if (age >= 18) {
                System.out.println("Eres mayor de edad.");

                // El valor que toma este else es (age < 18)
            } else {
                System.out.println("Eres menor de edad.");
            }
        }
    }
}