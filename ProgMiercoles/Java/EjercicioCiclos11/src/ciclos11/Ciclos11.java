/*
ejercicio 11: diseñar un programa que muestre el producto
de los 10  primeros numeros impares
hacerlo con JOption Pane
*/
package ciclos11;

import javax.swing.JOptionPane;


public class Ciclos11 {
    public static void main(String[] args) {
        long producto = 1;
        for(int i = 1; i<=20;i+=2){
            producto *= 1;
        }
        JOptionPane.showMessageDialog(null, "el producto de los numeros impares es: "+producto);
    }
    
}
