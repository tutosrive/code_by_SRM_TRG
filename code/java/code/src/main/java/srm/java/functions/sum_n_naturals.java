package srm.java.functions;

/*
    Implementar función que retorne la sumatoria 
    de los primeros números naturales hasta n
 */
//Importar Scanner (Entrada de datos por teclado)
import java.util.Scanner;

public class sum_n_naturals {

    // Método - Función sumar primeros n números
    public static int sumN(int n) {
        // Variables necesarias
        int sum = 0;

        // Ejecutar n veces
        for (int i = 1; i <= n; i++) {
            // Por cada vuelta sumar i a variable sum
            sum += i;
        }
        // Retornar valor final de la suma
        return sum;
    }

    // Método principal archivo
    public static void main(String[] args) {
        // Variables necesarias
        Scanner read = new Scanner(System.in);
        int limit = 0;

        // Pedir información al usuario
        System.out.println("Ingrese el límite entero: ");
        limit = read.nextInt();

        // Cerrar Scanner
        read.close();

        // Procesar información
        System.out.println(sumN(limit));
    }
}
