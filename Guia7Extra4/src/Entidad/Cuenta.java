/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
crea un método "retirar_dinero" que permita retirar una cantidad de dinero del
saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de 
realizar una transacción de retiro.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Cuenta {
    
    private int saldo = 10000;
    private String titular = "Paco";

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;

    }
    
    public void retirarDinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto q desea retirar");
        int monto=leer.nextInt();
        
        if (saldo>=monto && monto>0) {
            saldo = saldo - monto;
            System.out.println("le quedan : " + saldo + " pesos en la cuenta");
            
        }else{
            System.out.println("No se puede retirar esa cantidad de dinero");
        }
        
    }
}
        
  