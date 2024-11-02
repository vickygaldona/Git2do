from Cuadrado import Cuadrado
from FiguraGeometrica import FiguraGeometrica
from Rectangulo import Rectangulo


print("Creamos objeto clase cuadrado".center(50,"_"))
cuadrado1 = Cuadrado(8,"Azul")
cuadrado1.alto = 7
cuadrado1.ancho = 7
rectangulo1 = Rectangulo(3,9,"Rojo")
rectangulo1.ancho = 8
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f"El area es: {cuadrado1.calcular_area()}")

# MRO = METHOD RESOLUTION ORDER
# [<class 'Cuadrado.Cuadrado'>, <class 'FiguraGeometrica.FiguraGeometrica'>, <class 'Color.Color'>, <class 'object'>]
# nos dice que va a CUADRADO, luego a FIGURA, luego a COLOR, y ultimo obviamente a la CLASE OBJECT
print(Cuadrado.mro())

print(cuadrado1)
print(rectangulo1)

# figura1 = FiguraGeometrica() ## no se puede instanciar, es abstracta

