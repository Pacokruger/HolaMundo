/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra5;

import Entidad.Servicio.PassServicio;

/**
 *
 * @author Paola
 */
public class Guia8Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     PassServicio pass1 = new PassServicio();
     
     pass1.datosUsuario();
     pass1.crearPass();
     pass1.analizarPass();
    }
    
}
