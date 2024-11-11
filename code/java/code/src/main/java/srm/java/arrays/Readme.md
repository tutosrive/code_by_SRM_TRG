# ¿Qué es un array (arreglo)?

Un array es una estructura de datos que permite almacenar múltiples elementos del mismo tipo en una sola variable. Los arrays son de tamaño fijo y los elementos se acceden a través de índices, comenzando desde 0.

(Existen diferentes tipos de arreglos, unidimensionales en este caso, <a href="">bidimensionales o matriz</a>, tridimensionales y de n-Dimensiones)

## Ejemplo visual de Matriz 2D:

![Matriz 2D (Tomado de: https://www.digitalocean.com/community/tutorials/two-dimensional-array-in-c-plus-plus)](/assets/array.png "Matriz 2D (Tomado de: https://www.digitalocean.com/)")

## Ejemplo de como delarar/inicializar un array:

<pre>
Sintaxis:
    1. tipo_dato[] nombreVariable = new tipo_dato [longitud];
    2. tipo_dato nombreVariable[];
    3. tipo_dato[] nombreVariable = {1, 2, 3} /Longitud = 3
    4. tipo_dato[] nombreVariable = {};
</pre>

```java
    Ejemplos: (int)

        //Forma 1.
        int[] numeros_pares = new int[4];

        //Forma 2.
        int numeros_pares[];

        //Forma 3.
        int[] numeros_pares = {2, 4, 6, 8, 10};

        //Forma 4.
        int[] numeros_pares = {};
```

---

> **Nota 1:** Algo muy importante de comprender, es que cuando creamos/iniciaizamos un arreglo, es decir, cuando usamos las **_formas (1, 4)_**, lo que en realidad estamos haciendo es crear un **arreglo lleno de ceros**, es decir, en la **forma 1: int[] numeros_pares = new int[4];** lo que en realidad estamos haciendo/creando es lo siguiente: **_int[] numeros_pares = {0, 0, 0, 0}_**

> **Nota 2:** La **_forma (2)_** se usa cuando no sabemos la longitud deseada del arreglo (Significa que más adelante le daremos un tamaño/longitud de una forma similar a la **forma (1)**). Por ejemplo en un caso en el que se le pide al usuario cuántos números desea agregar, para esos casos se usa. Aquí un pequeño ejemplo con **Scanner** (<a href="[text](../java_util/java_Scanner1.java)">¿Cómo usar Scanner (parte 1)?</a> - <a href="[text](../java_util/java_Scanner2.java)">Parte 2</a>)

---

```java
import java.util.Scanner:

public class Main {
    public static void main(String[] args){
        SCanner read = new Scanner(System.in);
        int size = 0;
        int pares[];

        System.out.println("¿Cuántos números desea agregar?");
        size = read.nextInt();

        read.close();

        //Sintaxis: nombreArreglo = new tipoDato[variable en la cual se almacena el tamaño]

        pares = new int[size];

        //En este caso, pares en realidad visualmente es si (size = 3): pares = {0, 0, 0}
    }
}
```

---

> **Nota 3:** En estos ejemplos solo tomé en cuneta los enteros (int), son más fáciles de comprender, y sus conceptos se pueden aplicar a todos los demás datos, es decir, si es un arreglo de **String** entonces el arreglo cambia de estar lleno de ceros (0), a **estar lleno con comillas dobles ("") vacías.**

---

### String:

```java
Ejemplos: (String)

    //Forma 1.
    String[] nombres = new String[4];

    //Forma 2.
    String nombres[];

    //Forma 3.
    String[] nombres = {"Santiago", "Isabella", "Nicolás", "Samuel"};

    //Forma 4.
    String[] nombres = {};
```

---

### float:

```java
Ejemplos: (float)

    //Forma 1.
    float[] weight = new float[4];

    //Forma 2.
    String weight[];

    //Forma 3.
    float[] weight = {56.4f, 12.5f, 67.3f, 78.5f};

    //Forma 4.
    float[] nombres = {};
```

---

### double:

```java
Ejemplos: (double)

    //Forma 1.
    double[] number = new double[4];

    //Forma 2.
    double number[];

    //Forma 3.
    double[] number = {56.4454545, 12.53435, 67.32324545, 78.52343534};

    //Forma 4.
    double[] number = {};
```

---

### char:

```java
Ejemplos (char):

    // Forma 1.
    char[] letters = new char[4];

    // Forma 2.
    char letters[];

    // Forma 3.
    char[] letters = {'a', 'b', 'c', 'd'};

    // Forma 4.
    char[] letters = {};
```
