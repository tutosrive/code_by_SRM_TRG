"""
    Desarrollar un algoritmo que imprima lo siguiente:
        - Si la persona es mayor o tiene 18 años (Colombia) -> 'Eres mayor de edad.'
        - Si edad menor a 0 (negativa) ó igual a 0 (ilógico) ó edad mayor a 118 (demasiado viejo) -> 'Edad errónea.'
        - Caso contrario -> 'Eres menor de edad.'

    Como nota adicional porfavor comente o imprima el valor que toma un (else)
"""

#Pedir información al usuraio
age = int(input("Ingrese su edad: "))

#Filtro edades negativas o demasiado grandes
if age <= 0 or age > 120:
    print("Edad errónea.")

#El valor que toma este else es (age > 0 and age < 120)
else:
    #Edad mayor ó igual a 18
    if age >= 18:
        print("Eres mayor de edad.")
    
    #El valor que toma este else es (age < 18)
    else:
        print("Eres menor de edad.")