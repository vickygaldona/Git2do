package CICLOWHILE;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Ejemplo de bucle while
        var conteo = 0; // inferencia de tipos
        while (conteo < 7) {
            System.out.println("conteo = " + conteo);
            conteo++; // Aumenta la variable en uno
        }

        // Ejemplo de bucle do-while
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 7);

        // Ejemplo de bucle for con break
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) { // Corregido el operador de comparación
                System.out.println("contando = " + contando);
                break; // Sale del bucle
            }
        }

        // Ejemplo de bucle for con continue y etiqueta
        inicio:
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 != 0) {
                continue inicio; // Continúa con la siguiente iteración de la etiqueta 'inicio'
            }
            System.out.println("contando = " + contando); // Se ejecutará solo para números pares
        }
    }
}
