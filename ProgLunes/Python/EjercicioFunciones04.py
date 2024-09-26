#Ejercicio 3: Calculadora de Impuestos

def calcular_total_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto *(impuesto/100)
    return pago_total
#ejecutamos la funcion
pago_sin_impuesto = float(input('digite el pago sin impuestos: '))
impuesto = float(input('digite el monto del impuesto aplicar: '))
pago_con_impuesto = calcular_total_pago(pago_sin_impuesto, impuesto)
print(f'el pago con impuesto es: {pago_con_impuesto}')
