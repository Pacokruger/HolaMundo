/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
 */
package Servicio;

import Entidad.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class AlumnoServicio {
  ArrayList <Alumnos> listaAlumnos = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public ArrayList <Alumnos> crearAlumnos(){
        String respuesta;
        do {
            Alumnos a = new Alumnos();
            System.out.println("Agregar un Nombre");
            a.setNombre(leer.nextLine());
            
            System.out.println("Ingresar las Notas");
            ArrayList <Integer> notas = a.getNotas();
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Nota "+(i+1));
                notas.add(leer.nextInt());
            }
            a.setNotas(notas);
            
            System.out.println("Desea agregar más Alumnos?(S/N)");
            respuesta=leer.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
        
        return listaAlumnos;
    }
    
    public void notaFinal( ArrayList <Alumnos> listaAlumnos){
        
        System.out.println("Ingresar el Nombre del Alumno a Buscar");
        String nombre = leer.nextLine();
        boolean encontrada=false;
        
        for (Alumnos aux : listaAlumnos) {
            System.out.println(aux);
            
            if (aux.getNombre().equals(nombre)) {
                encontrada=true;
                if (encontrada) {
                    int notas=0;
                
                for (Integer n : aux.getNotas()) {
                     notas +=n;                            
                }
                double promNotas = (double) (notas/aux.getNotas().size());
                System.out.println("El promedio es "+promNotas);
                }
            }
        }
        if (encontrada==false) {
            System.out.println("Alumno no Encontrado");
        }
    }
}
