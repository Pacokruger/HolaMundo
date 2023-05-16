/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class clase3Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       int num1;
       int num2;
       
        System.out.println("Ingrese los grados q quiere convertir");
        
        num1 = leer.nextInt();
        
        num2 = 32+(9 * num1 / 5);
        System.out.println("eso serian " + num2 + " grados fharenheit"  );
    }
    
}
