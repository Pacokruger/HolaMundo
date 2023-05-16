/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.
 */
package Dia10Guia5;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class EjExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("ingrese el tamaño del vector");
        n=leer.nextInt();
        int[] vector=new int[n];
        int suma=0;
       
        System.out.println("ingrese los elementos");
        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            vector[i]=leer.nextInt();
            suma+=vector[i];
              }
        for (int i = 0; i < 4; i++) {
            System.out.println(vector[i]);
            
        }
        System.out.println("la suma es: " +suma);
    }
    
}
