/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej2.pkg1;

import EntidadServicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Guia8Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        CafeteraServicio cafe1 = new CafeteraServicio();

        System.out.println("Llene la cafetera por favor");
        cafe1.llenarCafetera();

        do {
            System.out.println("Que desea realizar, elija opcion\n"
                    + "1- Servir Taza\n"
                    + "2- Vaciar Cafetera\n"
                    + "3- Agregar Cafe\n"
                    + "4- Llena Cafetera\n"
                    + "5- Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cafe1.servirTaza();
                    break;
                case 2:
                    cafe1.vaciarCafetera();
                    break;
                case 3:
                    cafe1.agregarCafe();
                    break;
                case 4:
                    cafe1.llenarCafetera();
                    break;
                case 5:
                    continue;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("");

        } while (opcion != 5);
    }

}
