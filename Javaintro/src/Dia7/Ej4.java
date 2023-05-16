/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.

 */
package Dia7;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es primo");
        int num1=leer.nextInt();
        //boolean primo=true;
        if(numeroprimo(num1)){
            System.out.println(num1+ " es primo");
        }else{
            System.out.println(num1+ " no es primo");
        }
    }
    
    public static boolean numeroprimo(int num1){
        int x=1;
        int resultado=0;
        while(x<=num1){
            if (num1%x==0) {
                resultado++;
            }
            x++;
        }
        if (resultado>2) {
            return false;
            }else{
            return true;
        }
        
    }
}
