"""
    Implementar función que retorne la sumatoria 
    de los primeros números naturales hasta n
"""

#Definir función que procesará la información recibe por parámetro n
def sum_n_natural(n):
    
    sum = 1

    #Ejecutar hasta el rango en menor a n+1 equivalente a (i <= n)
    for i in range(n+1):
        #Por cada vuelta de bucle sumar i a la variable suma
        sum += i 
    #Retornar el valor final de la suma desde cero hasta n
    return sum

#Hacer más dinámico el proceso, ingresar valor de n por teclado
limit = int(input("Ingrese el límite natural: "))

#Hacer una instancia de la función en variable suma
suma = sum_n_natural(limit)

#Impirmir resultado retornado por la función
print(f"La suma total de los {limit} números naturales es: ", suma)