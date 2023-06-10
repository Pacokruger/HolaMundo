/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Televisor extends Electrodomestico {
    
    private int pulgadas;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizador, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
//
//  Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.

   
    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        super.crearElectrodomestico();
        sintonizador = false;
        System.out.println("INGRESE LA CANTIDAD DE PULGADAS");
        pulgadas = leer.nextInt();
        System.out.println("¿POSEE SINTONIZADOR TDT? SI/NO");
        String resp = leer.next();
//            if (resp.equalsIgnoreCase("si")) {
//                sintonizador=true;
//       }
        do {
            System.out.println("si/no");
            resp = leer.next();
        } while (!(resp.equalsIgnoreCase("si") || resp.equalsIgnoreCase("no")));

        this.sintonizador = resp.equalsIgnoreCase("si");
    }

//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (pulgadas>40) {
            setPrecio(getPrecio()*1.3);
            
        }
        if (sintonizador) {
            setPrecio(getPrecio()+500);
            
        }
    }

 @Override
    public String toString() {

        return super.toString() + " Televisor resolucion=" + pulgadas + ", sintonizador=" + sintonizador + '}';
    }
   
}
