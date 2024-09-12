import math

tupla = (13, 1, 8, 3, 2, 5, 8)

lista = []

for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)

#ejericio de matematicas
#sacar raiz cuadrada d un numero +
numero = int(input('Digite un numero positivo: '))
print(f'\nSu raiz cuadrada es: {math.sqrt(numero):.2f}')


#ejercicio: llenar una lista
#llenar una lista con los numeros del 1 al 50
#mostrar la lista con el bucle for
lista = list(range(1, 51))
for i in lista:
    print(i, end='-')

