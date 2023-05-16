/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej2;

import Servicio.ParDeNumerosServicio;

/**
 *
 * @author Paola
 */
public class Guia9Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ParDeNumerosServicio ps = new ParDeNumerosServicio();
        
        ps.generarValores();
        ps.mostrarValores();
        ps.devolverMayor();
        ps.calcularPotencia();
        ps.calcularRaiz();
    }
    
}
