/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia11ej1;

import Entidad.Perro;
import Personas.Persona;





public class Guia11Ej1 {


    public static void main(String[] args) {
        
    
  

        Perro p1 = new Perro("Lola", "Boxer", 10, "Mediano");
        Perro p2 = new Perro("india", "Jack Rusell", 2, "Chiquito");

        Persona pers1 = new Persona("Pepe", "Lopez", 15, 38383, p1);
        Persona pers2 = new Persona("Pipi", "Ramos", 16, 38384, p2);

        System.out.println(pers1.toString());
        System.out.println(pers2.toString());
        

    }

}
