/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class clase3Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Escriba una frase");
        
        frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        
        System.out.println(frase.toLowerCase());
        
        
        
        
       
    }
    
}
