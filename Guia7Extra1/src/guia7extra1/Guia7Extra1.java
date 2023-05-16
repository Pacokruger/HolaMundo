/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título 
y el autor a cadenas vacías y otro que reciba como parámetros el título y el 
autor de la canción. Se deberán además definir los métodos getters y setters 
correspondientes.
 */
package guia7extra1;

import Entidad.Cancion;

/**
 *
 * @author Paola
 */
public class Guia7Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion( );
        
        cancion1.setTitulo("La ciudad de la furia");
        cancion1.setAutor("Cerati");
        System.out.println("Este es el tiulo:"+ cancion1.getTitulo());
       
        System.out.println("Este es el autor:"+ cancion1.getAutor());
        
    }
    
}
