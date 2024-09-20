#ejercicio 1: una funcion para sumar los valores recibidos de tipo numericos,
#utilizando argumentos variables *Args como parametro de la funcion y agregar como resultado
#la suma de todos los valores pasados como argumentos
#definimos una funcion
def sumar_valor(*args):
    resultado = 0

    for valor in args:
        resultado += valor
    return resultado
