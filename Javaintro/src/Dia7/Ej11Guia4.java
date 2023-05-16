/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado
y terminada en punto, y luego codifique la palabra o frase ingresada de la
siguiente manera: cada vocal se reemplaza por el carácter que se indica en la
tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.
aeiou
@#$%*

Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package Dia7;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ej11Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la frase y terminela con un punto (.) ");
        String frase = leer.nextLine();
        cambio(frase);
    }

    public static void cambio(String frase) {
        String nfrase = "";
        for (int i = 0; i < frase.length() - 1; i++) {
            switch (frase.charAt(i)) {
                case 'a':
                case 'A':
                    nfrase += "@";
                    break;
                case 'e':
                case 'E':
                    nfrase += "#";
                    break;
                case 'i':
                case 'I':
                    nfrase += "$";
                    break;
                case 'o':
                case 'O':
                    nfrase += "%";
                    break;
                case 'u':
                case 'U':
                    nfrase += "*";
                    break;
                case '.':
                    nfrase += ".";
                    i = frase.length() - 2;
                    break;
                default:
                    nfrase += frase.charAt(i);
            }
        }
        System.out.println(nfrase);
    }
}