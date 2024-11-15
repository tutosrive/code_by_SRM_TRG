package srm.java.loops.workshop;
/*
    6. Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la
    semana (seis días) y requiere determinar el total de estas, así como el sueldo que recibirá por
    las horas trabajadas, solicite la información de las horas de cada dia y valor hora por teclado.
 */

import java.util.Scanner;

public class Eje6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float horas, hourCost, totalH = 0.0f;
        double salaryWorker = 0;

        System.out.println("A continuación, podrá ingresar la información requerida de una semana.");

        for (int i = 1; i <= 7; i++) {
            horas = read.nextFloat("Ingrese horas trabajadas día " + i + ": ");

            totalH += horas;

            hourCost = read.nextFloat("Ingrese valor por hora (v/g): ");

            salaryWorker += horas * hourCost;
        }

        read.close();

        System.out.println("Horas Trabajadas: " + totalH + "\nSalario Final: " + salaryWorker);

    }
}
