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
public class Ahorcado {
    String [] palabraABuscar;
    private int cantidadLetras;
    private int jugadasMaximas;
    String[] progreso;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraABuscar, int cantidadLetras, int jugadasMaximas, String[] progreso) {
        this.palabraABuscar = palabraABuscar;
        this.cantidadLetras = cantidadLetras;
        this.jugadasMaximas = jugadasMaximas;
        this.progreso = progreso;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getProgreso() {
        return progreso;
    }

    public void setProgreso(String[] progreso) {
        this.progreso = progreso;
    }
    
    
    
}
