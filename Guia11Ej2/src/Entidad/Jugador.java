/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Paola
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        this.mojado=false;
    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    //• disparo(Revolver r): el método, recibe el revolver de 
    //agua y llama a los métodos de mojar() y siguienteChorro() 
    //de Revolver. 
    //El jugador se apunta, aprieta el gatillo y si el
    //revolver tira el agua, el jugador se moja. El atributo 
    //mojado pasa a false y el método devuelve true, sino false.
    
    public boolean disparo(RevolverDeAgua r){
         if (r.mojar()) {
            mojado = true;
        }
        r.siguienteChorro();
        return mojado;
    }
}
