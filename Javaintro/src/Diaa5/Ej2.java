/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka”
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.

 */
package Diaa5;
import java.util.Scanner;
/**
 *
 * @author Paola
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase= leer.next();
        
        if(frase.equals("eureka")){
            
        
            System.out.println("La clae es correcta");
            
        
        }
        else{
            System.out.println("la frase es incorrecta");
        }
        
        
        
    }
    
}
