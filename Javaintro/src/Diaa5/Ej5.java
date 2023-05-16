/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
.
 */
package Diaa5;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero limite");
        int num= leer.nextInt();
        int num2 = 0;
        
        while (num>num2){
            Scanner numero = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int num3= numero.nextInt();
            num2 = num2 + num3;
            
        }
        
        
    }
    
}
