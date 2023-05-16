/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia4;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class EjWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num1;
        do{
        System.out.println("Ingrese una nota entre 0 y 10");
        num1 = leer.nextInt();
       
        } while(num1<0 || num1>10);
            System.out.println("Ud ingreso una nota correcta");
            
           
        } 
    }

            
        
    
        
        

        
        
        
    
    

