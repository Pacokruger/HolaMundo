/*
Crear un programa que dado un número determine si es par o impar
 */
package Diaa5;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
       
        if (num1%2==0) {
            System.out.println("el numero ingresado es par");
            
            
        }
        else{
            System.out.println("el numero ingresado es impar");
        }
            
        
        
    }
    
}
