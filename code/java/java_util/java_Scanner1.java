package code.java.java_util;

//Primero se importa el objeto Scanner de las utilidades de java
import java.util.Scanner;

public class java_Scanner1 {
    public static void main(String[] args) {
        // Para usarse se debe declarar una variable que contenga el método para leer
        // por teclado
        // Luego se puede usar. Se sigue el mismo principio para declarar variables
        // Tipo de dato - nombreVariable - asignación - valor variable;
        // Al ser un objeto debe instanciarse así
        Scanner read = new Scanner(System.in);

        /*
         * Su uso se asemeja bastante a la función Leer del lenguaje PseudoCode de
         * Pseint
         * Hacemos un sout para que el usuario vea que debe ingresar
         * System.out.println("Ingrese información");
         * Después se "Lee" por teclado la respuesta del usuario.
         * Scanner admite leer todos los tipos de datos a excepción del tipo char, hay
         * un truqito.
         * Pero en sí la sintaxis es:
         * read.nextInt() -> Para enteros
         * read.nextLine() -> Para Strings
         * read.nextFloat() -> Para Flotantes
         * read.nextDouble() -> Para Flotantes presición doble
         * read.nextLong() -> Para Long
         * 
         * Hay otros métodos pero los anteriores son los más comúnes.
         * -----------------------------------------
         * 
         * Para leer un carácter el truco es acceder por medio de posiciones de arreglos
         * en cadenas
         * es decir, si queremos leer (f) para femenino y (m) para masculino
         * se trata de leer un string, pero en su posición 0
         *              Posición                              0    1    2    3    4    5    6    7    8
         * si el usuacio ingresa masculino su arreglo sería ['m', 'a', 's', 'c', 'u', 'l', 'i', 'n', 'o']
         * entonces:
         * read.next() -> No se le indica el tipo de dato, luego indicamos la posición a leer, así:
         * read.next().charAt(0) -> Leer la posición 0 de lo que se introduce por teclado
         * 
         * Para finalizar este comentario, el Scanner se debe ser cerrar, para evitar errores
        */

        //Ejemplos

        //Enteros (nextInt())
        System.out.print("Ingrese su edad: ");
        int age = read.nextInt();

        //Flotantes presición doble (nextDouble())
        System.out.print("Ingrese una aproximación de PI: ");
        double PI = read.nextDouble();

        //Flotantes simples (nextFloat())
        System.out.print("Ingrese su peso en Kg: ");
        float pesokg = read.nextFloat();

        //Long (nextLong())
        System.out.print("Ingrese cuanto cuanto es 1 billón: ");
        long billion = read.nextLong();

        //Caracteres (next())
        System.out.print("Ingrese (f) para femenino ó (m) para masculino: ");
        char genre = read.next().charAt(0);

        //Strings (nextLine())
        System.out.print("Ingrese su nombre: ");
        String name = read.nextLine();


        //Se debe cerrar el Scanner para evitar errores
        read.close();

        //Hay un error, de hecho hay muchas cosas que no son correctas pero parecen estar bien
        //Revisar java_scanner2 para saber que es...

        System.out.println("\n----------------");

        System.out.println("Age (int): " + age);
        System.out.println("PI (double): " + PI);
        System.out.println("pesokg (float): " + pesokg);
        System.out.println("Billion (long): " + billion);
        System.out.println("Genre (char): " + genre);
        System.out.println("Name (String): " + name);
    }
}
