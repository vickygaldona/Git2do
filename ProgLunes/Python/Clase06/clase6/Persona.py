class Persona:
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):
        self.nombre = nombre  # Asigna el valor pasado como argumento
        self.apellido = apellido
        self._dni = dni #este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.wkargs = kwargs

    def mostrar_detalle(self):
        print(f'La clase Perona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni}{self.edad}, la direccion es: {self.args}, los datos importantes son: {self.wkargs} ')  # Corregido el paréntesis


# Crear objetos de la clase Persona
persona1 = Persona('Ariel', 'Bentacud', 24794334, 40)
#print(persona1.nombre)
#print(persona1.apellido)
#print(persona1.edad)

print(f'El objeto1 de la clase Persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

persona2 = Persona('Osvaldo', 'Giordanini',3368283, 45)
print(f'El objeto2 de la clase Persona {persona2.nombre} {persona2.apellido} su edad es: {persona2.edad}')

# Modificar los atributos del objeto persona1
persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40
print(f'El objeto1 modificado de la clase Persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

# Mostrar detalles de los objetos
persona1.mostrar_detalle() #la referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

#Persona.mostrar_detalle(persona) #debemos pasarle una referencia para el self o dara error
persona1.telefono = '243763876'
print(f'este es el telefono: {persona1.nombre} {persona1.telefono}' )

 #print(persona2.telefono) #el objeto persona2 no tiene este atributo, da error
persona3 = Persona('rogelio','romero', 32345643,22, 'telefono', '343445432', 'calle lopez', 932, 'manzana', 77, 'casa', 18, altura=1.75, peso=94, CFavorito='azul', Auto='citroen', Modelo='2021')
#print(persona3._dni) esto no se debe utilizar (Esta encapsulado), esto dice que lo desconozcamos python
 # persona3.__nombre # esta totalmente encapsulado


















