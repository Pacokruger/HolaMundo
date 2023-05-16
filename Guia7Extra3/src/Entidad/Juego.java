/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
jugadores jugar un juego de adivinanza de números. El primer jugador elige un
número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El juego termina cuando el segundo jugador adivina 
el número o se queda sin intentos. Registra el número de intentos necesarios
para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Juego {
    
    private int numeroSecreto;
    private int numeroArriesgado;

    public Juego() {
    }

    public Juego(int numeroSecreto, int numeroArriesgado) {
        this.numeroSecreto = numeroSecreto;
        this.numeroArriesgado = numeroArriesgado;
    }
    
    public void iniciarJuego ( ) {
        Scanner leer = new Scanner ( System.in);
        numeroSecreto = (int) (Math.random()* 10 +1) ;
        int contador = 0;
                 
        do {
            System.out.println("Arriesge un nùmero");  
            System.out.println(+ numeroSecreto);
            numeroArriesgado = leer.nextInt();
            if (numeroArriesgado > numeroSecreto) {
                System.out.println("El numero secreto es menor" );
                }
            else if (numeroArriesgado < numeroSecreto ) {
                System.out.println("El numero secreto es mayor");
            }
            contador ++;
            System.out.println("contador ==  " + contador );
            
        } while (numeroSecreto !=  numeroArriesgado && contador <= 4 );
        if (numeroSecreto ==  numeroArriesgado ) {
            System.out.println("Felicitaciones acertaste el nùmero");
            }
        else    { 
            System.out.println("Se te acabaron los intentos");
                }
        
    }
    
}