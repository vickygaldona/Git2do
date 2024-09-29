//Ejercicio 9:Pedir el dia , mes y año de una fecha e indicar si la fecha es correcta
//suponiendo que todos los meses son de 3o dias
package Ciclos09;

import java.util.Scanner;


public class Ciclos09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite el dia: ");
        int dia = Integer.parseInt(entrada.nextLine());
        System.out.println("digite el mes: ");
        int mes = Integer.parseInt(entrada.nextLine());
        System.out.println("digite el año: ");
        int anio = Integer.parseInt(entrada.nextLine());
        if((dia != 0)&&(dia <= 30)){
            if((mes != 0)&&(mes <= 12)){
                
                if((anio !=0)&&(anio <= 2024)){
                System.out.println("la fecha ingresada es:"+dia+"/"+mes+"/"+anio);
                
            }
                else{
                        System.out.println("fecha incorrecta, añoo incorrecto");
                        
                        }
            }
            else{
                System.out.println("fecha incorrecta, mes incorrecto");
            }
        }
        else{
            System.out.println("fecha incorrecta, dia incorrecto");
        }
        
    }
}

