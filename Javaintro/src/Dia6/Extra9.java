/*
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas
es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

 */
package Dia6;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();

        int cociente = 0; // variable para almacenar el cociente
        int residuo = dividendo; // variable para almacenar el residuo

        // Restar el divisor del dividendo hasta que el resultado sea menor que el divisor
        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}
