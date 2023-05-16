/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package guia9ej3;

import Entidad.Servicio.ArregloServicio;
import java.util.Arrays;

/**
 *
 * @author Paola
 */
public class Guia9Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
double [] arregloA = new double [50];
        double [] arregloB = new double [20];
        
        ArregloServicio sa = new ArregloServicio();
        
        sa.inicializarA(arregloA);
        System.out.println("**********");
        sa.Mostra(arregloA);
        System.out.println("**********");
        sa.Ordenar(arregloA);
        System.out.println("**********");
        sa.inicializarB(arregloB, arregloA);
        
        //En el Main nuevamente: inicializar A, mostrar A, ordenar A, 
        //inicializar B, mostrar A y B.
        
        System.out.println("***INICIALIZAR NUEVAMENTE A***");
        for (int i = 0; i < 50; i++) {
             Arrays.fill(arregloA, i, i+1, (double) (Math.random() * 10 + 1));
             System.out.println("["+arregloA[i]+"]");
        }
        
        System.out.println("***ORDENAR NUEVAMENTE A*****");
        Arrays.sort(arregloA);
        for (int i = 0; i < 50; i++) {
            System.out.println("["+arregloA[i]+"]");
        }
    
        System.out.println("***INICIALIZAR NUEVAMENTE B***");
        for (int i = 0; i < 20; i++) {
             Arrays.fill(arregloB, i, i+1, (double) (Math.random() * 10 + 1));
             System.out.println("["+arregloB[i]+"]");
        }
    }
}