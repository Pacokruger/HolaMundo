/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y
le pida al usuario un número a buscar en el vector. El programa mostrará dónde
se encuentra el numero y si se encuentra repetido
 */
package Dia10Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random Aleatorio=new Random();
        
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        
        int[] vector=new int[n];
        
        for (int i = 0; i < n; i++) {
           vector[i]=Aleatorio.nextInt(10);
            System.out.print(vector[i]);
        }
        System.out.println(" ");
        
        System.out.println("Ingrese el numero q quiere buscar");
        
        int num1=leer.nextInt();
        int aux=0;
        for (int i = 0; i < n; i++) {
            if (vector[i]==num1) {
                System.out.println("el numero ingresado se encuentra en la posicion "+i);
                aux ++;
               
            }
            
        }
         if (aux>=2) {
                    System.out.println("El numero se encunetra repetido"); 
                }
    }
    
}
