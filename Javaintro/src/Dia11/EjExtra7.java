/*
Realizar un programa que complete un vector con los N primeros números de la 
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión 
de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...

 */
package Dia11;

/**
 *
 * @author Paola
 */
public class EjExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int n = 8;
        int a = 1;
        int b = 0;
        int c;
        int vector[] = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = a;
            c = a + b;
            b = a;
            a = c;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
    }
}