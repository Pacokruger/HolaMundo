/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej4;

import Servicio.FechaServicio;

/**
 *
 * @author Paola
 */
public class Guia9Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
FechaServicio sf = new FechaServicio();
        
        
        System.out.println(" La fecha actual es:"+ sf.fechaActual());
        System.out.println("La edad es:"+sf.diferencia(sf.fechaActual(), sf.fechaNacimiento()));
        
       
    }
    
}

