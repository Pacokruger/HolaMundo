/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones necesarias
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. Utilizar sólo una variable auxiliar.

 */
package Dia6;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros");
        int A=leer.nextInt();
        int B=leer.nextInt();
        int C=leer.nextInt();
        int D=leer.nextInt();
        int aux=B;
        
        System.out.println("Los numeros ingresados son: " +A+ "/" +B+ "/"+C+"/"+D);
      B=C;
      C=A;
      A=D;
      D=aux;
      
       System.out.println("Los nuevos valores son: " +A+ "/" +B+ "/"+C+"/"+D);
    }
    
}
