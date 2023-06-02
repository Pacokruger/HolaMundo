/*
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package Servicio;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CineServicio {
    
    ArrayList <Espectador> espectadores = new ArrayList();
    
    String [][] salaOcupada = new String[8][6];
    
    public Pelicula ingresarPelicula(Pelicula p) throws InterruptedException {

        System.out.println("---CARGANDO PELICULA---");
        Thread.sleep(1000);
        System.out.println("Ingresando Nombre: Interstelar");
        p.setTitulo("Inception");
        Thread.sleep(800);
        System.out.println("Ingresando Director: Christopher Nolan");
        p.setDirector("Christopher Nolan");
        Thread.sleep(800);
        System.out.println("Edad Minima : 13");
        p.setEdadMin(13);
        Thread.sleep(800);
        System.out.println("Duracion : 160 min");
        p.setDuracion(2);
        Thread.sleep(800);
        
        System.out.println(" ");
        return p;
    }
    
    public ArrayList agregarExpectadores(){
    
        Espectador e1 = new Espectador("Julián", 16, 2100);
        Espectador e2 = new Espectador("Carla", 12, 2000);
        Espectador e3 = new Espectador("Diana", 36, 1500);
        Espectador e4 = new Espectador("Lautaro", 42, 2500);
        Espectador e5 = new Espectador("Nicolá", 13, 1200);
        Espectador e6 = new Espectador("Alejandra", 18, 1700);
        Espectador e7 = new Espectador("Felipe", 21, 5000);
        Espectador e8 = new Espectador("Marina", 9, 3000);
        Espectador e9 = new Espectador("Hernán", 21, 1850);
        Espectador e10 = new Espectador("Manuel", 38, 3400);
        Espectador e11 = new Espectador("Sebastián", 55, 4500);
        Espectador e12 = new Espectador("Claudia", 18, 2200);
        
        espectadores.add(e1);
        espectadores.add(e2);
        espectadores.add(e3);
        espectadores.add(e4);
        espectadores.add(e5);
        espectadores.add(e6);
        espectadores.add(e7);
        espectadores.add(e8);
        espectadores.add(e9);
        espectadores.add(e10);
        espectadores.add(e11);
        espectadores.add(e12);
        
        for (Espectador aux : espectadores) {
            System.out.println(aux);
        }
        System.out.println(" ");
        
        return espectadores;
    }
    
//    public int numAleatorio(int max, int min){
//         int numAl=(int) (Math.random()*(max-min)+min);
//         return numAl;
//    }

    
    public String[][] inicializarSala(Cine c1) throws InterruptedException{
        System.out.println("---INICIALIZANDO SALA---");
        Thread.sleep(400);
        for (int i = 8 - 1; i >= 0; i--){
      
            for (int j = 0; j < 6; j++) {
                if (j==0) {
                     c1.getSalaCine()[i][j]= i+1 + "A" + "-";
                }
                if (j==1) {
                     c1.getSalaCine()[i][j]= i+1 + "B" + "-";
                }
                if (j==2) {
                     c1.getSalaCine()[i][j]= i+1 + "C" + "-";
                }
                if (j==3) {
                     c1.getSalaCine()[i][j]= i+1 + "D" + "-";
                }
                if (j==4) {
                     c1.getSalaCine()[i][j]= i+1 + "E" + "-";
                }
                if (j==5) {
                     c1.getSalaCine()[i][j]= i+1 + "F" + "-";
                }
 
            }
        }
        Thread.sleep(2000);
        return c1.getSalaCine();
    }

    
    public void asignarAsiento(Cine c1, Pelicula p, Espectador e) throws InterruptedException{
        System.out.println("---ASIGNANDO ENTRADAS PARA INTERSTELAR---");
        c1.setPrecio(1800);
        
        for (Espectador aux : espectadores) {
            if (aux.getDinero()>=c1.getPrecio() && aux.getEdadE()>= p.getEdadMin()) {
                int i;
                int j;
                do {
                    i=(int) (Math.random()*(8-0)+0);
                    j=(int) (Math.random()*(6-0)+0);
                } while (c1.getSalaCine()[i][j].equalsIgnoreCase("-"));
                c1.getSalaCine()[i][j]="X";
            }
            if (aux.getEdadE()< p.getEdadMin()) {
                System.out.println("El Espectador " + aux.getNombre() + " no tiene la edad suficiente para ver esta Película");
                Thread.sleep(2000);
            }else{if (aux.getDinero()<c1.getPrecio()){
            System.out.println("El Espectador " + aux.getNombre() + " no tiene dinero suficiente para ver esta Película");
                Thread.sleep(2000);
            }                
            }
        }
        System.out.println(" ");
    }
    
    public void mostrarSalaCine(Cine c1) throws InterruptedException {
        System.out.println("---MOSTRANDO ASIENTOS OCUPADOS---");
        Thread.sleep(500);
     for (int i = 8 - 1; i >= 0; i--){
            for (int j = 0; j < 6; j++) {
                System.out.print(c1.getSalaCine() [i][j] + " ");
            }
            System.out.println("");
        }
    }

}

