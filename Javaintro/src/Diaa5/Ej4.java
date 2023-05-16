/*
Escriba un programa que pida una frase o palabra y valide si la primera letra
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se debera
imprimir “INCORRECTO”. Nota: investigar la función Substring y equals()de Java.
 */
package Diaa5;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase= leer.next();
        String letra=frase.substring(0,1);
        if (letra.equals("A")||letra.equals("a") ){
            System.out.println("La primer letra es una a");
        }
        else{
            System.out.println("La primer letra no es una A");
        }
    }
    
}
