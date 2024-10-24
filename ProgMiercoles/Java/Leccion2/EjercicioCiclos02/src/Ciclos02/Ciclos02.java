package Ciclos02;

import javax.swing.JOptionPane;

public class Ciclos02 {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        
        JOptionPane.showMessageDialog(null, "El número " + numero + " finaliza el programa");
    }
}
