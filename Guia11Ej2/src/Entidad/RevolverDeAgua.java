/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author Paola
 */
public class RevolverDeAgua {
    
    private int posicionActual, posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    //• llenarRevolver(): le pone los valores de posición actual y de 
    //posición del agua. Los valores deben ser aleatorios.
    public void llenarRevolver(){
        Random r = new Random();
        this.posicionActual = r.nextInt(6)+1;
        this.posicionAgua = r.nextInt(6)+1;
    }
    
    //• mojar(): devuelve true si la posición del agua coincide con la 
    //posición actual
    public boolean mojar(){
                
        return (this.posicionAgua == this.posicionActual);
    }
    
    //• siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(){
        if (this.posicionActual==6) {
           this.posicionActual=1; 
        }else{
            this.posicionActual++;
        }
    }
    
    //• toString(): muestra información del revolver (posición actual y 
    //donde está el agua)
    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
}
