//ejercicio 10: pedir 10 numeros y escribir la suma total
//joption
package Ciclos10;

import javax.swing.JOptionPane;


public class Ejercicio10 {
    public static void main(String[] args) {
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
           
            suma += numero;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros es: "+suma);
    }
}

    
    
