package srm.java.conditionals;

public class operadorTernario {
    public static void main(String[] args) {
        /*
         * El Operador Ternario es un "operador" condicional
         * para expresiones simples, es muy útil cuando queremos verificar
         * una expersión sin pasar a usar un if(){...} else {...}
         * a pasar simplemente a hacer la verificación en una sola línea
         * 
         * La Sintaxis es la siguiente:
         * TipoDato nombreVar = (condicion por cierta) ? valorVerdadero : valorFalso;
         *
         * Nota: los valores por "verdader" y por "falso" deben ser del mismo tipo.
         * Nota 2: La condición de los "paréntesis" tiene que ser booleana, sea cual
         * sea, debe ser booleana
         */

        /*
         * Ejemplo 1:
         * 
         * Se mostrar al usuario un valor String, en lugar de mostrar un valor
         * "booleano", en cambio, se asigna un valor por verdadero/falso como si/no
         * respectivamente
         */

        // Se establece activo como falso
        boolean activoBool = false;

        // Si activo == true => imprime "Sí", caso contrario, imprime "No"
        String activo = (activoBool) ? "Sí" : "No";
        // En este caso particular imprime "No"
        System.out.println(activo);

        /*
         * Ejemplo 2:
         * 
         * Verificar si una persona es mayor o menor de edad
         * Para este caso se podría verificar una edad errónea (edad > 120 || edad <= 0)
         * e imprimir mensajes relevantes, pero el operador ternario no lo permite, por
         * eso se dice que se usa para casos muy especícficos
         */

        int edad = 18;
        String mayorEdad = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(mayorEdad);
    }
}