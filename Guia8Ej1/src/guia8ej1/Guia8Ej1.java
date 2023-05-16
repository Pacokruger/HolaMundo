/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

import Entidad.CuentaBancaria;
import Entidad.Servicios.CuentaBancariaServicios;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Guia8Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String resp;
        CuentaBancariaServicios sm = new CuentaBancariaServicios();

        CuentaBancaria c1 = sm.crearCuenta();
        do {

            System.out.println("Ingrese la tarea q desea realizar");
            System.out.println("Para ingresar saldo ingrese 1");
            System.out.println("Para retirar saldo ingrese 2");
            System.out.println("Para consultar saldo ingrese 3");
            System.out.println("Para consultar los datos ingrese 4");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sm.ingresarSaldo(c1);
                    System.out.println("desea elegir otra opcion? s/n");
                    resp = leer.next();
                    break;
                case 2:
                    sm.retirarSaldo(c1);
                    System.out.println("desea elegir otra opcion? s/n");
                    resp = leer.next();
                    break;
                case 3:
                    sm.consultarSaldo(c1);
                    System.out.println("desea elegir otra opcion? s/n");
                    resp = leer.next();
                    break;
                case 4:
                    sm.consultarDatos(c1);
                    System.out.println("desea elegir otra opcion? s/n");
                    resp = leer.next();
                    break;

                default:
                    System.out.println("La opcion es incorrecta");
                    System.out.println("desea elegir otra opcion? s/n");
                    resp = leer.next();

            }
        }
            while (resp.equalsIgnoreCase("s"));
        
        
    }
}
//        sm.ingresarSaldo(c1);
//        sm.retirarSaldo(c1);
//        sm.consultarSaldo(c1);
//        sm.consultarDatos(c1);
//
//        System.out.println(c1.getNumeroCuenta());
//        System.out.println(c1.getDniCliente());
//        System.out.println(c1.getSaldoActual());
        
      
        
    


