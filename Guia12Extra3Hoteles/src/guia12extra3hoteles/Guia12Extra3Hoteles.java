/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12extra3hoteles;

import EntidadPadre.Alojamiento;
import Servicio.ServicioAlojamiento;
import java.util.ArrayList;

/**
 *
 * @author Paola
 */
public class Guia12Extra3Hoteles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ServicioAlojamiento a1 = new ServicioAlojamiento();
   
     ArrayList <Alojamiento> lista = a1.listaAlojamientos();
     a1.menu(lista);
     
    }
    
}
