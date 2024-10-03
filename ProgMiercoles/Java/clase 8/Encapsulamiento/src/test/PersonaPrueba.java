
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 =  new Persona("Osvaldo", 321.111, false);
        System.out.println("persona1 = " + persona1);
        //Modificamos a traves de los metodos
        persona1.setNombre("Juan");
        //persona1.nombre = "Juan"; //ya no se puede utilizar
        //System.out.println("nombre es: "+persona1,nombre); //error
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        
        
        Persona persona2 = new Persona("Carlos", 500.00, true);
        
        System.out.println("persona2 con nombre inicial: " + persona2.getNombre());
        System.out.println("persona2 el sueldo inicial: " + persona2.getSueldo());
        System.out.println("persona2 el estado eliminado inicial: " + persona2.isEliminado());
        
        
        System.out.println("persona1 = " + persona1);
    }
}
