/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará
 */
package guia10ej5;

import Servicio.PaisServicio;
import java.util.HashSet;

/**
 *
 * @author Paola
 */
public class Guia10Ej5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     PaisServicio ps = new PaisServicio();
     
        ps.cargarPais();
        ps.mostrarPais();
        System.out.println("---------------");
        ps.ordenarPais();
        System.out.println("---------------");
        ps.eliminarPais();
        System.out.println("---------------");
        ps.ordenarPais();
    }
    
}
