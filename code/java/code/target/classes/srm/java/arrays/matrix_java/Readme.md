# ¿Qué es una matriz (arreglo bidimensional)?

Una matriz es una estructura de datos que permite almacenar múltiples elementos del mismo tipo en una sola variable, organizada en filas y columnas. Los elementos se acceden a través de índices, comenzando desde 0.

(Existen diferentes tipos de arreglos: unidimensionales, bidimensionales o matrices, tridimensionales y de n-Dimensiones)

## Ejemplo visual de Matriz 2D:

![Matriz 2D (Tomado de: https://www.digitalocean.com/community/tutorials/two-dimensional-array-in-c-plus-plus)](/assets/matriz2D.png "Matriz 2D (Tomado de: https://www.digitalocean.com/)")

## Ejemplo de cómo declarar/inicializar una matriz:

```java
    Sintaxis:
        1. tipo_dato[][] nombreVariable = new tipo_dato[filas][columnas];
        2. tipo_dato nombreVariable[][];
        3. tipo_dato[][] nombreVariable = {
                {elemento1, elemento2, elemento3},
                {elemento4, elemento5, elemento6}
           };
        4. tipo_dato[][] nombreVariable = new tipo_dato[0][0];

    Ejemplos: (int)

        // Forma 1.
        int[][] numeros_pares = new int[2][3];

        // Forma 2.
        int numeros_pares[][];

        // Forma 3.
        int[][] numeros_pares = {
            {2, 4, 6},
            {8, 10, 12}
        };

        // Forma 4.
        int[][] numeros_pares = new int[0][0];
```

---

> Nota 1: Es importante comprender que cuando creamos/inicializamos una matriz usando las formas (1, 4), en realidad estamos creando una matriz llena de ceros. Por ejemplo, en la forma 1: int[][] numeros_pares = new int[2][3]; lo que en realidad estamos creando es lo siguiente: int[][] numeros_pares = {{0, 0, 0}, {0, 0, 0}}

> Nota 2: La forma (2) se usa cuando no sabemos las dimensiones deseadas de la matriz (significa que más adelante le daremos un tamaño similar a la forma (1)). Por ejemplo, en un caso en el que se le pide al usuario cuántos números desea agregar en cada fila y columna. Aquí un pequeño ejemplo con Scanner.

---

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int rows = 0;
        int cols = 0;
        int pares[][];

        System.out.println("¿Cuántas filas desea agregar?");
        rows = read.nextInt();

        System.out.println("¿Cuántas columnas desea agregar?");
        cols = read.nextInt();

        read.close();

        // Sintaxis: nombreMatriz = new tipoDato[filas][columnas]

        pares = new int[rows][cols];

        // En este caso, si (rows = 2) y (cols = 3): pares = {{0, 0, 0}, {0, 0, 0}}
    }
}
```

---

> Nota 3: En estos ejemplos solo tomé en cuenta los enteros (int), ya que son más fáciles de comprender, y sus conceptos se pueden aplicar a todos los demás tipos de datos. Por ejemplo, si es una matriz de String, entonces la matriz cambia de estar llena de ceros (0) a estar llena de comillas dobles ("") vacías.

---

### String:

```java
Ejemplos: (String)

    // Forma 1.
    String[][] nombres = new String[2][2];

    // Forma 2.
    String nombres[][];

    // Forma 3.
    String[][] nombres = {
        {"Santiago", "Isabella"},
        {"Nicolás", "Samuel"}
    };

    // Forma 4.
    String[][] nombres = new String[0][0];

```

---

### float:

```java
Ejemplos: (float)

    // Forma 1.
    float[][] weights = new float[2][2];

    // Forma 2.
    float weights[][];

    // Forma 3.
    float[][] weights = {
        {56.4f, 12.5f},
        {67.3f, 78.5f}
    };

    // Forma 4.
    float[][] weights = new float[0][0];

```

---

### double:

```java
Ejemplos: (double)

    // Forma 1.
    double[][] numbers = new double[2][2];

    // Forma 2.
    double numbers[][];

    // Forma 3.
    double[][] numbers = {
        {56.4454545, 12.53435},
        {67.32324545, 78.52343534}
    };

    // Forma 4.
    double[][] numbers = new double[0][0];

```

---

### char:

```java
Ejemplos (char):

    // Forma 1.
    char[][] letters = new char[2][2];

    // Forma 2.
    char letters[][];

    // Forma 3.
    char[][] letters = {
        {'a', 'b'},
        {'c', 'd'}
    };

    // Forma 4.
    char[][] letters = new char[0][0];

```
