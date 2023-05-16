/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia6;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        String socio;
        double valor;
        double tratamiento;
        
        System.out.println("Elija tipo de socio");
        System.out.println("Socio tipo 'A'");
        System.out.println("Socio tipo 'B'");
        System.out.println("Socio tipo 'C'");
        
        socio = leer.next();
        
        switch (socio) {
            case "A":
                System.out.println("Ingrese costo del tratamiento: ");
                valor = leer.nextDouble();
                tratamiento = valor*0.5;
                System.out.println("El costo del tratamiento con 50% descuento es: $"+tratamiento);
                break;
            case "B":
                System.out.println("Ingrese costo del tratamiento: ");
                valor = leer.nextDouble();
                tratamiento = valor*0.65;
                System.out.println("El costo del tratamiento con 35% descuento es: $"+tratamiento);
                break;
            case "C":
                System.out.println("Ingrese costo del tratamiento: ");
                valor = leer.nextDouble();
                tratamiento = valor;
                System.out.println("El costo del tratamiento es: $"+tratamiento);
                break;    
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
        

        }

    }
    
   

