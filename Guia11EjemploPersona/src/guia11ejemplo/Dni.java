/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package guia11ejemplo;

/**
 *
 * @author Paola
 */
public class Dni {
    
    private String serie;
    private int num;
   // private Persona persona;

    public Dni() {
    }

    public Dni(String serie, int num) {
        this.serie = serie;
        this.num = num;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

   /* public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    */
    

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", num=" + num + '}';
    }
    
    
    
}
