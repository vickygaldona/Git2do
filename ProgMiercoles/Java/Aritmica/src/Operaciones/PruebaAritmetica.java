package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10; // Variables locales
        int b = 7; // Memoria stack
        miMetodo(); // Llamamos el método nuevo
        
        // Creación de un objeto Aritmetica
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        
        // Almacenar un objeto o los atributos en la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado usando argumentos = " + resultado);
        
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
        
        // Creación de un objeto Persona
        Persona personaa = new Persona("Ariel", "Bentacud");
        System.out.println("personaa = " + personaa);
        System.out.println("Persona nombre: " + personaa.nombre);
        System.out.println("Persona apellido: " + personaa.apellido);
        
        // Uso de la clase Imprimir
        Imprimir imprimir1 = new Imprimir();
        imprimir1.imprimir(personaa);  // Llamamos el método imprimir para mostrar la información de la persona
    }
    
    // Modularidad: creamos un nuevo método
    public static void miMetodo() {
        System.out.println("Aquí hay otro método");
    }
}

// Clase Aritmetica
class Aritmetica {
    int a;
    int b;
    
    Aritmetica() {}
    
    Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    void sumarNumeros() {
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }
    
    int sumarConRetorno() {
        return a + b;
    }
    
    int sumarConArgumentos(int a, int b) {
        return a + b;
    }
}

// Clase Persona
class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido) { // Constructor
        Imprimir imprimir = new Imprimir();
        super(); // llamada al constructor de la clase padre Object
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido;
    }
}

// Clase Imprimir
class Imprimir {
    // Constructor de la clase
    public Imprimir() {
        super();  // Se llama automáticamente, no es necesario declararlo explícitamente.
    }
    
    // Método para imprimir la información de una persona
    public void imprimir(Persona persona) {
        System.out.println("Persona desde la clase Imprimir: " + persona);
        System.out.println("Impresión del objeto actual (this): " + this);
    }
}
