package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite un mes del año (1-12): ");
            var mes = Integer.parseInt(entrada.nextLine());
            var estacion = "Estación desconocida";
            
            switch (mes) {
                case 1:
                case 2:
                case 3:
                    estacion = "verano";
                    break;
                case 4:
                case 5:
                case 6:
                    estacion = "otoño";
                    break;
                case 7:
                case 8:
                case 9:
                    estacion = "invierno";
                    break;
                case 10:
                case 11:
                case 12:
                    estacion = "primavera";
                    break;
                default:
                    break;
            }
            
            System.out.println("Estación = " + estacion);
        }
    }
}
