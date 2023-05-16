/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class clase3Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("ingrese un numero entero");
        
        num1 = leer.nextInt();
        
        System.out.println("ingrese otro numero entero");
        
        num2 = leer.nextInt();
        
        System.out.println("La suma de los numero es: " + (num1+num2));
    
               
    }
    
}
