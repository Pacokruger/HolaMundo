/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra2;

import Entidad.Servicio.NIFServicio;

/**
 *
 * @author Paola
 */
public class Guia8Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  NIFServicio nif1 = new NIFServicio();
        
        nif1.crearNIF();
        nif1.mostrar();
    }
    
}
