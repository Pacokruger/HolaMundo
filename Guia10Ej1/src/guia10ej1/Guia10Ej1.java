/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package guia10ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Guia10Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ArrayList<String> perros = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opc;
        do {
            System.out.println("Ingrese una raza de perro");
            perros.add(leer.next());
            System.out.println("¿Desea ingresar otra raza? si/no");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("si"));
        for (String raza : perros) {
            System.out.println(raza);
        }
        
        System.out.println("Ingrese una raza para eliminar de la lista");
        String borrar = leer.next();
        
        Iterator it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().equals(borrar)) {
                it.remove();
     }else{
                System.out.println("La raza no se encuentra en la lista");
     }
            for (String rp : perros) {
            
            System.out.println(rp);
            
        }
    }

}
}

