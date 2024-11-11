package srm.java.own;

import java.io.PrintStream;

public class Printer {
    private Printer() {
        //////
    }

    // Colores para textos en consola
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    // Variables privadas
    private static final PrintStream sout = System.out;

    /**
     * Imprimir mensaje por consola, con información (color de fuente: Azul)
     * 
     * @param message String. Mensaje a imprimir por consola
     */
    public static void winfo(Object message) {
        wf("%s%s%s", BLUE, message.toString(), RESET);
    }

    /**
     * Imprimir "advertencia" por consola, con información (color de fuente:
     * Amarillo)
     * 
     * @param message String. Mensaje a imprimir por consola
     */
    public static void warning(Object message) {
        try {
            wf("%s%s%s", YELLOW, message.toString(), RESET);
        } catch (Exception e) {
            werror(e);
        }
    }

    /**
     * Imprimir mensaje por consola, con información de ejecución (color de fuente:
     * Verde)
     * 
     * @param message String. Mensaje a imprimir por consola
     */
    public static void wexe(Object message) {
        try {
            wf("%s%s%s", GREEN, message, RESET);
        } catch (Exception e) {
            werror(e);
        }
    }

    /**
     * Imprimir mensaje por consola, con información (color de fuente: Azul)
     * 
     * @param format  String. Cadena de texto con el formato preferido
     * @param formats Object... Arreglo de "String" con el contenido de los formatos
     */
    public static void wf(String format, Object... formats) {
        try {
            sout.printf(format + "%n", formats);
        } catch (Exception e) {
            werror(e);
        }
    }

    /**
     * Imprimir error por consola (color de fuente: Rojo)
     * 
     * @param e Exception. Excepción a imprimir
     */
    public static void werror(Object e) {
        sout.printf("%s%s%s%n", RED, e, RESET);
    }
}
