/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package Dia4;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class EjFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cuatro numeros entre 1 y 20");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        int num3= leer.nextInt();
        int num4= leer.nextInt();
        
        System.out.print(+num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
        System.out.print(+num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
            
        }
        
        System.out.println("");
        System.out.print(+num3);
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
        System.out.print(+num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
    }
    
}
