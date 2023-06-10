/*
 Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class EdificioDeOficinas extends Edificio{
    
    private int numOficinas;
    private int cantPersonas;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantPersonas, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numOficinas=" + numOficinas + ", cantPersonas=" + cantPersonas + ", numPisos=" + numPisos + '}';
    }
    
    

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio es: "+largo*ancho*numPisos);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio es: "+largo*ancho*alto*numPisos);
    }
    
    public void cantPersonas() {
//        De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
        System.out.println("La cantidad de personas por piso es de: " + cantPersonas);
        System.out.println("La cantidad de personas en el edificio es de: " + cantPersonas * numPisos);

    }
    
}
