/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre 
y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado,
get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:

Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona
a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha 
de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si
la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package Servicio;

import Entidad.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class PersonaServicio {
    
//    Persona p1=new Persona();
//    Scanner leer = new Scanner(System.in);
//    
//    public Persona crearPersona(){
//        // Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona
//        //a crear. Retornar el objeto Persona creado.
//        
//        System.out.println("Ingrese el nombre");
//        String nombre=leer.nextLine();
//        System.out.println("Ingrese el dia de nacimiento");
//        int dia=leer.nextInt();
//        System.out.println("Ingrese el mes de nacimiento");
//        int mes=leer.nextInt();
//        System.out.println("Ingrese el año de nacimiento");
//        int anio=leer.nextInt();
//        Date fecha=new Date(anio-1900,mes-1,dia);
//        p1.setNacimiento(fecha);
//        return p1;
//    }
//    
//    public int calcularEdad(){
////    Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha 
////de nacimiento y la fecha actual.
//Date fa= new Date();
//int edad=fa.getYear()-p1.getNacimiento().getYear();
//       // System.out.println("tiene :"+ edad + "años");
//        return edad;
////                Date fechaActual = new Date();
////        fechaActual.getTime();
////        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L;
////        long diferenciaEnMilisegundos = fechaActual.getTime() - p.getFechaNacimiento().getTime();
////        int diferenciaEnAnos = (int) Math.round((double) diferenciaEnMilisegundos / milisegundosPorAno);
////        //System.out.println("La edad es de : " + diferenciaEnAnos);
////        return diferenciaEnAnos;
//
//}
//    public boolean menorQue(Persona p1,int edad){
////    Método menorQue recibe como parámetro una Persona y una edad. Retorna true si
////la persona es menor que la edad consultada o false en caso contrario.
////  
//
//return(calcularEdad()>edad);
//}
//    public void mostrarPersona(){
//    //Método mostrarPersona que muestra la información de la persona deseada.
//        System.out.println("el nombre es : "+p1.getNombre());
//        System.out.println("la fecha de nacimiento es :" +p1.getNacimiento());
//        System.out.println("la edad es :"+ calcularEdad());
//    
//}
//}
     Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre");
        String name = leer.next();
        System.out.println("Ingresar el Día de Nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingresar el Mes de Nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingresar el Año de Nacimiento");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        return new Persona(name, fecha);
    }

    /**
     * Método calcularEdad que calcule la edad del usuario utilizando el
     * atributo de fecha de nacimiento y la fecha actual.
     */
    public static Date fechaActual() {
        return new Date();
    }

    public int calcularEdad(Persona objeto) {
        int edad;
        edad = fechaActual().getYear() - objeto.getFechaNacimiento().getYear();
        return edad;
    }

    /**
     * Método menorQue recibe como parámetro una Persona y una edad. 
     * Retorna true si la persona es menor que la edad consultada o false en caso
     * contrario.
     */
    
    public boolean menorQue(Persona pe){
        System.out.println("Ingrese la edad a consultar");
        int edadConsulta = leer.nextInt();
       return edadConsulta > pe.getFechaNacimiento().getYear();
        
    }
    public void mostrarPersona(Persona pe, int edadPer){
         SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(pe.getFechaNacimiento());
        System.out.println("Nombre: " + pe.getNombre() + "," + " Fecha de Nacimiento: " + fecha + "," + " Edad: " + edadPer);
        
    }
    
}

