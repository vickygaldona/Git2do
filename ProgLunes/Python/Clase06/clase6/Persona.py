class Persona:
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre  # Asigna el valor pasado como argumento
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')  # Corregido el paréntesis


# Crear objetos de la clase Persona
persona1 = Persona('Ariel', 'Bentacud', 40)
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

print(f'El objeto1 de la clase Persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

persona2 = Persona('Osvaldo', 'Giordanini', 45)
print(f'El objeto2 de la clase Persona {persona2.nombre} {persona2.apellido} su edad es: {persona2.edad}')

# Modificar los atributos del objeto persona1
persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40
print(f'El objeto1 modificado de la clase Persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

# Mostrar detalles de los objetos
persona1.mostrar_detalle()
persona2.mostrar_detalle()
