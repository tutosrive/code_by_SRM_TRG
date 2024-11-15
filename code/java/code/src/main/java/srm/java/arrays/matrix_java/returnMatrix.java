package srm.java.arrays.matrix_java;

import srm.java.own.Keyboard;
import srm.java.own.Printer;
/*
    Realice un programa que devuelva una matriz de números pares aleatorios.
    Debe crear una función que reciba como argumentos las dimensiones y el rango
    de los números aleatorios que se crearán.
    
    Forma de la Función:
    
    pares_Aleatorios( <dimensión m>, <dimensión n>,<rango mínimo>, <rango
    máximo>)
    
    Nota. Utiliza Math.random() para crear los números aleatorios y limita su
    rango. Pista.
    Puede ser útil el ciclo do-while.
*/
import java.util.Scanner;

public class returnMatrix {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int pares[][];
        String res = "";
        boolean exit = false;

        int fil = 0, col = 0, start = 0, end = 0;

        // Hasta que el usuario no ingrese valores mayores a cero
        do {
            System.out.println("Ingrese la cantidad de filas de la matriz: ");
            fil = read.nextInt();
            System.out.println("Ingrese la cantidad de columnas de la matriz: ");
            col = read.nextInt();

            // verificar si valores son mayores a cero
            if (fil > 0 && col > 0) {
                exit = true;
            } else {
                System.out.println("Intenta nuevamente (No se admiten cantidades menores o iguales a cero (0)): ");
            }
        } while (!exit);

        // Resetear valor de exit
        exit = false;

        // Hasta que el usuario no ingrese un rango bien definido
        do {
            System.out.println("Ingrese inicio del rango: ");
            start = read.nextInt();

            System.out.println("Ingrese final del rango: ");
            end = read.nextInt();

            // No hay un rango inclusivo si valor mínimo a valor máximo
            if (start != end) {
                exit = true;
            } else {
                System.out.println("Intenta nuevamente (valor mínimo no puede ser igual a valor máximo): ");
            }
        } while (!exit);

        // Cerra Scanner
        read.close();

        // Verificar orden en el cual se pasará valor mínimo y máximo a la función
        // El rango puede ser, [1, 100] ó [100, 1]
        // Es lo mismo pero el usuario no comprender orden de las cosas
        if (start < end) {
            // Llamar/almacenar matriz en arreglo
            pares = randomPar(fil, col, start, end);
        } else {
            // Llamar/almacenar matriz en arreglo
            pares = randomPar(fil, col, end, start);
        }

        // Guardar información de salida en (res)
        for (int i = 0; i < pares.length; i++) {
            // Añadir valores de cada fila y columna a la respeusta
            res += "Fila " + (i + 1) + ": | ";

            // Recorrer matriz
            for (int j = 0; j < pares[0].length; j++) {
                // Añadir valores en posición (i,j) de la matriz
                res += pares[i][j] + " ";
            }

            // Añadir retoque final a la salida de cada fila
            res += " |\n";
        }

        System.out.println("\nSALIDA DE INFORMACIÓN: ");

        // Imprimir información almacenada en (res)
        System.out.println(res);
    }

    // Generar matriz con valores pares random en rango pasado por parámetro
    public static int[][] randomPar(int fil, int col, int min, int max) {
        // Crear matriz con dimensiones pasadas por parámetro
        int[][] matriz = new int[fil][col];

        // Declaración de variables
        int par, range = max - min + 1;
        boolean exit = false;

        // For para recorrer longitud de filas de la matriz
        for (int i = 0; i < matriz.length; i++) {
            // For para recorrer columnas de la matriz
            for (int j = 0; j < matriz[0].length; j++) {
                // Hastq que no se genere un número par no se acaba el Do-While
                do {
                    // generar número aleatorio
                    par = min + (int) (Math.random() * range);

                    // Verificar si número random es par
                    if (par % 2 == 0) {
                        // Si es par, se agrega a la matriz y se da paso a la salida del Do-While
                        matriz[i][j] = par;
                        // Valor de salida del Do-While
                        exit = true;
                    }
                } while (!exit);

                // Reiniciar bandera de salida del Do-While
                exit = false;
            }
        }

        // Retornar matriz
        return matriz;
    }

}