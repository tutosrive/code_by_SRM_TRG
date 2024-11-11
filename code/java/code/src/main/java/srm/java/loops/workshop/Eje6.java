package srm.java.loops.workshop;
/*
    6. Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la
    semana (seis días) y requiere determinar el total de estas, así como el sueldo que recibirá por
    las horas trabajadas, solicite la información de las horas de cada dia y valor hora por teclado.
 */

import srm.java.own.Keyboard;
import srm.java.own.Printer;

public class Eje6 {
    public static void main(String[] args) {

        float horas, hourCost, totalH = 0.0f;
        double salaryWorker = 0;

        Printer.winfo("A continuación, podrá ingresar la información requerida de una semana.");

        for (int i = 1; i <= 7; i++) {
            horas = Keyboard.readF("Ingrese horas trabajadas día " + i + ": ");

            totalH += horas;

            hourCost = Keyboard.readF("Ingrese valor por hora (v/g): ");

            salaryWorker += horas * hourCost;
        }

        Keyboard.closeSc();

        Printer.wexe("Horas Trabajadas: " + totalH + "\nSalario Final: " + salaryWorker);

    }
}
