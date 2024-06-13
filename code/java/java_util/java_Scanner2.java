package code.java.java_util;

import java.util.Scanner;

public class java_Scanner2 {
    public static void main(String[] args){
        int age = 0, months = 0;
        String name = "", monthName = "";
        char genre;
        float weight = 0.0f;
        double money = 0;

        /*
            Mencionaba en java_Scanner1.java, que habían errores en dicho documento, pues el error es que se usa una sola instancia 
            para todos los tipos de datos. Se darán cuenta que si usan un Scanner para leer Strings, y luego quieren pedir
            al usuario la edad con ese mismo Scanner, en muchos casos no los dejará ingresar la edad (int), porque
            el Scanner cuando leyó un String antes, quedó configurado para leer String o char, por eso hay alternativas para
            evitar esos errores.
        */

        //Primer alternativa: Hacer varias instancias de Scanner para diferentes tipos de datos
        Scanner readInt = new Scanner(System.in); //Leer enteros (int)
        Scanner readStr = new Scanner(System.in); //Leer texto (Strings - char)
        Scanner readFloat = new Scanner(System.in); //Leer flotantes (float - double)
        Scanner readLong = new Scanner(System.in); //Leer números grandes (long)

        //int
        System.out.println("Ingrese su edad: ");
        age = readInt.nextInt();

        //String
        System.out.println("Ingrese su nombre: ");
        name = readStr.nextLine();

        //Char
        System.out.println("Ingrese su género (No me salgas con mkdas de LGTBIQ+) binario (f -> Femenino - m -> Masculino): ");
        genre = readStr.next().charAt(0);

        //Float
        System.out.println("Ingrese su masa corporal: ");
        weight = readFloat.nextFloat();

        //Double
        System.out.println("Ingrese su estimado de dinero: ");
        money = readFloat.nextFloat();

        

        System.out.println("SALIDA DE INFORMACIÓN SOLICITADA POR TECLADO: ");

        System.out.println("Su edad es: " + age);
        System.out.println("Su nombre es: " + name);
        System.out.println("Su su género es (f = Femenino / m = Masculino): " + genre);
        System.out.println("Su peso corporal es: " + weight);
        System.out.println("Su estimado de dinero es: " + money);

        //Alternativa 2: Un solo Scanner para todo tipo de dato, pero hacer una especie de cambio (casteo) al nuevo
        //tipo de dato que se va a usar, ejemplo, voy a leer un entero luego un texto

        Scanner read = new Scanner(System.in);

        //int
        System.out.println("¿Cuántos meses tiene un año?: ");
        months = read.nextInt();

        //Hacer una especie de casteo (o intercambio de tipo de dato a leer)
        //Cambiar el Scanner para leer String - char
        read.nextLine();


        System.out.println("SALIDA DE INFORMACIÓN INGRESADA POR TECLADO CON UN ÚNICO SCANNER:");

        //String
        System.out.println("Ingrese el nombre de un mes válido: ");
        monthName = read.nextLine();

        System.out.println("Un año tiene (" + months + ") meses");
        System.out.println("Mes: " + monthName);

        //Los Scanner siempre se cierran cuando estamos seguros que no los volveremos a usar
        //Una vez usados y nunca se van a usar más, cerrarlos recordar eso.
        readInt.close();
        readStr.close();
        readFloat.close();
        readLong.close();
        read.close();
    }
}