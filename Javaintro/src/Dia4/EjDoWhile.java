/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el usode la sentencia break.
 */
package Dia4;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class EjDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num1, j, suma;
        suma=0;
        j=1;
        do{
          
               System.out.println("ingrese un numero");
            num1 = leer.nextInt();
            j++;
            if (num1<0)
                continue;
           else if(num1!=0)

                suma +=num1;
                
            else{
                System.out.println("Se ha detectado el numero 0");
                break;
            }
            
         }while (j<=20);
        System.out.println("la suma de los numeros es: " + suma);
         
            
               
                
      
    
    
}
        }

