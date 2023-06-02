/*
El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:

nombre completo, DNI y cantidad de votos.
 */
package Entidad;

/**
 *
 * @author Paola
 */
public class Alumno {
    
    private String nombreComp;
    private int dni;
    private int cantVotos;

    public Alumno() {
    }

    public Alumno(String nombreComp, int dni, int cantVotos) {
        this.nombreComp = nombreComp;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public String getNombreComp() {
        return nombreComp;
    }

    public void setNombreComp(String nombreComp) {
        this.nombreComp = nombreComp;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreComp=" + nombreComp + ", dni=" + dni + ", cantVotos=" + cantVotos + '}';
    }
    
    
    
}
