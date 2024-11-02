from tkinter.constants import PROJECTING


class MiClase:
    # VARIABLE DE CLASE, ESTE ATRIBUTO DARA A CADA OBJETO EL MISMO VALOR
    variable_clase = 'Esta es una variable de clase'

    def __init__(self, variable_instancia): #LA VARIABLE DE INSTANCIA, DE DIFERENTES VALORES
        self.variable_instancia = variable_instancia


print(MiClase.variable_clase)
miClase1 = MiClase('Esta es una variable de instancia')
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2= MiClase('Esta es otra prueba de variable de instancia')
print(miClase2.variable_instancia)
print(miClase2.variable_clase)
