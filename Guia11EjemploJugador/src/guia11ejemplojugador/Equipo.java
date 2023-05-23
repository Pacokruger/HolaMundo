/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package guia11ejemplojugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Equipo {
    Scanner leer = new Scanner(System.in);
   private ArrayList<Jugador> listaJug= new ArrayList();

    public Equipo() {
    }

    public ArrayList<Jugador> getListaJug() {
        return listaJug;
    }

    public void setListaJug(ArrayList<Jugador> listaJug) {
        this.listaJug = listaJug;
    }
   
   
   
   public void cargarjugador(){
   String opcion;
  
   
       do {
           Jugador j = new Jugador();
           System.out.println("Ingrese el nombre del jugador");
           j.setNombre(leer.next());
           System.out.println("Ingrese el apellido del jugador");
           j.setApellido(leer.next());
           System.out.println("Ingrese la posicion del jugador");
           j.setPosicion(leer.next());
           System.out.println("Ingrese el numero del jugador");
           j.setNum(leer.nextInt());
           
           listaJug.add(j);
           
           
           
           System.out.println("Desea agregar otro jugador? S/N");
           opcion=leer.next();
           
           
       } while (opcion.equalsIgnoreCase("S"));
       
       for (Jugador aux : listaJug) {
           System.out.println(aux);
       }
   
   }
   
    
}
