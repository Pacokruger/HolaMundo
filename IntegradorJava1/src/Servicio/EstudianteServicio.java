/*
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package Servicio;

import Entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class EstudianteServicio {
    
    Scanner leer = new Scanner(System.in);
    Estudiante e1=new Estudiante();
    
    public void llenarEstudiante(){
        
        Estudiante[] estudiante = new Estudiante[3];
        double sumanota = 0;
       

        for (int i = 0; i < estudiante.length; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            e1.setNombre(leer.next());
            System.out.println("Ingrese la nota");
            e1.setNota(leer.nextDouble());
            estudiante[i] = new Estudiante(e1.getNombre(), e1.getNota());
           sumanota += e1.getNota();
        }
        for (int i = 0; i < estudiante.length; i++) {
            System.out.println(estudiante[i]);

        }
        System.out.println("el promedio es :" + sumanota / estudiante.length);
        double promedio=sumanota / estudiante.length;

        int cont = 0;
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].getNota() > promedio) {
                cont++;
               
            }
            
            }
         String[] promEst = new String[cont];
         cont=0;
        for (int i = 0; i < estudiante.length; i++) {
            
            if (estudiante[i].getNota() > promedio) {
                promEst[cont]=estudiante[i].getNombre();
                cont++;
                
            }
            
                
        }
        for (int i = 0; i <promEst.length ; i++) {
            System.out.println("el alumno q supera el promedio es: " +promEst[i]);
        }
        
        
}
    

}
