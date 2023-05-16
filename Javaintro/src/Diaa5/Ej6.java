/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y
el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.


 */
package Diaa5;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion=0;
        int resultado;
        String letra="n";
     do{
        System.out.println("Ingrese una opcion");
        System.out.println("MENU");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");

        Scanner sc = new Scanner(System.in);
        
            System.out.println("Ingrese una opcion");
            opcion=sc.nextInt();
        
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("El resultado de la divicion es: " + resultado);
                    break;
                case 5:
                    
                    System.out.println("Estas seguro q deseas salir del programa(S/N)?");
                    letra = leer.next();

                    if (letra.equals("s"));
                    break;
                    
                    
            }
}
                     while(letra.equals("n"));
            }
}
        

                   
                        
                  
                    
        
            

        
    

    
