/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra3;

import Entidad.Servicio.FraccionServicio;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Guia8Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  FraccionServicio fr = new FraccionServicio();
        Scanner leer = new Scanner(System.in);
        int choice;
        
        fr.llenarValores();
        do {
            System.out.println("Seleccione la operación que desee: \n"
                    + "1: Suma \n"
                    + "2: Resta \n"
                    + "3: Multiplicación \n"
                    + "4: División \n"
                    + "5: Salir \n");
            choice = leer.nextInt();
            switch (choice) {
                case 1:
                    fr.crearSuma();
                    break;
                case 2:
                    fr.crearResta();
                    break;
                case 3:
                    fr.crearMult();
                    break;
                case 4:
                    fr.crearDiv();
                    break;
                case 5:
                    break;
            }
        } while (choice != 5);
        
        
    }
    
}