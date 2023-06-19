/*
Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
 */
package Entidad;

/**
 *
 * @author Paola
 */
public class Persona {
    
    protected String nombre;
    protected String Apellido;
    protected int dni;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String Apellido, int dni, String estadoCivil) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", dni=" + dni + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
    
}
