package srm.java.loops.workshop;

import srm.java.own.Printer;

/*
 * 7. Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el
 * segundo 20 €, el tercero 40 € y así sucesivamente. Realizar un algoritmo para determinar
 * cuánto debe pagar mensualmente y el total de lo que pagó después de los 20 meses.
 */

public class Eje7 {
    public static void main(String[] args) {
        long pago = 10, total = 0, plazo = 20;

        for (int i = 1; i <= plazo; i++) {
            // Salida de información, de cuanto debe pagar por mes
            System.out.println("Mes " + i + " paga: " + pago + "€");
            // Se adiciona al total lacantidad de cada pago
            total += pago;
            pago *= 2; // Se duplica el valor del pago
        }
        System.out.println("Total a pagar: " + total + "€");
    }
}
