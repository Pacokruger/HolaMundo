/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package guia13ej2;

import Entidad.EjemploExcepciones;
import java.util.Arrays;

/**
 *
 * @author Paola
 */
public class Guia13Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        EjemploExcepciones e1 = new EjemploExcepciones();
        
        try{
           e1.llenarArreglo();
                
        }catch(ArrayIndexOutOfBoundsException a1){
            System.out.println("Te pasaste del limite del vector");
            
        }
            
           
        
        
        
    }
    
}



