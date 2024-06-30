
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in) // Crear objeto Scanner para entrada
        ) {
            System.out.println("Digite un número del mes: ");
            int mes = Integer.parseInt(entrada.nextLine()); // Lee el mes como entero
            String estacion = "Estación desconocida"; // Inicializa la variable de la estación
             switch (mes) {
                case 1, 2, 3 -> estacion = "Verano";
                case 4,    5, 6 -> estacion = "Otoño";
                case 7,    8, 9 -> estacion = "Invierno";
                case 10, 11, 12 -> estacion = "Primavera";
                default -> System.out.println("Número de mes inválido. Ingrese un número entre 1 y 12.");
            }
            System.out.println("Estación = " + estacion);
        }
    }
}
   