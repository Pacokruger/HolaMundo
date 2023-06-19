/*
En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
 */
package Entidad;

/**
 *
 * @author Paola
 */
public class Estudiante extends Persona {
    
    protected int matricula;

    public Estudiante() {
    }

    public Estudiante(int matricula, String nombre, String Apellido, int dni, String estadoCivil) {
        super(nombre, Apellido, dni, estadoCivil);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
        return "Estudiante{" + "matricula=" + matricula + '}';
    }
    
    
}
