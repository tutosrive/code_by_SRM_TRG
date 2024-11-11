# ¿Qué es un ArrayList? (arreglo unidimensional características particulares):

Un **ArrayList** es similar (en cuanto al concepto) a los arreglos unidimensionales (Vectores), ya que solo se conforma de una única dimensión, es decir, así como las **Matrices 2D** tienen dos dimensiones, es decir (**filas** - **columnas**), loa **ArrayList** solo se componen de posiciones en "**filas**". La diferencia principal y más importante por la cual **ArrayList** es diferente de los **vectores**, es, que los **ArrayList** son dinámicos y **no son de tamaño estático** (los vectores son de tamaño estático, por eso al declararlos se les da un tamaño fijo **no variable/dinámico**). Es decir, en los **ArrayList** podemos agregar datos, eliminar datos, modificar datos con la posibilidad de **redimensionar** su logitud.

> Revisa este <a href="/code/java/code/src/main/java/srm/java/arrays/arraylist/"></a> para ver ejercicios con **ArrayList**.
> # Ver definición de ArrayList completa (<a href="https://bioaiteamlearning.github.io/progI-2024-01-ucaldas/content/notebooks/Clase9-Java.html#3">ArrayList</a>). Revisar <a href="#créditos">créditos</a>.

## Ejemplo visual de ArrayList:

![ArrayList (Tomado de: https://medium.com/@Emmanuel.A/data-structures-arraylist-239a5b39cd7e)](/assets/arraylist.png "ArrayList (Tomado de: https://medium.com/@Emmanuel.A/data-structures-arraylist-239a5b39cd7e)")

## Conceptos importantes de **ArrayList**:

- Es un arreglo unidimensional dinámico (de tamaño dinámico / no estático).
- NO USA DATOS PRIMITIVOS, utiliza <a href="https://profile.es/blog/clases-wrapper-envoltorio-en-java/">Wrappers</a>.
- No hay necesidad de recorrer el arreglo con un <a href="/code/java/code/src/main/java/srm/java/arrays/vector/getElementsArray.java">ciclo</a> para mostrar todos sus elementos (esto porque se asemeja a listas de python su impresión es -> {dato1, dato2, dato3, dato-n}).
- Para usarse se debe importar (java.util.ArrayList)

## Métodos del ArrayList

- <a href="#addvalue">**add(value)**</a>: Se usa para añadir datos al final del arreglo (tal cual como **python** y las listas.**append()**).
- <a href="#getindex">**get(index)**</a>: Obtener valore de los índices (Hace lo mismo que **arreglo[index]** en los arreglos estáticos)
- <a href="#setindex-value">**set(index)**</a>: Se usa para reemplazar valores de los índices.
- <a href="#removeindex">**remove(index)**</a>: Se usa para remover un único valor por medio del índice.
- <a href="#clear">**clear()**</a>: Se usa para vaciar/eliminar/resetear todos los campos del arreglo.
- <a href="#size">**size()**</a>: Se usa para saber la longitud del arreglo (Traduce el length de los arreglos estáticos).

*Incluye otros métodos pero eso corre por cuenta tuya.*

## Ejemplo de como usar **ArrayList**

```java
//Esta es la única manera de declarar/inicializar un ArrayList
//Esto debido a que es dinámico, en el proceso se le dará su longitud debida
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Creando el arreglo
        //Sintaxis:
        //ArrayList<Wrapper> nombre = new ArraiList<>();

        //En este caso, haré un arreglo de números pares
        ArrayList<Integer> pares = new ArrayList<>();

        //Llenar arreglo con números pares, los tomaré desde un rango de 0 a 20
        for (int i = 0; i <= 20; i++){
            //El residuo de un número entre 2, si es cero (0) es par
            if (i % 2 == 0){
                //Añadir el valor actual de (i) al arreglo
                pares.add(i);
            }
        }

        //Imprimiré el arreglo de 2 formas.

        //Forma 1: Imprimir elemento por elemento
        //For Each
        for (int n: pares){
            System.out.println(n);
        }

        //Forma 2: Imprimir directamente todo el arreglo
        //Imprimirá algo así -> [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
        System.out.println(pares);
    }
}
```

## Ejemplo de usos de métodos de un ArrayList:

#### add(value):

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        //Añadir los números 1,2,3,4,5,6,7 al arreglo numbers
        for (int i = 1; i <= 7; i++){
            //Agrega el valor actual de (i) al arreglo
            numbers.add(i);
        }

        //Imprimir arreglo con todos sus elementos directamente
        System.out.println("Numbers: " + numbers);

        //Imprimirá algo como:
        //Numbers: [1, 2, 3, 4, 5, 6, 7]
    }
}    
```

#### set(index, value):

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        // Añadir los números 1,2,3,4,5,6,7 al arreglo numbers
        for (int i = 1; i <= 7; i++){
            // Agrega el valor actual de (i) al arreglo
            numbers.add(i);
        }

        // Arreglo antes de ser modificado el índice 3
        Syste.out.println("Numbers before REPLACE index 3: " + numbers);

        // Posición: (1, 2, 3, 4, 5, 6, 7) 
        // Numbers = {1, 2, 3, 4, 5, 6, 7}
        // Índices:  (0, 1, 2, 3, 4, 5, 6)

        // Reemplazar valor del índice 3 con 13 (Reemplazará número 4)
        numbers.set(3, 13);

        // Imprimir arreglo con todos sus elementos directamente
        System.out.println("Numbers after replace index 3: " + numbers);

        // Imprimirá algo como:
        // Numbers: [1, 2, 3, 13, 5, 6, 7]
    }
}    
```

#### get(index):

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        // Añadir los números 1,2,3,4,5,6,7 al arreglo numbers
        for (int i = 1; i <= 7; i++){
            // Agrega el valor actual de (i) al arreglo
            numbers.add(i);
        }

        // Posición: (1, 2, 3, 4, 5, 6, 7) 
        // Numbers = {1, 2, 3, 4, 5, 6, 7}
        // Índices:  (0, 1, 2, 3, 4, 5, 6)

        // Obtener valor del índice 4 (Imprimirá número 5)
        System.out.println("Índice 4: " + numbers.get(4));

        // Imprimir arreglo con todos sus elementos directamente
        System.out.println("Numbers: " + numbers);

        // Imprimirá algo como:
        // Numbers: [1, 2, 3, 4, 5, 6, 7]
    }
}    
```

#### remove(index):

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        // Añadir los números 1,2,3,4,5,6,7 al arreglo numbers
        for (int i = 1; i <= 7; i++){
            // Agrega el valor actual de (i) al arreglo
            numbers.add(i);
        }

        // Posición: (1, 2, 3, 4, 5, 6, 7) 
        // Numbers = {1, 2, 3, 4, 5, 6, 7}
        // Índices:  (0, 1, 2, 3, 4, 5, 6)

        //Arreglo antes de elimiar índice 5
        System.out.println("Numbers before remove index 5: " + numbers);

        // Remover valor del índice 5 (Eliminará número 6)
        numbers.remove(5);
        // Imprimir arreglo con todos sus elementos directamente
        System.out.println("Numbers after remove index 5: " + numbers);

        // Imprimirá algo como:
        // Numbers: [1, 2, 3, 4, 5, 7]
    }
}    
```

#### clear():

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        // Añadir los números 1,2,3,4,5,6,7 al arreglo numbers
        for (int i = 1; i <= 7; i++){
            // Agrega el valor actual de (i) al arreglo
            numbers.add(i);
        }

        // Posición: (1, 2, 3, 4, 5, 6, 7) 
        // Numbers = {1, 2, 3, 4, 5, 6, 7}
        // Índices:  (0, 1, 2, 3, 4, 5, 6)

        // Arreglo antes de ser eliminado/reseteado
        System.out.println("Numbers before clear: " + numbers);

        //Eliminar/resetear arreglo
        numbers.clear();

        // Imprimir arreglo con todos sus elementos directamente
        System.out.println("Numbers after clear: " + numbers);

        // Imprimirá algo como:
        // Numbers: []
    }
}    
```

#### size():

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        // Añadir los números 1,2,3,4,5,6,7 al arreglo numbers
        for (int i = 1; i <= 7; i++){
            // Agrega el valor actual de (i) al arreglo
            numbers.add(i);
        }

        // Posición: (1, 2, 3, 4, 5, 6, 7) 
        // Numbers = {1, 2, 3, 4, 5, 6, 7}
        // Índices:  (0, 1, 2, 3, 4, 5, 6)

        // Imprimir longitud/tamaño del arreglo
        System.out.println("Tamaño/Longitud arreglo: " + numbers.size());

        // Imprimir arreglo con todos sus elementos directamente
        System.out.println("Numbers: " + numbers);

        // Imprimirá algo como:
        // Numbers: [1, 2, 3, 4, 5, 6, 7]
    }
}    
```

## Ejemplo mezclando todos los métodos:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> pares = new ArrayList<>();

        // Método add()
        // Aañadir los números 2, 4, 6, 8 y 10 al arreglo pares
        pares.add(2);
        pares.add(4);
        pares.add(6);
        pares.add(8);
        pares.add(10);

        System.out.println("ARREGLO INICIAL: ");

        // imprimir arreglo directamente
        System.out.println(pares);

        // ¿Cuál es la longitud/tamaño del arreglo?
        System.out.println("Longitud/Tamaño arreglo: " + pares.size());

        // Posiciones: (1, 2, 3, 4, 5)
        // Ahora arreglo es igual a: {2, 4, 6, 8, 10}
        // Índices: (0, 1, 2, 3, 4)

        // Método remoce()
        // Eliminar valor del índice 2 (Eliminará el número 6)
        pares.remove(2);

        // Posiciones: (1, 2, 3, 4)
        // Ahora arreglo es igual a: {2, 4, 8, 10}
        // Índices: (0, 1, 2, 3)

        // Método set
        // Reemplazar valor del índice 1 con 12 (Reemplazará el número 4)
        pares.set(1, 12);

        // Posiciones:               (1, 2, 3, 4)
        // Ahora arreglo es igual a: {2, 12, 8, 10}
        // Índices:                  (0, 1, 2, 3)

        // Imprimir valor del índice 0 (Imprimirá número 2)
        System.out.println("Índice 0: " + numbers.get(0));

        System.out.println("ARREGLO FINAL: ");

        // imprimir arreglo directamente
        System.out.println("Numbers before clear: " + pares);

        // ¿Cuál es la longitud/tamaño del arreglo?
        System.out.println("Longitud/Tamaño arreglo (before clear): " + pares.size());

        // Eliminar/resetear
        numbers.clear();

        // imprimir arreglo directamente
        System.out.println("Numbers before clear: " + pares);

        // ¿Cuál es la longitud/tamaño del arreglo?
        System.out.println("Longitud/Tamaño arreglo (before clear): " + pares.size());
    }
}
```

---

# Créditos

> "**Definnición completa**" tomada de: **Bioai Team Learning**. (2024). Arrays - Java. Retrieved from (https://bioaiteamlearning.github.io/progI-2024-01-ucaldas/content/notebooks/Clase9-Java.html#3)
