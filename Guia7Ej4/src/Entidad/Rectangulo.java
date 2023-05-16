/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Rectangulo {
    
        private int base;
    private int altura;
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base:");
        base = leer.nextInt();
        System.out.println("Ingrese la altura:");
        altura = leer.nextInt();
     
      
  }  
    public void calcularSuperficie() {
        int superficie = base * altura ;
        System.out.println("La superficie es "+superficie);
     }
    public void calcularPerimetro() {
        int perimetro = (base + altura) * 2 ;
        System.out.println("El perimetro es "+perimetro);
     }
    public void mostrarRectangulo() {
        for (int i = 0; i < base; i++) {
            System.out.println("");
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == (base - 1) || j == 0 || j == (altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

        }

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }
}
