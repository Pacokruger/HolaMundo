/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10listalibros;

import java.util.ArrayList;

/**
 *
 * @author Paola
 */
public class Guia10ListaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Crea una lista de Libros y muestra el título de cada uno con un bucle.
        ArrayList <String> libros = new ArrayList();
        libros.add("El principito");
        libros.add("El eternauta");
        libros.add("El alquimista");
        libros.add("Martin Fierro");
        libros.add("Los mitos de Cthulhu");
        libros.add("Cantar de Mio Cid");
        
        for (String titulos : libros) {
            
            System.out.println(titulos);            
        }
    }
    
}
