/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Servicio;

import Perro.Perro;
import Persona.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Adopcion {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Persona> listaPersonas = new ArrayList();
    private ArrayList<Perro> listaPerros = new ArrayList();
    
    public void listaPersonas(){
        System.out.println("--LISTA DE PERSONAS--");
        Persona pers1 = new Persona("Pepe", "Lopez", 15, 38383, null);
        Persona pers2 = new Persona("Pipi", "Ramos", 16, 38384, null);
        listaPersonas.add(pers1);
        listaPersonas.add(pers2);
        for (Persona aux : listaPersonas) {
            System.out.println(aux);
        }
        String resp;
        do {
            System.out.println("DESEA INGRESAR OTRA PERSONA? S/N ");
            resp = leer.next();
            if (resp.equalsIgnoreCase("s")) {
                crearPersonas();
            } else {
                System.out.println("GRACIAS");
            }
        } while (resp.equalsIgnoreCase("s"));

    }

    public void listaPerros(){
        System.out.println("--LISTA DE PERROS--");
          Perro p1 = new Perro("Lola", "Boxer", 10, "Mediano",false);
        Perro p2 = new Perro("india", "Jack Rusell", 2, "Chiquito",false);
        listaPerros.add(p1);
        listaPerros.add(p2);
        for (Perro aux : listaPerros) {
            System.out.println(aux);
        }
        String resp;
        do {
            System.out.println("DESEA INGRESAR OTRO PERRO? S/N ");
            resp = leer.next();
            if (resp.equalsIgnoreCase("s")) {
                crearPerros();
            } else {
                System.out.println("GRACIAS");
            }
        } while (resp.equalsIgnoreCase("s"));

    }
    public void crearPersonas() {

        
            Persona p1 = new Persona();
            System.out.println("INGRESE EL NOMBRE DE LA PERSONA");
            p1.setNombre(leer.next());
            System.out.println("INGRESE EL APELLIDO");
            p1.setApellido(leer.next());
            System.out.println("INGRESE LA EDAD");
            p1.setEdad(leer.nextInt());
            System.out.println("INGRESE EL DOCUMENTO");
            p1.setDocumento(leer.nextInt());

            listaPersonas.add(p1);
        }
    

    public void crearPerros() {

            Perro pe1 = new Perro();
            System.out.println("INGRESE EL NOMBRE DEL PERRO");
            pe1.setNombre(leer.next());
            System.out.println("INGRESE LA RAZA");
            pe1.setRaza(leer.next());
            System.out.println("INGRESE LA EDAD");
            pe1.setEdad(leer.nextInt());
            System.out.println("INGRESE EL TAMAÑO");
            pe1.setTamanio(leer.next());

            listaPerros.add(pe1);
        
    }

    public void adoptar() {
        for (Persona aux : listaPersonas) {
            System.out.println(" ");
            System.out.println(aux.getNombre() + " ELIJA EL PERRO Q QUIERE ADOPTAR");
            System.out.println(" ");
            System.out.println("LISTA DE PERROS PARA ADOPTAR");
            for (Perro aux1 : listaPerros) {
                System.out.println(aux1);
            }
            String adoptar = leer.next();
            for (Perro aux1 : listaPerros) {
                if (aux1.getNombre().equalsIgnoreCase(adoptar)) {
                    if (aux1.isAdoptado()) {
                        System.out.println("LO SIENTO ESTE PERRO YA FUE ADOPTADO");
                        break;
                    } else {
                        System.out.println("FELICITACIONES AH ADOPTADO UN PERRITO");
                    }
                    aux.setPerro(aux1);
                    aux1.setAdoptado(true);
                }

            }

        }
        for (Persona aux : listaPersonas) {
            System.out.println(aux);
        }
    }
}
