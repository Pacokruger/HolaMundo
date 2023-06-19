/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import EntidadAlojamiento.Camping;
import EntidadAlojamiento.Residencia;
import EntidadHotel.Hotel4;
import EntidadHotel.Hotel5;
import EntidadPadre.Alojamiento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class ServicioAlojamiento {
    
    public ArrayList<Alojamiento> listaAlojamientos() {

        ArrayList<Alojamiento> listaAlojamientos = new ArrayList();

        Hotel4 h1 = new Hotel4('A', "Restoh1", 20, 10, 4, 5, "Hotel1", "Dirhotel1", "Tandil", "Pepe");
        Hotel4 h2 = new Hotel4('B', "Restoh2", 25, 10, 5, 5, "Hotel2", "Dirhotel2", "Tandil", "Pipi");
        Hotel4 h3 = new Hotel4('A', "Restoh3", 30, 10, 6, 5, "Hotel3", "Dirhotel3", "Tandil", "Papa");

        Hotel5 h4 = new Hotel5(1, 4, 5, 'A', "Restoh4", 40, 10, 5, 5, "Hotel4", "Dirhotel4", "Tandil", "Fefe");
        Hotel5 h5 = new Hotel5(2, 5, 6, 'A', "Restoh5", 40, 10, 5, 6, "Hotel5", "Dirhotel5", "Tandil", "Fifi");
        Hotel5 h6 = new Hotel5(3, 6, 7, 'A', "Restoh6", 40, 10, 5, 7, "Hotel6", "Dirhotel6", "Tandil", "Fafa");

        Camping c1 = new Camping(20, 4, false, false, 1000, "Camping1", "Dircamping1", "Tandil", "Tete");
        Camping c2 = new Camping(30, 5, true, false, 1500, "Camping2", "Dircamping2", "Tandil", "Titi");
        Camping c3 = new Camping(40, 6, true, true, 2000, "Camping3", "Dircamping3", "Tandil", "Tata");

        Residencia r1 = new Residencia(10, false, false, true, 2000, "Residencia1", "Diresidencia1", "Tandil", "Meme");
        Residencia r2 = new Residencia(20, false, true, true, 3000, "Residencia2", "Diresidencia2", "Tandil", "Mimi");
        Residencia r3 = new Residencia(30, true, true, true, 4000, "Residencia3", "Diresidencia3", "Tandil", "Mama");

        listaAlojamientos.add(h1);
        listaAlojamientos.add(h2);
        listaAlojamientos.add(h3);
        listaAlojamientos.add(h4);
        listaAlojamientos.add(h5);
        listaAlojamientos.add(h6);
        listaAlojamientos.add(c1);
        listaAlojamientos.add(c2);
        listaAlojamientos.add(c3);
        listaAlojamientos.add(r1);
        listaAlojamientos.add(r2);
        listaAlojamientos.add(r3);

        return listaAlojamientos;

    }
//    Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//• todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
//• todos las residencias que tienen descuento.

    public void menu(ArrayList<Alojamiento> listaAlojamientos) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int opc;
        do {
            System.out.println("********MENU DE ALOJAMIENTOS********");
            System.out.println("Ingrese una opcion");
            System.out.println("1- LISTA DE ALOJAMIENTOS");
            System.out.println("2- ALOJAMIENTOS DE MAYOR VALOR A MENOR VALOR");
            System.out.println("3- CAMPINGS Q POSEEN RESTAURENTE");
            System.out.println("4- RESIDENCIAS CON DESCUENTOS");
            System.out.println("5- SALIR");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    for (Alojamiento aux : listaAlojamientos) {
                        System.out.println(aux.toString());
                    }
                    break;
                case 2:
                    Collections.sort(listaAlojamientos, new Comparator<Alojamiento>() {
                        @Override
                        public int compare(Alojamiento a1, Alojamiento a2) {
                            return Double.compare(a2.precioHabitacion(), a1.precioHabitacion());
                        }
                    });
                    for (Alojamiento listaA : listaAlojamientos) {
                        System.out.println(listaA);
                    }
                    break;
                case 3:
                    for (Alojamiento aux1 : listaAlojamientos) {
                        if (aux1 instanceof Camping) {
                            if (((Camping) aux1).isRestaurante()) {
                                System.out.println(aux1.toString());
                            }

                        }
                    }
                    break;
                case 4:
                    for (Alojamiento aux2 : listaAlojamientos) {
                        if (aux2 instanceof Residencia) {
                            if (((Residencia) aux2).isDescGremio()) {
                                System.out.println(aux2.toString());
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("GRACIAS POR SU VISITA");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    ;
            }

        } while (opc != 5);

    }
}
