#Funciones
def mi_funcion():
    print('Saludos a todos los alumnos de la Tecnicatura')

mi_funcion()
mi_funcion()

#Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name+ ' '+lastName)
person = ["Ariel", "Bentacud"]
show(person[0], person[1])
show(*person)
person2 = ("Osvaldo", "Giordanini")
show(*person2)
person3 = {"lastName": "Lucero", "name": "Natalia" }
show(**person3)

numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(n)
else:
    print('Esto se termina')


#List comprehsion, lista de comprension
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == 'P']
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella", "country": "Belgium"}]

Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)


#Paso de argumentos (funciones)
def mi_funcion2(name, lastName):
    print(f'nombre: {name}, apellido: {lastName}')
    print("Saludos a todos los que ven a través del canal de YouTube")

mi_funcion2('jorge', 'lucero')
mi_funcion2('ariel', 'bentacud')
mi_funcion2('analia', 'pedrosa')

# RETURN

def sumar(a, b):
    return a + b
resultado = sumar(78, 22)
print(f'el resultado de la suma es: {resultado}')
print(f'el resultado de la suma es:{sumar(55, 45)}')

def sumar2(a = 0, b = 0):
    return a + b
resultado = sumar2()
print(f'resultado de la suma: {resultado}')
print(f'resultado de la suma: {sumar2(22, 66)}')

#Argumentos, variables en funciones
def listarNombres(*nombres):
    for nombre in nombres:
        print(nombre)
listarNombres('Lucas', 'jose', 'claudia', 'rosa', 'maria')
listarNombres('marcos', 'daniel', 'romina', 'pepe', 'marcela', 'carlos')

