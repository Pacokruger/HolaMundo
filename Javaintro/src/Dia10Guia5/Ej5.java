/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia10Guia5;

/**
 *
 * @author Paola
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matriz1 = new int[4][4];
        
        for (int i = 0; i < 3; i++) {
            int aux = +1;
             for (int j = 0; j < 3; j++) {
                 aux = aux + 1;
                 matriz[i][j] = aux;
             }             
        }
        System.out.println("Matriz Principal : ");  
        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
               System.out.print(" " + matriz[i][j] + " "); 
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            int aux = +1;
            for (int j = 0; j < 3; j++) {
                aux = aux + 1;
                matriz1[j][i] = aux;
            }
        }
        System.out.println("Matriz Secundaria : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriz1[i][j] + " ");
            }
            System.out.println("");
        }

        boolean sonTraspuestas = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != matriz1[j][i]) {
                    sonTraspuestas = false;
                    break;
                }
            }       
        }    
        if (sonTraspuestas) {
                System.out.println("Las matrices son traspuestas.");
        } else {
                System.out.println("Las matrices no son traspuestas.");
            }
    }
}
