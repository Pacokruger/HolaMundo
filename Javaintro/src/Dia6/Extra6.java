/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
 */
package Dia6;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas a calcular");
        
        double alturagral=0;
        double alturaparcial=0;
                
        int contador=0;
        int personas = leer.nextInt();
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona");
            double alt = leer.nextDouble();
            alturagral += alt;
            
            if (alt<=1.60) {
                alturaparcial += alt;
                contador ++;
                
                
                
            }
            
        }
        System.out.println("El promedio de altura menor a 1,60 es: " + (alturaparcial / contador));
        
        System.out.println("El promedio general seria: " + alturagral/personas);        
    }
    
}
