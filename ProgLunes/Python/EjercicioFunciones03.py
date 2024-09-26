#Ejercicio 3: Funcion Recursiva

def imprimir_numeros_recursivos(numero):
    if numero >= 1:
        print(numero)
        imprimir_numeros_recursivos(numero-1)
    elif numero <= 0:
        return
    elif numero <= 0:
        print('valor ingresado incorrecto...')

imprimir_numeros_recursivos(1)
