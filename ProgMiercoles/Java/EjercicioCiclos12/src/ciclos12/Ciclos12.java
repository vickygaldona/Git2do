/*
ejercicio 12: pedir un numero y calcular su factorial
hacerlo con las dos clases, Scanner y JOptionPane
 */
package ciclos12;

import javax.swing.JOptionPane;
//import java.util.Scanner; // Importa la clase Scanner si la vas a usar

public class Ciclos12 {
    public static void main(String[] args) {
        // Versión con JOptionPane
        long factorial = 1;  // Variable para almacenar el factorial

        // Pedir el número usando JOptionPane
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        // Calcular el factorial
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        // Mostrar el resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "El factorial del número ingresado es: " + factorial);
        
        /* 
        // Versión con Scanner
        long factorial2 = 1;  // Variable para almacenar el factorial

        // Inicializar Scanner
        Scanner entrada = new Scanner(System.in);
        
        // Pedir el número por consola
        System.out.print("Digite un número: ");
        int numero2 = entrada.nextInt();
        
        // Calcular el factorial
        for (int i = 1; i <= numero2; i++) {
            factorial2 *= i;
        }
        
        // Mostrar el resultado en consola
        System.out.println("\nEl factorial del número ingresado es: " + factorial2);
        */
    }
}
