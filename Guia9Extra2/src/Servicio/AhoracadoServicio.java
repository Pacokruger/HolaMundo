/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class AhoracadoServicio {
Scanner leer = new Scanner(System.in);
    Ahorcado h = new Ahorcado();
    
   public void crearJuego(){
       System.out.println("Ingrese una palabra");
       String palabra = leer.next();
       String [] palabraAuxiliar = new String[palabra.length()];
       for (int i = 0; i < palabra.length(); i++) {
           
          palabraAuxiliar[i] = palabra.substring(i, i+1);
          
       }
       System.out.println("Ingrese la cantidad de jugadas máximas");
       h.setJugadasMaximas(leer.nextInt());
       h.setPalabraABuscar(palabraAuxiliar);
   } 
   
   public void longitud(){
       System.out.println("La cantidad de letras es: "+h.getPalabraABuscar().length);
   }
   
   public void buscarLetra(String letra){
       
       int cont = 0;
       String [] progreso = new String [h.getPalabraABuscar().length];
       for (int i = 0; i < h.getPalabraABuscar().length; i++) {
           if (h.getPalabraABuscar()[i].equalsIgnoreCase(letra)) {
               cont += 1;
             progreso[i]= letra;
               
           }
           
       }
       System.out.println(Arrays.toString(progreso));
       
       if (cont > 0) {
           System.out.println("La letra buscada se encuentra: "+ cont +" veces.");
       }else{
           System.out.println("La letra no se encontró :(");
       }
   }
   public void mostrarProgreso(String letra){
       String [] progreso = new String [h.getPalabraABuscar().length];
       for (int i = 0; i < h.getPalabraABuscar().length; i++) {
           if (h.getPalabraABuscar()[i].equalsIgnoreCase(letra)) {
               
             progreso[i]= letra;
               
           }
           
       }
       System.out.println(Arrays.toString(progreso));
   }
   
   public boolean encontradas(String letra){
   /*Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido 
    encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la 
    letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.*/
    int cont1 = 0;
    for (int i = 0; i < h.getPalabraABuscar().length; i++) {
        
           if (h.getPalabraABuscar()[i].equalsIgnoreCase(letra)) {
               cont1 += 1;  
           }
       }
    
       h.setCantidadLetras(h.getCantidadLetras()+cont1);
       if (cont1 > 0) {
           System.out.println("La cantidad de letras encontradas es: " + h.getCantidadLetras());
       }else{
           h.setJugadasMaximas(h.getJugadasMaximas()-1);
       }
       System.out.println("Faltan encontrar:" + (h.getPalabraABuscar().length - h.getCantidadLetras()));
       
       return cont1 > 0;
   }
   
   public void intentos(){
   /*Método intentos(): para mostrar cuántas oportunidades le queda al jugador.*/
       System.out.println("Le quedan: " + h.getJugadasMaximas()+ " intentos");
   }
   
   public void juego(){
   /*Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará 
    cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.*/
   crearJuego();
   longitud();
       do {
            System.out.println("Ingrese una letra a buscar");
            String letra = leer.next();
            buscarLetra(letra);
            encontradas(letra);
            intentos();  
       } while (h.getJugadasMaximas()>0 && h.getCantidadLetras()<h.getPalabraABuscar().length);
       if (h.getJugadasMaximas()==0) {
           System.out.println("Lo siento, te quedaste sin intentos. La palabra era: "+Arrays.toString(h.getPalabraABuscar()) );
       }else{
           System.out.println("Encontraste la palabra");
       }
   
   
   
   }
}
