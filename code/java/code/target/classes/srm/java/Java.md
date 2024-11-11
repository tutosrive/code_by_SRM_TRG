#####  <a href="/">Home</a> - <a href="/code/python/python.md">PYTHON</a>

## JAVA

En esta sección encontrarás código JAVA, si deseas ver archivo por archivo sos libre de <a href="/code/java/code/src/main/java/srm/java/">**entrar**</a> (Es claro verdad). Vuelve a la sección principal con "**Home**".

<div style="width:100px;">

<a href="/code/java/code/src/main/java/srm/java/">![Java Logo](/assets/java_ico.svg "Java Logo")</a>

</div>

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