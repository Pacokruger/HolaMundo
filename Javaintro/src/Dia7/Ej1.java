/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función 
para cada operación matemática y deben devolver sus resultados para imprimirlos
en el main. 
 */
package Dia7;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        int resultado;
        String opcion;
        
        System.out.println("Si desea sumar los numeros ingrese A");
        System.out.println("Si desea restar los numeros ingrese B"); 
        System.out.println("Si desea multiplicar los numeros ingrese C");
        System.out.println("Si desea dividir los numeros ingrese D");
          
        opcion=leer.next();
        
        switch (opcion) {
            case "A":
                resultado=sumar(num1,num2);
                System.out.println("El resultado de la suma es: " +resultado);
                break;
            case "B":
                resultado=restar(num1,num2);
                System.out.println("EL resulta de la resta es: " +resultado);
                break;
            case "C":
                resultado=multiplicar(num1,num2);
                System.out.println(">El resultado de la multiplicacion es: " + resultado);
                break;
            case "D":
                resultado=dividir(num1,num2);
                System.out.println("El resultado de la division es: "+resultado);
                break;
                
                
            default:
                System.out.println("La opcion ingresada es incorrecta");;
        }
    }
    public static int sumar(int num1,int num2){
        int suma= num1 + num2;
        return suma;
    }   
    public static int restar(int num1,int num2){
        int resta=num1 - num2;
        return resta;
    }
    public static int multiplicar(int num1,int num2){
        int multiplicacion=num1*num2;
        return multiplicacion;
    }
    public static int dividir(int num1,int num2){
        int division=num1/num2;
        return division;
    }
}
