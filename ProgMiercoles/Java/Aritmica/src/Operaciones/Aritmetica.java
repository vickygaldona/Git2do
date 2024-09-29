package Operaciones;

public class Aritmetica {
    // Atributos
    public int a;
    public int b;

    // Método para sumar los números
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }
    public int sumarConRetorno(){
        //int resultado = a + b;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
}
