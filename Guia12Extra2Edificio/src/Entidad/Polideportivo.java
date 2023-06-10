/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package Entidad;

/**
 *
 * @author Paola
 */
 public class Polideportivo extends Edificio {
    
    public String nombre;
    public boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
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
        return "Polideportivo{" + "nombre=" + nombre + ", techado=" + techado + '}';
    }

    @Override
    public void calcularSuperficie() {
        
        System.out.println("La superficie del polodeportivo es: "+largo*ancho);
       
    }

    @Override
    public void calcularVolumen() {
        if (techado==true) {
            System.out.println("El volumen del polideportivo es: "+largo*ancho*alto);   
        }
    
    }
    
    
    
}
