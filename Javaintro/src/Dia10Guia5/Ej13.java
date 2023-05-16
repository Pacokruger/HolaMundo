/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 */
package Dia10Guia5;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        
        String[] Equipo= new String[4];
        
        Equipo[0]="Paco";
        Equipo[1]="Paola";
        Equipo[2]="Joaquina";
        Equipo[3]="Beltran";
        
        for (int i = 0; i < 4; i++) {
            System.out.println("[" +Equipo[i]+ "]");
        }
                
    }
    
}
