/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("ingresa tu nombre");
        
        nombre = leer.next();
        
        System.out.println("Hola mundo!! soy : " + nombre + " y estoy programando en java");
    }
    
}
