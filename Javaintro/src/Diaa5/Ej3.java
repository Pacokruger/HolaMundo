/*
Realizar un programa que solo permita introducir solo frases o palabras de 8
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se debera
́ de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

 */
package Diaa5;

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
        System.out.println("ingrese una frase de 8 letras");
        String frase= leer.next();
        if(frase.length()== 8){
            System.out.println("correcto");   
        }
        else{
            System.out.println("Incorrecto");
        }
    }
    
}
