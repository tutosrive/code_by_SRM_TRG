# ¿Qué es el bloque do-while?

![IMG](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiFb4v2WyHjBy-nI4HcnS2u7q2TAIsn1AhkuxjZ2CeoxdVBLam5jIPYC5BxXsW14z4iUlvfKRWIZZ3FWEgIvcTcjpT9OJovDezOOcGlNdS45_WEyMj08BvasY_nBmNbX5pwUT_re5qxA4M/s640/Sint%25C3%25A1xis+Estructura+Iterativa+Do+While+-+C%2523.PNG "Bloque do{...}while{...}")

do{...}while(condición de salida) es un ciclo/bucle el cual funciona de manera bastante similar al ciclo/bucle **while** "normal", la diferencia radica en el bloque "do", este bloque ("do") permite complementar el ciclo/bucle **while** de tal manera que el código contenido allí (dentro del bloque "do") se ejecutará _al menos_ una vez así la condición del bloque "while" no se cumpla, permitiéndonos ejecutar acciones/código antes de verificarse una opción de salida

### [Ejemplos:](./)
>[!NOTE]
>_Bloque_ **do-while**:
>```java
>// Ejecutar un código al menos una vez, así cumpla con la condición de salida
>
>public class Main
>{
>	public static void main(String[] args) {
>	    // Un contador en 0
>		int count = 0;
>		do {
>		    // Imprimir el valor del contador
>			System.out.printf("Valor Count (do-while): %d%n",count);
>		}
>		// Como count == 0, significa que saldrá justo después de la primer ejecución
>		while(count != 0);
>	}
>}
>```
>Salida:
>> ```python
>> >>> Valor Count (do-while): 0
>> ```
>
>_Bloque_ **while**:
>```java
>// Ejecutar un código al menos una vez, así cumpla con la condición de salida
>
>public class Main
>{
>	public static void main(String[] args) {
>   // Un contador en 0
>		int count = 0;
>
>		// Ejemplo con while simple
>		// La condición NO CUMPLE con lo requerido, así que no se ejcutará
>		while(count != 0){
>		    // Imprimir el valor del contador
>			System.out.printf("Valor Count (while simple): %d%n",count);
>		}
>	}
>}
>```
>>Salida (no hay salida) 🤡:
>> ```python
>> >>> 
>> ```
