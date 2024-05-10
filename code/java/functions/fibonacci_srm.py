"""
    Definir función requerida para retornar resultado serie fibonacci
    hasta número n
"""
def fibonacci_srm(n):
    #Definición de variables
    cont = 0
    a = 0
    b = 1

    #Ejecutar hasta que el contador menor ó igual a n
    while cont <= n:
        #Asignación múltiple
        a, b = b, a+b
        #Aumentar contador en cada vuelta +1
        cont += 1
    #Retornar valor de fibonacci en n ó menor a n
    return a

#Impirmir resultado retornado por la función
limit = int(input("Ingrese límite de números fibonacci: "))

#Test función fibonacci_srm()
print(fibonacci_srm(limit))