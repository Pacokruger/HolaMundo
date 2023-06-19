/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class EjemploExcepciones {
    
    public void llenarArreglo(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
     String[] vector = new String [3];
     
        for (int i = 0; i < 4; i++) {
            System.out.println("INGRESE EL NOMBRE DE LA PERSONA "+(i+1));
            vector[i] = leer.next();
        }
            
        }

}
