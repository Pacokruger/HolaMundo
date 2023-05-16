/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package Dia7;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej12Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros q sean multiplos");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
                
        Esmultiplo(num1,num2);        
        
        
        
    }
    
    public static void Esmultiplo(int num1,int num2){
    if (num2 % num1 == 0){
        System.out.println("El " +num1+ " es multiplo de "+num2);
    }else{
        System.out.println("Los numeros no son multiplos");
        
    }
    
    }
}
