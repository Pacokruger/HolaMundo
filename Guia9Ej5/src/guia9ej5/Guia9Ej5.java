/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej5;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Guia9Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio sv = new PersonaServicio();
        String name = "";
        Date fecha = null;
        //System.out.println(sv.crearPersona());               
        Persona pe = sv.crearPersona();
        int edadPer = sv.calcularEdad(pe);
        System.out.println(sv.menorQue(pe));
        sv.mostrarPersona(pe, edadPer);
    }
}
