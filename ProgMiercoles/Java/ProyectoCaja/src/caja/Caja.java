package caja;

public class Caja {
    int ancho; 
    int alto; 
    int profundo; 

    // Constructor vacío
    public Caja() {
        // Inicialización por defecto, si es necesario
    }

    // Constructor con parámetros
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // Método para calcular el volumen
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}
