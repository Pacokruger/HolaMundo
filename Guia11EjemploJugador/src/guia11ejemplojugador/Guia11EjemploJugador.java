/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package guia11ejemplojugador;

/**
 *
 * @author Paola
 */
public class Guia11EjemploJugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Jugador j1 = new Jugador();
        Equipo e1 = new Equipo();
        
        e1.cargarjugador();
  
    }
    
}
