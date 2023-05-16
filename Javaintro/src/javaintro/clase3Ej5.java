/*
 Escribir un programa que lea un número entero por teclado y muestre por
pantalla el doble, el triple y la raíz cuadrada de ese número. 
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class clase3Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      int num1;
      
        System.out.println("ingrese un numero");
        
        num1 = leer.nextInt();
        
        System.out.println("El doble del numero es: " +num1*2);
        System.out.println("El tripe del numero es: " +num1*3);        
        System.out.println("la raiz cuadrada del numero es: " +(Math.sqrt(num1)));
      
    }
    
}
