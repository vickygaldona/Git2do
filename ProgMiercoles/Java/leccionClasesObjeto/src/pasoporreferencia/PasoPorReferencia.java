package pasoporreferencia;  

import clases.Persona;  

public class PasoPorReferencia {  
    public static void main(String[] args) {  
        // Crear un objeto Persona
        Persona persona1 = new Persona(); 
        persona1.nombre = "ester"; 
        System.out.println("persona1 nombre = " + persona1.nombre); 
        
        // Cambiar el nombre usando el método sin retorno
        cambiarValorSinRetorno(persona1);
        
        // Imprimimos el nombre después de cambiar el valor
        System.out.println("El cambio que hicimos en el nombre es: " + persona1.nombre);
        
        // Cambiar el nombre usando el método con retorno
        persona1 = cambiarValorConRetorno(persona1);
        System.out.println("El cambio que hicimos en el nombre con retorno es: " + persona1.nombre);
        
        // Crear otra persona y cambiar su valor
        Persona persona2 = new Persona();
        persona2.nombre = "Laura";  // Asignamos un nombre inicial a persona2
        persona2 = cambiarValorConRetorno(persona2);
        System.out.println("persona2 nombre = " + persona2.nombre);
    }
    
    // Método sin retorno que cambia el valor del nombre
    public static void cambiarValorSinRetorno(Persona persona) {
        persona.nombre = "maria";  // Cambiamos el nombre a "maria"
    }
    
    // Método con retorno que cambia el valor del nombre y retorna la Persona modificada
    public static Persona cambiarValorConRetorno(Persona persona) {
        if(persona == null) {
            System.out.println("El valor de persona es inválido: Null");
            return null;
        } else {
            persona.nombre = "monica";  // Cambiamos el nombre a "monica"
            return persona;  // Retornamos el objeto persona
        }
    }
}
