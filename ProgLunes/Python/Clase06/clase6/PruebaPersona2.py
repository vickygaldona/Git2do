from Persona2 import Persona2

print('Creación de objetos'.center(50, '-'))

if __name__ == '__main__':
    Persona5 = Persona2('lio', 'messi', 37)
    Persona5.mostrar_detalles()

    print(__name__)

print('Eliminación de objetos'.center(30, '-'))

# Eliminación del objeto Persona5
del Persona5
