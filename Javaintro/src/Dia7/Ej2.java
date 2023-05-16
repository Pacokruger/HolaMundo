/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.

 */
package Dia7;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        int edad;
        String respuesta;
        do {
        
        System.out.println("Ingrese el nombre de la persona");
        nombre=leer.next();
        System.out.println("Ingrese la edad");
        edad=leer.nextInt();
        
        
        mayordeedad( nombre, edad);
        
            System.out.println("¿Quiere seguir ingresando personas? si/no");
            respuesta=leer.next();
        
        }while(respuesta.equalsIgnoreCase("si"));
        
    }
    public static void mayordeedad(String nombre,int edad){
        if (edad>= 18) {
            System.out.println("La persona es mayor de edad");
        }else{
                    System.out.println("La persona es menor de edad");
                    }
            
        }
    }

