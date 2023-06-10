/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ej4circulo;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author Paola
 */
public class Guia12Ej4Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Circulo circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        
        Rectangulo rectangulo = new Rectangulo(10, 5);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
    
}
