/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita
un programa para organizar la información de cada curso. Para ello, crearemos una 
clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos
es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de
cada alumno. A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese
el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por 
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana
que se repite el encuentro.

 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class CursoServicio {
    Curso c1 = new Curso();
    Scanner leer  = new Scanner(System.in);

    public void cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del Alumno " + (i + 1));
            alumnos[i] = leer.next();
        }
        c1.setAlumnos(alumnos);
    }

    public void crearCurso() {
        System.out.println("Ingrese Nombre del Curso");
        c1.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese cantidad de horas por dia: ");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dia por semana: ");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el Turno: ");
        c1.setTurno(leer.next());
        System.out.println("Ingrese precio por hora: ");
        c1.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos();
    }

    public void calcularGananciaSemanal() {
        double gananciaSemanal = c1.getCantidadHorasPorDia() * c1.getCantidadDiasPorSemana() * c1.getPrecioPorHora() * c1.getAlumnos().length;
        System.out.println("La Ganacia Semanal es :" + gananciaSemanal);
    }
}
