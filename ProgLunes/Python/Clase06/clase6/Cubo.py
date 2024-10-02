class Cubo:
    """
    Crear  la clase cubo
    volumen = ancho * altura * profundidad
    """

    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad


ancho = int(input('digite el ancho del cubo: '))
altura = int(input('digite la altura del cubo: '))
profundidad = int(input('digite la profundidad del cubo: '))

cubo1 = Cubo(ancho, altura, profundidad)
print(f'el volumen del cubo es: {cubo1.calcular_volumen()}')
