/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual.
Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará
al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará
el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que 
el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Entidad.Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class CuentaBancariaServicios {
   Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese Nro Cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese Nro DNI");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese Saldo");
        double saldoActual = leer.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);

    }

//    public CuentaBancaria ingresarSaldo(double saldoActual){
//        System.out.println("Cuanto dinero desea ingresar?");
//        double ingreso=leer.nextDouble();
//        saldoActual=saldoActual+ingreso;
//        return 
//    }
    
    public double ingresarSaldo(CuentaBancaria a) {
        System.out.println("Cuanto dinero desea ingresar?");
        double ingreso = leer.nextDouble();
        a.saldoActual = a.saldoActual + ingreso;
        System.out.println(a.saldoActual);
        return a.saldoActual;
    }

    //Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta 
    //  no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    
    public double retirarSaldo(CuentaBancaria a){
        System.out.println("Cuanto desea retirar?");
        double retiro=leer.nextDouble();
        if (retiro > a.saldoActual) {
            System.out.println("Selecciono un monto mayor al que posee");
            System.out.println("Se le entregaran " + a.saldoActual);
            a.saldoActual = 0;
        } else {
            a.saldoActual = a.saldoActual - retiro;
        }
        return a.saldoActual;
    }
       public double retiroRapido(CuentaBancaria a){
        double porcentaje=(a.saldoActual*20/100);
       double retiro;
        do{ System.out.println("Cuanto desea retirar? RECUERDE NO PUEDE SACAR MAS DEL 20%");
        retiro=leer.nextDouble();
         }while (retiro>porcentaje);
        a.saldoActual = a.saldoActual - retiro;
        
        return a.saldoActual;
    }
    
       public double consultarSaldo(CuentaBancaria a){
           
           System.out.println("Su saldo es : " + a.saldoActual);
           
           return a.saldoActual;
           
       }
       
       public void consultarDatos(CuentaBancaria a){
           
           System.out.println("Su numero de cuenta es :" + a.numeroCuenta);
           System.out.println("Su DNI es : " + a.dniCliente);
           System.out.println("Su saldo es : " + a.saldoActual);
       }
}