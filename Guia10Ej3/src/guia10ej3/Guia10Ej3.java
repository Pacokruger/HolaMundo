/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej3;

import Servicio.AlumnoServicio;

/**
 *
 * @author Paola
 */
public class Guia10Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            AlumnoServicio sv = new AlumnoServicio();
        
        sv.notaFinal(sv.crearAlumnos());
        
    }
}