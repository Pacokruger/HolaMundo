/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcoleccionguia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author Paola
 */
public class EjColeccionGuia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
         ArrayList<Integer> listado = new ArrayList();
     TreeSet<String> arbol = new TreeSet();
     HashMap<Integer, String> personas = new HashMap<>();
     
 
       ArrayList <Integer> numerosA = new ArrayList();
       int x = 20;
        for (int i = 0; i < 5; i++) {
            numerosA.add((int)(Math.random()*x)) ;
        }
        for (Integer ejemplo : numerosA) {
            System.out.println(ejemplo);
            
        }
        System.out.println("--------------");
        HashSet <Integer> numerosB = new HashSet();
        int y = 20;
         for (int i = 0; i < 5; i++) {
            numerosB.add((int)(Math.random()*y)) ;
        }
        for (Integer ejemploB : numerosB) {
            System.out.println(ejemploB);
            
        }
        System.out.println("----------------------------------");
        HashMap<Integer,String> alumnos = new HashMap();
        int dni;
        String nombre = "juancito";
        for (int i = 0; i < 5; i++) {
            dni = (int) (i);
            alumnos.put(dni,nombre);
        }
        
           for ( Map.Entry <Integer,String> ejemploC : alumnos.entrySet()) {
            System.out.println("Documento = " + ejemploC.getKey() +  " Nombre = " +  ejemploC.getValue() );
            
        }
        System.out.println("------------------------");
        alumnos.remove(3);
           for ( Map.Entry <Integer,String> ejemploC : alumnos.entrySet()) {
            System.out.println("Documento = " + ejemploC.getKey() +  " Nombre = " +  ejemploC.getValue() );
            
        }

 ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        for (String desayuno : bebidas) {
            
            System.out.println(desayuno);
            
        }
    }

}
    
    
    

