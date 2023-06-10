/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ej2electrodomestico;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Paola
 */
public class Guia12Ej2Electrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> e1 = new ArrayList();
  
        Lavadora a1 = new Lavadora();
        
//        a1.crearLavadora();
//        a1.precioFinal();
//        System.out.println(a1);
        
        Televisor t1 = new Televisor();
        
//        t1.crearTelevisor();
//        t1.precioFinal();
//        System.out.println(t1);
        
        Lavadora a2 = new Lavadora(23, 300, "verde", 'D', 78);
        Lavadora a3 = new Lavadora(34, 550, "violeta", 'A', 45);
        
        Televisor t2 = new Televisor(50, true, 1000, "gris", 'T', 90);
        Televisor t3 = new Televisor(43, true, 500, "negro", 'E', 24);
        
        e1.add(a2);
        e1.add(a3);
        e1.add(t2);
        e1.add(t3);
        
        for (Electrodomestico aux : e1) {
            aux.precioFinal();
            System.out.println(aux);
            
        }
      
    }
    
}
