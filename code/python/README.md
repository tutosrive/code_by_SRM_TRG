##### <a href="/">Home</a> - <a href="/code/java/java.md">JAVA</a>

## PYTHON

<div style="width:10px;">

<a href="/code/python/">![Python Logo](/assets/python_ico.svg "Python Logo")</a>

</div>

En esta sección encontrarás código PYTHON, si deseas ver archivo por archivo sos libre de <a href="/code/python/">**entrar**</a> (Es claro verdad). Vuelve a la sección principal con "**Home**".

```python
#Hello World + salida con el nombre de usuario
name = input("What's your name?")
print(f"Hello World {name}.")
```

Tkinter (Programas De Interfaz Gráfica)

```python
#Programa que salude al usuario con una alerta o mensaje de diálogo

from tkinter import Button, StringVar, Label, Entry, Tk
from tkinter import messagebox as ms

root = Tk()
root.title("Hello World")
root.geometry("300x200")

message = StringVar(root, "")

def sayHello(name):
	txt = f"Hello World {name}."

	message.set(txt)
	root.title(txt)
	ms.showinfo(txt, f"¡Hey coder! {txt}")

labelText = Label(root, textvariable = message)
entryName = Entry(root)
btnSayHello = Button(root, text = "Say Hello", command = lambda: sayHello(entryName.get()))

entryName.pack()
btnSayHello.pack()
labelText.pack()

root.mainloop()
```
