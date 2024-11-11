package srm.java.functions;

/*
    Implementar función que retorne la sumatoria 
    de los primeros números naturales hasta n
 */

// Estas son clases que me facilitan el uso de lectura y escritura por consola
import srm.java.own.Keyboard;
import srm.java.own.Printer;

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
        int limit;

        // Pedir información al usuario
        limit = Keyboard.readI("Ingrese el límite (número entero/natural): ");

        // Cerrar Scanner
        Keyboard.closeSc();

        // Procesar información
        Printer.wexe("Suma = " + sumN(limit));
    }
}
