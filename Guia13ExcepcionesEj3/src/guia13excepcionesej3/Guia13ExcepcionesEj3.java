/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package guia13excepcionesej3;

import Entidad.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Guia13ExcepcionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String num1;
        String num2;
       
        
        System.out.println("Ingrese el primer número");
        num1=leer.next();
        System.out.println("Ingrese el segundo número");
        num2=leer.next();
        
        
        
        
        DivisionNumero n = new DivisionNumero();
        
        try{
            
        double dividir = n.dividirNumero(num1, num2);
            System.out.println("El resultado de la division es: "+dividir);
        }
        catch (NumberFormatException e1){
            System.out.println("Usted no ingresó un número entero");
        
        }
        
        catch (ArithmeticException e2){
            System.out.println("Lo diviste por cero!!!");
        }
        
        catch (InputMismatchException e3){
            
            System.out.println("La variable no corresponde");
            
        }
        
        //System.out.println("El resultado de la división es " + dividir);
    }
}