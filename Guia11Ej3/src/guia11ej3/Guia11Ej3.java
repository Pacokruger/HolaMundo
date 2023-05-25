/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej3;

import Baraja.Baraja;

/**
 *
 * @author Paola
 */
public class Guia11Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Baraja b1 = new Baraja();
    b1.llenarBaraja();
    b1.mostrarBaraja();
    b1.barajar();
   b1.mostrarBaraja();
//    b1.siguienteCarta();
//    b1.cartasDisponibles();
b1.darCartas();
b1.cartasMonton();
    }
    
}
