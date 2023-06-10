/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ej1animal;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author Paola
 */
public class Guia12Ej1Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Declaracion del objeto perro
   Animal perro1 = new Perro ("Lola","Carne", 10,"Boxer");
   perro1.Alimentarse();
   
   //Declaramos otro objeto perro
   Animal perro2=new Perro("India","Croquetas", 2,"JackRusell");
   perro2.Alimentarse();
   
   //Declaramos un objeto gato
   Animal gato1=new Gato("Pelusa","Galletas",5,"Siames");
           gato1.Alimentarse();
           
           //Declaramos un objeto caballo
           Animal caballo1=new Caballo("Spark","Pasto", 19,"Fino");
                   caballo1.Alimentarse();
    }
    
}
