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
public class EjIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       int num1;
       int num2;
       
        System.out.println("ingrese 2 numeros");
       
       num1 = leer.nextInt();
       num2 = leer.nextInt();
       
       if (num1>25 && num2>25){
           System.out.println("los dos numeros son mayores q 25");
       }else if (num1>25 && num2<25){
        System.out.println("solo el primer numero es mayor q 25");
    }else if (num1<25 && num2>25){
           System.out.println("solo el segundo numero es mayor q 25");
    }else{
           System.out.println("ninguno de los numeros es mayor q 25");
           
           
           
       }
    }
    
}
