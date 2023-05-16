/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el
radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el 
atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Circunferencia {
    
        private double radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public Circunferencia() {
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia()  {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia ");
        radio = leer.nextDouble();
               
     }
    public void area()  {
        
        double area= 3.14 * (radio * radio) ;
        System.out.println("El area es: "+ area);
        System.out.println(" el radio es:"+radio);
               
    }
    
    public void perimetro()  {
        
        double perimetro = 2 * 3.14 * radio ;
        System.out.println("El perimetro es "+perimetro);
    
}
}
