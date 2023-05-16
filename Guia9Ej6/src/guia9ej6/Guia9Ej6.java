/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej6;

import Servicio.CursoServicio;

/**
 *
 * @author Paola
 */
public class Guia9Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        cs.crearCurso();
        cs.calcularGananciaSemanal();
    }
    }