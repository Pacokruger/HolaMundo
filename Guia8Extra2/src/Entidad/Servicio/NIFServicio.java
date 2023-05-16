/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class NIFServicio {
    
  Scanner leer = new Scanner(System.in);
     NIF dni = new NIF();
    
    public void crearNIF(){
        int resto;
        System.out.println("Ingrese su número de DNI:");
        dni.setDNI(leer.nextLong());
        String[] vector = new String [23];
        vector[0] = "T";
        vector[1] = "R";
        vector[2] = "W";
        vector[3] = "A";
        vector[4] = "G";
        vector[5] = "M";
        vector[6] = "Y";
        vector[7] = "F";
        vector[8] = "P";
        vector[9] = "D";
        vector[10] = "X";
        vector[11] = "B";
        vector[12] = "N";
        vector[13] = "J";
        vector[14] = "Z";
        vector[15] = "S";
        vector[16] = "Q";
        vector[17] = "V";
        vector[18] = "H";
        vector[19] = "L";
        vector[20] = "C";
        vector[21] = "K";
        vector[22] = "E";
        
        resto =(int) dni.getDNI() % 23;
        System.out.println(resto);
        String letra = vector[resto];
        dni.setLetra(letra);
    }
    
    public void mostrar(){
        System.out.println(dni.getDNI() + "-" + dni.getLetra());
    }
}