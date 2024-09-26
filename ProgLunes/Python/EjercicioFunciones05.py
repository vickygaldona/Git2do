#Ejercicio 5: Convertidor de Temperaturas

#funcion de celsius a fahrenheit
def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32

#funcion de fahrenheit a celsius
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9

celsius = float(input('digite el valor de celsius: '))
resultado = celsius_fahrenheit(celsius)
print(f'{celsius} C a F -> {resultado: .2f}')
 #clase