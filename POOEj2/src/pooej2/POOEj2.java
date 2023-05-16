/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import Entidad.Persona;

/**
 *
 * @author Paola
 */
public class POOEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona1 = new Persona("Gerardo", "Paco", 1986);
        
       
       // System.out.println(persona1.apodo+" "+persona1.edad+" "+persona1.nombre);
        
        persona1.setNombre("Beltran");
        persona1.setApodo("Pipi");
       
        
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApodo());
        System.out.println(persona1.getEdad());
        
        persona1.mostrarPersona();
    }
    
}
