/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import java.util.Arrays;

/**
 *
 * @author Paola
 */
public class ArregloServicio {
double [] arregloA = new double [50];
        double [] arregloB = new double [20];
        
        ArregloServicio sa = new ArregloServicio();
        
      public void inicializarA(double [] arregloA){
        
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (double) (Math.random() * 10 + 1);
        }
    }
    
    public void Mostra(double [] arregloA){
        System.out.println("Mostrar A");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("["+arregloA[i]+"]");
            
        }
        
    }
    
    public void Ordenar(double [] arregloA){
        System.out.println("Ordenar A");
        Arrays.sort(arregloA);
        for (int i = arregloA.length-1; i > 0 ; i--) {
             System.out.println("["+arregloA[i]+"]");
        }
        
    }
     public void inicializarB(double [] arregloB,double [] arregloA){
         System.out.println("Inicializar y mostrar arreglo B");
        for (int i = 0; i < 10; i++) {
         Arrays.fill(arregloB, i, i+1, arregloA[i]);
         Arrays.fill(arregloB, 10, 20, 0.5);
        }
         for (int i = 0; i < arregloB.length; i++) {
             System.out.println("["+arregloB[i]+"]" ); 
         }
 
         
    }
} 
    