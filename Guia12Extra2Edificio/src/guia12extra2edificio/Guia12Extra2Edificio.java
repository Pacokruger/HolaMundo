/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12extra2edificio;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Paola
 */
public class Guia12Extra2Edificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
//dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
//métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
//superficie y el volumen de cada edificio.
//Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
//techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
//cantPersonas() y mostrar los resultados de cada edificio de oficinas.
        ArrayList<Edificio> listaEdificio = new ArrayList();
        Edificio e1 = new Polideportivo("Bombonera", true, 10, 5, 20);
        Edificio e2 = new Polideportivo("Gallinero", false, 10, 2, 10);
        Edificio e3 = new EdificioDeOficinas(10, 15, 5, 4, 2, 5);
        Edificio e4 = new EdificioDeOficinas(5, 20, 5, 5, 3, 10);

        listaEdificio.add(e1);
        listaEdificio.add(e2);
        listaEdificio.add(e3);
        listaEdificio.add(e4);

        for (Edificio aux : listaEdificio) {

            System.out.println(aux);
            System.out.println(" ");
            aux.calcularSuperficie();
            System.out.println(" ");
            aux.calcularVolumen();
            System.out.println("--------------------");
        }

        System.out.println("***************************************************");

        // Contar polideportivos techados y abiertos
        int techados = 0;
        int abiertos = 0;

         for (Edificio aux1 : listaEdificio) {
            if (aux1 instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) aux1;
            if (((Polideportivo) aux1).isTechado()) {
                    techados++;
              } else{
                    abiertos++;
                }
                }
            }

       
        System.out.println("La cantidad de polideportivos techados es: " + techados);
        
        System.out.println("La cantidad de polideportivos abiertos es: " + abiertos);
        
        System.out.println("***************************************************");
        
        //contamos la cantidad de personas q trabajan en cada edificio
        for (Edificio aux2 : listaEdificio) {
            if (aux2 instanceof EdificioDeOficinas) {
                ((EdificioDeOficinas) aux2).cantPersonas();

            }
        }
         System.out.println("-------------------");
    }

}
