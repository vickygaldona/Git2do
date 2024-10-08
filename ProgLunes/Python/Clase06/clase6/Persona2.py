class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property
    def nombre(self):
        print('Estamos utilizando el método get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        print('Estamos utilizando el método set')
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad





    def __del__(self):
        print(f'persona2: {self._nombre} {self._apellido} {self._edad}')

if __name__ == '__main__':
    Persona1 = Persona2('Ariel', 'Bentacud', 41)

    print(Persona1.nombre)
    Persona1.nombre = 'Juan'
    print(Persona1.nombre)

    Persona1.mostrar_detalles()

    # Creación de tres objetos adicionales utilizando los métodos getter y setter
    persona2 = Persona2('josefina', 'sanchez', 29)
    persona3 = Persona2('lautaro', 'risso', 20)
    persona4 = Persona2('luna', 'lozano', 25)

    # Modificación de atributos usando setter
    persona2.nombre = 'Lucia'
    persona3.apellido = 'Dominguez'
    persona4.nombre = 'Lara'
    persona4.apellido = 'Mendoza'

    # Mostrar los detalles actualizados de cada objeto
    persona2.mostrar_detalles()
    persona3.mostrar_detalles()
    persona4.mostrar_detalles()
