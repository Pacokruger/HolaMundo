/*
//Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada fracción). 
//Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir fracciones. 
//Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

 */
package Entidad.Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class FraccionServicio {
    
      Scanner leer = new Scanner(System.in);
     Fraccion f1 = new Fraccion();
    
    public void llenarValores(){
        System.out.println("Introduzca el numerador del la primera fracción:");
        f1.setNum1(leer.nextInt());
        System.out.println("Introduzca el denominador del la primera fracción:");
        f1.setDen1(leer.nextInt());
        System.out.println("Introduzca el numerador del la segunda fracción:");
        f1.setNum2(leer.nextInt());
        System.out.println("Introduzca el denominador del la segunda fracción:");
        f1.setDen2(leer.nextInt());
    }
    
    public void crearSuma(){
        if (f1.getDen1() == f1.getDen2()) {
            System.out.println("El resultado es:" + (f1.getNum1() + f1.getNum2()) + "/" + (f1.getDen1()));
        } else {
            System.out.println("El resultado es:" + ((f1.getNum1() * f1.getDen2()) + (f1.getNum2() * f1.getDen1())) + "/" + (f1.getDen1() * f1.getDen2()));
        }
    }
    
    public void crearResta(){
        if (f1.getDen1() == f1.getDen2()) {
            System.out.println("El resultado es:" + (f1.getNum1() - f1.getNum2()) + "/" + (f1.getDen1()));
        } else {
            System.out.println("El resultado es:" + ((f1.getNum1() * f1.getDen2()) - (f1.getNum2() * f1.getDen1())) + "/" + (f1.getDen1() * f1.getDen2()));
        }
    }
    
    public void crearMult(){
        System.out.println("El resultado es:" + (f1.getNum1() * f1.getNum2()) + "/" + (f1.getDen1() * f1.getDen2()));
    }
    
    public void crearDiv(){
        System.out.println("El resultado es:" + f1.getNum1() * f1.getDen2() + "/" + f1.getNum2() * f1.getDen1());
    }
}
    

