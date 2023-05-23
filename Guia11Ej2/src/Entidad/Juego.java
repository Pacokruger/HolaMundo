/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Paola
 */
public class Juego {
    ArrayList<Jugador> jugadores;
    private RevolverDeAgua r;
    
    public Juego() {
        this.jugadores=new ArrayList();
        this.r=new RevolverDeAgua();
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.jugadores = jugadores;
        this.r = r;
    }
    
     public void setR(RevolverDeAgua r) {
        this.r = r;
    }
     
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getR() {
        return r;
    }
    
    
    //• llenarJuego(ArrayList<Jugador>jugadores, 
    //Revolver r): este método recibe los jugadores 
    //y el revolver para guardarlos en los atributos del juego.
    public void llenarJuego(ArrayList<Jugador>jugadores, RevolverDeAgua r){
        for (int i = 0; i < 6; i++) {
            Jugador j = new Jugador((i + 1), ("Jugador " + (i + 1)));
            jugadores.add(j);
        }
    }
    
    //• ronda(): cada ronda consiste en un jugador que se apunta con el 
    //revolver de agua y aprieta el gatillo. Sí el revolver tira el agua
    //el jugador se moja y se termina el juego, sino se moja, se pasa al 
    //siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
    //mojar. Al final del juego, se debe mostrar que jugador se mojó.
    //Pensar la lógica necesaria para realizar esto, usando los atributos 
    //de la clase Juego.
    
    public void ronda (ArrayList<Jugador>jugadores, RevolverDeAgua r){
        r.llenarRevolver();
        
        boolean unMojado = false;
        
        do {
            for (Jugador aux : jugadores) {
                System.out.println(r);
                
                System.out.println("Turno del "+aux.getNombre());
                System.out.println("Dispara");
                aux.disparo(r);
                if (aux.isMojado()) {
                    System.out.println("El "+aux.getNombre()+" Se mojó. GAME OVER");
                    unMojado = true;
                    break;
                }
            }
        } while (unMojado==false);
        
//          Iterator <Jugador> it = jugadores.iterator();
//          while (it.hasNext()) {
//            Jugador next = it.next();
//            next.disparo(r);
//            if (next.disparo(r)) {
//                System.out.println(next+"GAME OVER");
//                break;
//            }else{
//            }
//        }
        
    }
}
