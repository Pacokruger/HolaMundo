/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej1;

import Entidad.Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Guia9Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        CadenaServicio cs= new CadenaServicio();
        Scanner leer = new Scanner(System.in);
        
        cs.mostrarVocales();
        cs.invertirFrase();
        System.out.println("Ingrese una letra para buscar en la frase");
        String letra=leer.nextLine();
        cs.vecesRepetido(letra);
        System.out.println("Ingrese una frase para comparar");
        String fraseMain=leer.nextLine();
        cs.compararLongitud(fraseMain);
        cs.unirFRases(fraseMain);
        System.out.println("Ingrese un caracter para reemplazar la letra a");
        String caracter=leer.nextLine();
        cs.reemplazar(caracter);
        
    }
    
}
