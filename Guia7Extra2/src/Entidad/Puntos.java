/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
números y los ingresa en los atributos del objeto. Después, a través de otro 
método calcular y devolver la distancia que existe entre los dos puntos que 
existen en la clase Puntos. Para conocer como calcular la distancia entre dos 
puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Puntos {
    private double x1 ;
    private double x2 ;
    private double y1;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public void crearPuntos() {
    Scanner leer = new Scanner(System.in);  
        System.out.println("Ingrese el punto x1");
        x1 = leer.nextDouble();
        System.out.println("Ingrese el punto y1");
        y1 = leer.nextDouble();
        System.out.println("Ingrese el punto x2");
        x2 = leer.nextDouble();
        System.out.println("Ingrese el punto y2");
        y2 = leer.nextDouble();
    }
    
    public void calcularDistancia ( ) {
        double x = x2 - x1;
        double y = y2 - y1;
        double resultado = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("El resultado es:"+ resultado);
    }
    
    
}
