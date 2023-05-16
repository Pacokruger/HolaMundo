/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
concluida la ubicación de las palabras, rellene los espacios no utilizados con
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package Dia10Guia5;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class EjExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int numRandom = (int) (Math.random() * 10 + 0);
                String numRandomString = Integer.toString(numRandom);
                matriz[i][j] = numRandomString;
            }
        }
        
        String palabra = "";
        int fila = (int) (Math.random() * 20 + 0);
        int columna = (int) (Math.random() * 10 + 0);
        int contador = 0;
        for (int k = 0; k < 5; k++) {
            do {
                System.out.println(" Ingrese una palabra " + (k + 1) + " tiene que tener de entre 3 y 5 caracteres");
                palabra = leer.next();
            } while (palabra.length() < 3 || palabra.length() > 5);
            fila = (int) (Math.random() * 20 + 0);
            columna = (int) (Math.random() * 10 + 0);
            contador = 0;
            for (int i = columna; i < (columna + palabra.length()); i++) {
                matriz[fila][i] = palabra.substring(contador, contador + 1);
                contador++;
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}
