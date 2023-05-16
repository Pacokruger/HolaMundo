/*
Crear una función rellene un vector con números aleatorios, pasándole un
arreglo por parámetro. Después haremos otra función o procedimiento
que imprima el vector.
 */

package Dia10Guia5;

/**
 *
 * @author Paola
 */
public class EjExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int vector [] = new int [5];
        
        llenarvector(vector);
        mostrarVector(vector);
        }
    
    public static void llenarvector(int[] vector) {
        for (int i = 0; i < 5; i++) {
           vector[i] = (int) (Math.random() * 10 + 1);
        }
        
 }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < 5; i++) {
            System.out.print(vector[i]);
           
        }
        System.out.println("");
    }
    

    }