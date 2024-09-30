package Operaciones;

public class Aritmetica {
    // Atributos
     int a;
     int b;
     
public Aritmetica(){
    System.out.println("se esta ejecutando este constructor numero uno");
    
}
//estamos viendo lo que se llama sobrecarga de constructores
public Aritmetica(int a, int b){ //constructor 2
    this.a = a;
    this.b = b;
    System.out.println("se esta ejecutando este constructor numeros dos");
    
}

//metodo
public void sumarNumero(){
    int resultado = a + b;
    System.out.println("resultado = " + resultado);
}
public int sumarConRetorno(){
    //int resultado = a + b;
    return a + b;
}

public int sumarConArgumentos(int a, int b){
    this.a = a;
    this.b = b;
    //return a + b;
    return this.sumarConRetorno();
    
}

        }