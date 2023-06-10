/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Velero extends Barco {
    
    private int veleros;
    
    public int modulo(){
        /**
         * por un valor módulo de cada barco 
         * (obtenido simplemente multiplicando por 10 los metros de eslora)
         */
        super.eslora = super.eslora * 10 + veleros;
        return super.eslora;
    }

    public Velero(int veleros, int eslora, int matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.veleros = veleros;
    }

    public Velero() {
    }

    public int getVeleros() {
        return veleros;
    }

    public void setVeleros(int veleros) {
        this.veleros = veleros;
    }

    @Override
    public String toString() {
        return "Veleros{" + "veleros=" + veleros + '}' + super.toString();
    }
    
    

}