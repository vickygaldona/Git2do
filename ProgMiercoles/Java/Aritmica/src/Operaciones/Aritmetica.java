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
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        return a + b;
    }
}
