/*
una clase Simulador que va a tener los métodos para manejar los alumnos y sus 
votaciones. Estos métodos serán llamados desde el main.
• La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.
• Se debe imprimir por pantalla el listado de alumnos.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Paola
 */
public class Simulador {
    Random r = new Random();
    private Alumno alumnos;
    
    public Alumno crearAlumnos(){
        
        ArrayList<Alumno> listaAlum = new ArrayList();
        String [] nombres = new String [10];
        String[] apellidos=new String[10];
        nombres[0]="Fede";
        nombres[1]="Luis";
        nombres[2]="Maxi";
        nombres[3]="Ana";
        nombres[4]="Pepa";
        nombres[5]="Lola";
        nombres[6]="Jose";
        nombres[7]="Pablo";
        nombres[8]="Raul";
        nombres[9]="Coco";
        
        apellidos[0]="S";
        apellidos[1]="A";
        apellidos[2]="W";
        apellidos[3]="Q";
        apellidos[4]="P";
        apellidos[5]="I";
        apellidos[6]="Y";
        apellidos[7]="M";
        apellidos[8]="B";
        apellidos[9]="X";
        for (int i = 0; i < 10; i++) {
           listaAlum.add(alumnos.setNombreComp(nombres[r.nextInt(0,9)],apellidos[r.nextInt()]);
           
        }
        return null;
    }
    
    
}
