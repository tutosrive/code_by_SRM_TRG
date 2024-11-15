package srm.java.arrays.matrix_java;

import java.util.Scanner;

public class order_matrix {

    /*
     * Realiza una función que reciba una matriz con números decimales y la forma de
     * ordenarlos (ascendente o descendente). La función debe retornar una matriz
     * ordenada, adicionalmente imprimir sus elementos y el promedio.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[][] matriz = new double[200][10];

        char orden;
        String message = "";
        boolean exit = false;

        do {
            // Pedir información al usuario
            orden = read.next("Ingrese 'a' para ordenar 'Ascendente', 'd' para ordenar 'Descendente': ").charAt(0);

            switch (orden) {
                case 'a':
                    exit = true;
                    message = "ASCENDENTE";
                    break;
                case 'd':
                    exit = true;
                    message = "DESCENDENTE";
                    break;

                default:
                    System.out.println(
                            "Ingresa un sólo carácter (a -> Ascendente / 'd' -> Descente). Intenta nuevamente: ");
                    break;
            }
        } while (!exit);

        // Cerrar Scanenr
        read.close();

        // Llenar matriz con números decimales (coma flotante) aleatorios
        fillMatriz(matriz);

        // Salida de información relevante (Conocer valores dados en posiciones (filas -
        // columnas) sin ordenar)
        System.out.println("VALORES ORIGINALES (SIN ORDENAR):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Valor de posición [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }

        // Salida de información y llamado a la función que ordena la matriz
        System.out.println("Matriz ordenada de forma " + message + ": ");
        ordenarMatriz(orden, matriz);

        // Salida de información (Matriz ordenada, imprime cada valor en posición filas
        // - columnas)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Valor de posición [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }

        System.out.println("ELEMENTOS DE MATRIZ ");
        // Imprimir elementos y promedio
        printElements(matriz);
    }

    // LLenar matriz con números random entre 0 y 1 -> [0, 10)
    public static void fillMatriz(double[][] matriz) {
        double randomN;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                // Número aleatorio entre 0 y 10 (double)
                randomN = Math.random() * 10;
                matriz[i][j] = randomN;
            }
        }
    }

    // Ordenar matriz según el tipo de orden especificado
    public static void ordenarMatriz(char orden, double[][] matriz) {
        double centinela;

        switch (orden) {
            case 'a':
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length - 1; j++) {
                        for (int k = 0; k < matriz[0].length - 1; k++) {
                            // Verificar si posición de la izquierda mayor a posición derecha
                            if (matriz[i][k] > matriz[i][k + 1]) {
                                // Guardar valor de la derecha para no perderse
                                centinela = matriz[i][k + 1];
                                // Sobreescribir posición derechacon posición izquierda (izquierda mayor que
                                // derecha)
                                matriz[i][k + 1] = matriz[i][k];
                                // Sobreescribir valor izquierda con valor centinela (Valor guardado de la
                                // derecha)
                                matriz[i][k] = centinela;
                            }
                        }
                    }
                }
                break;
            case 'd':
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length - 1; j++) {
                        for (int k = 0; k < matriz[0].length - 1; k++) {
                            // Verificar si posición de la izquierda menor a posición derecha
                            if (matriz[i][k] < matriz[i][k + 1]) {
                                // Guardar valor de la derecha para no perderse
                                centinela = matriz[i][k + 1];
                                // Sobreescribir posición derechacon posición izquierda (izquierda menor que
                                // derecha)
                                matriz[i][k + 1] = matriz[i][k];
                                // Sobreescribir valor izquierda con valor centinela (Valor guardado de la
                                // derecha)
                                matriz[i][k] = centinela;
                            }
                        }
                    }
                }
                break;
            default:
                System.out.println("¡Opción no válida!");
                break;
        }
        // Ascendente
        // Descendente
    }

    public static void printElements(double[][] matriz) {
        String res = "";
        double suma = 0.0, promedio;
        for (int i = 0; i < matriz.length; i++) {
            res += "|";
            for (int j = 0; j < matriz[0].length; j++) {
                res += String.format("%.3f    ", matriz[i][j]);
                suma += matriz[i][j];
            }
            res += "\b\b\b\b|\n";
        }

        promedio = suma / matriz.length;

        System.out.println(res);
        System.out.println("PROMEDIO ES: " + promedio);
    }

}