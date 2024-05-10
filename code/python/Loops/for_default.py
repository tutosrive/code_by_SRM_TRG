"""
    Desarrolle un algoritmo que imprima los números desde n entero hasta 0, con paso 2
"""

#Pedir información al usuario
n = int(input("Ingrese inicio de procesro (entero): "))

#Para i en rango n, hasta 0, con paso 2 negativo (inversa)
for i in range(n, 0, -2):
    #Imprimir valor de i por cada iteración
    print(i)