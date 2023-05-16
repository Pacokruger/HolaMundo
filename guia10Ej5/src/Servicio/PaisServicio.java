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
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Paola
 */
public class PaisServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    HashSet<String> paisSet = new HashSet();

    public HashSet<String> cargarPais() {

        int opcion = 0;

        do {
            Pais p1 = new Pais();
            System.out.println("Ingrese el nombre de un pais");
            p1.setNombre(leer.next());
            paisSet.add(p1.getNombre());

            System.out.println("Desea agregar otro pais 1-Si/ 2-No");
            opcion = leer.nextInt();

        } while (opcion == 1);
        return paisSet;
    }

    public void mostrarPais() {

        for (String pai : paisSet) {
            System.out.println(pai);

        }
    }

    public void ordenarPais() {

        ArrayList<String> listaPais = new ArrayList(paisSet);
        Collections.sort(listaPais);
        for (String aux : listaPais) {
            System.out.println(aux);
        }

    }

    public void eliminarPais() {
        Iterator it = paisSet.iterator();
        System.out.println("Ingrese el pais q desea eliminar");
        String eliminado = leer.next();
        while (it.hasNext()) {
            if (it.next().equals(eliminado)) {
                it.remove();

            } 
            for (String aux : paisSet) {

                System.out.println(aux);
            }
        }
    }
}
