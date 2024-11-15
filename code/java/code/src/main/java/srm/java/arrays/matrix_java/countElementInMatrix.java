package srm.java.arrays.matrix_java;

/*
    Realice un programa que dada una matriz de dimensiones (m)x(n) introducida por teclado,
    inserte ceros y unos aleatoriamente en dicha matriz, de forma que una vez llena, 
    cuente cuantos 1 hay. 
*/

//Importar librerías
import java.util.Scanner;

public class countElementInMatrix {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Inicialización de varibles
        int fil = 0, col = 0, amountOne;
        boolean exit = false;
        int[][] matriz;

        // Do-While para verificar filas o columnas menores o iguales a cero (0)
        do {
            System.out.println("Ingrese cantidad de filas: ");
            fil = read.nextInt();
            System.out.println("Ingrese cantidad de columnas: ");
            col = read.nextInt();

            if (fil <= 0 || col <= 0) {
                System.out.println("No se permiten valores negativos o iguales a cero. Intente nuevamente: ");
            } else {
                exit = true;
            }

        } while (!exit);

        read.close();

        // Dar tamaño a la matriz (filas - columnas)
        matriz = new int[fil][col];

        // Llamar funciones
        fillMatriz(matriz);
        amountOne = contOne(matriz);

        // Información sobre los valores de cada posición de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Valor de posición [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }

        // Conteo de unos (1) en la matriz (Salida de información)
        System.out.println("La cantidad de \"unos\" en la matriz es de: " + amountOne);
    }

    // LLenar matriz con números random entre 0 y 1 -> [0, 1]
    public static void fillMatriz(int[][] matriz) {
        int randomN;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                randomN = (int) (Math.random() * 2);
                System.out.println("Número random [0,1]: " + randomN);
                matriz[i][j] = randomN;
            }
        }
    }

    // Conteo de 1's dentro de la matriz que se pasa por valor en parámetro
    public static int contOne(int[][] matriz) {
        int cont = 0;

        // Recorrer filas
        for (int i = 0; i < matriz.length; i++) {
            // Recorrercolumnas
            for (int j = 0; j < matriz[0].length; j++) {
                // Si el valor de la posición matriz[i][j] == 1, se aumenta contador de 1's en
                // +1
                if (matriz[i][j] == 1) {
                    cont++;
                }
            }
        }

        // Se retorna la cantidad de valores 1's en la matriz
        return cont;
    }
}
