/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8e3;

import Entidad.Persona;
import Entidad.Servicio.PersonaServicio;

/**
 *
 * @author Paola
 */
public class Guia8E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio perser1 = new PersonaServicio();

        Persona[] p = new Persona[4];
        double maedad = 0, meedad = 0, bajopeso = 0, pesoideal = 0, sobrepeso = 0;

        for (int i = 0; i < 4; i++) {
            p[i] = perser1.crearPersona();
            if (perser1.esMayorDeEdad(p[i]) == true) {
                System.out.println("Es mayor de Edad ");
                maedad++;

            } else {
                System.out.println("No es Mayor de Edad");
                meedad++;
            }
            switch (perser1.calcularIMC(p[i])) {
                case -1:
                    System.out.println("Esta debajo de su peso ideal");
                    bajopeso++;
                    break;
                case 0:
                    System.out.println("Esta en su peso ideal");
                    pesoideal++;
                    break;
                case 1:
                    System.out.println(" La persona tiene sobrepeso ");
                    sobrepeso++;
            }
        }
        System.out.println("porcentaje mayor de edad: " + (maedad / 4));
        System.out.println("porcentaje menor de edad: " + (meedad / 4));
        System.out.println("porcentaje bajo peso: " + (bajopeso / 4));
        System.out.println("porcentaje peso ideal: " + (pesoideal / 4));
        System.out.println("porcentaje sobrepeso: " + (sobrepeso / 4));
    }

}
