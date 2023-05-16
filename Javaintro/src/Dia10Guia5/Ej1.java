/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.

 *
package Dia10Guia5;

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
        //Scanner leer = new Scanner(System.in);
        
        int[] num=new int[100];
        
        for (int i = 0; i < 100; i++) {
            
            num[i]=i;
            
        }
        
        for (int i = num.length - 1; i >= 0; i--) {
            
            System.out.println("["+num[i]+"]");
            
        }
    }
    
}
