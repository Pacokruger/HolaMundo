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
public class Yate extends Barco {
     private int numCamarotes;

    private int PontCV;
   
    
    @Override
    public int modulo() {
        /**
         * por un valor módulo de cada barco (obtenido simplemente multiplicando
         * por 10 los metros de eslora)
         */
        super.eslora = super.eslora * 10 + numCamarotes + PontCV;
        return super.eslora;
    }

    public Yate() {
    }

    public Yate(int numCamarotes, int PontCV, int eslora, int matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.numCamarotes = numCamarotes;
        this.PontCV = PontCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public int getPontCV() {
        return PontCV;
    }

    public void setPontCV(int PontCV) {
        this.PontCV = PontCV;
    }

    @Override
    public String toString() {
        return "YatesdeLujo{" + "numCamarotes=" + numCamarotes + ", PontCV=" + PontCV + '}' + super.toString();
    }
    
    

}