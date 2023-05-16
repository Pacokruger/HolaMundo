/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes
o libras. La función tendrá como parámetros, la cantidad de euros y la moneda
a convertir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Dia7;

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
        double cantidadEuros;
        int monedaDestino;
        
        System.out.println("Introduce la cantidad de euros que quieres convertir:");
        cantidadEuros = leer.nextDouble();
        leer.nextLine();
        
        System.out.println("Introduce la moneda a la que quieres convertir (Opcion 1 - Libras / 2 - Dólares / 3 - Yenes):");
        monedaDestino = leer.nextInt();
        
        convertirMoneda(cantidadEuros, monedaDestino);
    }
    
    public static void convertirMoneda(double cantidadEuros, int monedaDestino) {
        double cantidadDestino = 0;
        
        switch (monedaDestino) {
            case 1:
                cantidadDestino = cantidadEuros * 0.86;
                System.out.println(cantidadEuros + " euros son " + cantidadDestino + " libras.");
                break;
            case 2:
                cantidadDestino = cantidadEuros * 1.28611;
                System.out.println(cantidadEuros + " euros son " + cantidadDestino + " dólares.");
                break;
            case 3:
                cantidadDestino = cantidadEuros * 129.852;
                System.out.println(cantidadEuros + " euros son " + cantidadDestino + " yenes.");
                break;
            default:
                System.out.println("Moneda no válida.");
        }
    }
    
}