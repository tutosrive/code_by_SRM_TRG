#####  <a href="/">Home</a> - <a href="/code/python/">PYTHON</a>

## JAVA

En esta sección encontrarás código JAVA, si deseas ver archivo por archivo sos libre de entrar (Es claro verdad). Vuelve a la sección principal con "**Home**".

```java
//Hello World + salida con el nombre de usuario
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String name = "";

        System.out.println("¿What's Your name?");
        name = read.nextLine();

        read.close();

        System.out.println("Hello World " + name);
    }
}
```