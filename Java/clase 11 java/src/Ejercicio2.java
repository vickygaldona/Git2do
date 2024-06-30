import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double nota1, nota2, nota3, promedio;
            System.out.println("Digite las 3 calificaciones:");
            nota1 = scanner.nextDouble();
            nota2 = scanner.nextDouble();
            nota3 = scanner.nextDouble();
            promedio = (nota1 + nota2 + nota3) / 3;
            if (promedio >= 70) {
                System.out.println("El alumno está aprobado con: " + promedio);
            } else {
                System.out.println("El alumno está desaprobado con: " + promedio);
            }
        }
    }
}

