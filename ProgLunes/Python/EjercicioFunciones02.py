#Ejercicio 2: Funcion con * args para multiplicar
def multiplicar_valores(*numeros):
    resultado = 1
    for numero in numeros:
        resultado *= numero
    return resultado


print(multiplicar_valores(3, 5, 15, 3))
 