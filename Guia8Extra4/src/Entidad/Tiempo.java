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
public class Tiempo {
  private int horas;
    private int min;
    private int seg;

    public Tiempo() {
    }

    public Tiempo(int horas, int min, int seg) {
        this.horas = horas;
        this.min = min;
        this.seg = seg;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
    
    
}