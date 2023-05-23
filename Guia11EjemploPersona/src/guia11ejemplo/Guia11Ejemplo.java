/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package guia11ejemplo;

/**
 *
 * @author Paola
 */
public class Guia11Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona p1 = new Persona();
        
        p1.setApellido("Kruger");
        p1.setNombre("Paco");
        Dni d = new Dni();
        d.setSerie("A");
        d.setNum(32181233);
        p1.setDni(d);
        
  
        System.out.println(p1.toString());
        
    }
    
}
