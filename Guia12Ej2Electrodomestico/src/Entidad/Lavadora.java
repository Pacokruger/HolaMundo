/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Lavadora extends Electrodomestico{
    
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

 

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
//    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
    
    public void crearLavadora(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("INGRESE LA CAPACIDAD DE CARGA");
        carga=leer.nextDouble();
    }
//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.
    
       @Override
    public void precioFinal() {
        super.precioFinal();
           if (carga>30) {
               setPrecio(getPrecio()+500);
           }
    }
    
    @Override
    public String toString() {
       return super.toString() + "tipo: Lavadora" + " carga= " + carga ;
    }
}
