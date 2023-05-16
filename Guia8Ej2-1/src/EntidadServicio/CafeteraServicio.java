/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadServicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class CafeteraServicio {
    
 Scanner leer = new Scanner(System.in);

    Cafetera c1 = new Cafetera();

    public void llenarCafetera() {
        System.out.println("Cual es la capacidad maxima de la cafetera :");
        c1.setCapacidadMaxima(leer.nextInt());

        c1.setCantidadActual(c1.getCapacidadMaxima());
    }

    public void servirTaza() {
        System.out.println("Ingrese el tamaño de la taza vacia");
        int tamTaza = leer.nextInt();

        if (tamTaza > c1.getCantidadActual()) {

            System.out.println("La taza se lleno con la cantidad que habia en la cafetera");
            System.out.println("La taza se lleno un " + c1.getCantidadActual() * 100 / tamTaza + " % ");
            c1.setCantidadActual(0);

        } else {
            System.out.println("La taza se lleno por completo");
            c1.setCantidadActual(c1.getCantidadActual() - tamTaza);
        }
    }
    public void vaciarCafetera() {
        c1.setCantidadActual(0);
    }
      public void agregarCafe(){
            }
}
