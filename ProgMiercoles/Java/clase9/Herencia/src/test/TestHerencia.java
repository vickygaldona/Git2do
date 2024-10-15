
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("ariel", 57000.0);
        System.out.println("empleado1 = " + empleado1);
        
        
        Date fecha1 = new Date();
        
        Cliente cliente1 = new Clientes(fecha1, true, "bety", 'F' , 32, "9 de julio 1413");
        System.out.println("cliente1 = " + cliente1);
        
    }
    
}
