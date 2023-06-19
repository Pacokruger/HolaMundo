/*
Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 */
package Entidad;

/**
 *
 * @author Paola
 */
public class Empleado extends Persona {
    
    protected int anioIncorporacion;
    protected int numDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int numDespacho, String nombre, String Apellido, int dni, String estadoCivil) {
        super(nombre, Apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
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
        return "Empleado{" + "anioIncorporacion=" + anioIncorporacion + ", numDespacho=" + numDespacho + '}';
    }
    
    
    
    
}
