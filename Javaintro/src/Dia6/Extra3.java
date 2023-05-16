/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
función equals() de la clase String.

 */
package Dia6;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra=leer.next();
        if (letra.equalsIgnoreCase("A") ||letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
        System.out.println("La letra ingresada es una vocal");
           }else{
                System.out.println("La letra ingresada no es una vocal");
                }
            
        }
    }
    

