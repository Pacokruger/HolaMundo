/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Electrodomestico {
    
protected double precio;
protected String color;
protected char consumoEnergetico;
protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

public void comprobarConsumoEnergetico(char letra) {
        
        if(Character.compare(letra,'f')>0){
            
            consumoEnergetico='f';
            
        }else{
            consumoEnergetico=letra;
        }
    
}
    public void comprobarColor(String color){
        if(!color.equalsIgnoreCase("blanco")&&!color.equalsIgnoreCase("negro")&&!color.equalsIgnoreCase("rojo")&&!color.equalsIgnoreCase("azul")&&!color.equalsIgnoreCase("gris")){
            
            this.color ="blanco";
        }else{
            this.color=color.toLowerCase();
        }
    }
    public void crearElectrodomestico(){
        //Electrodomestico e1 = new Electrodomestico();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
//        System.out.println("INGRESE EL PRECIO DEL ELECTRODOMESTICO");
        precio=1000;
        System.out.println("INGRESE EL COLOR");
        String color=leer.next();
        //e1.setColor(leer.next());
        System.out.println("INGRESE EL CONSUMO");
        consumoEnergetico=leer.next().toUpperCase().charAt(0);
        //e1.setConsumoEnergetico(leer.next().charAt(0));
        System.out.println("INGRESE EL PESO");
        peso=leer.nextInt();
        //e1.setPeso(leer.nextDouble());
        
//        new Electrodomestico(precio,color,consumo,peso);
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        //return new Electrodomestico(precio,color,consumo,peso);
    }
    
//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
    
    public void precioFinal(){
    
        switch (getConsumoEnergetico()) {
            case 'A':
                this.precio+=1000;
                break;
            case 'B':
                this.precio+=800;
                break;
            case 'C':
               this.precio+=600;
                break;
            case 'D':
                this.precio+=500;
                break;
            case 'E':
                this.precio+=300;
                break;
             case 'F':
                this.precio+=100;
                break;
//            default:
//                throw new AssertionError("la opción no es valida");
        }
        
        if(this.peso>=1&&this.peso<=19){
            this.precio+=100;
        }else if(this.peso<=49){
            this.precio+=500;
        }else if(this.peso<=79){
            this.precio+=800;
        }else {
             this.precio+=1000;
        }
    }
    
//    public void precioFinal(Electrodomestico e1){
        
        
        
//        switch (e1.getConsumoEnergetico()) {
//            case 'a':
//                e1.setPrecio(e1.getPrecio() + 1000);
//                break;
//            case 'b':
//                e1.setPrecio(e1.getPrecio() + 800);
//                break;
//            case 'c':
//                e1.setPrecio(e1.getPrecio() + 600);
//                break;
//            case 'd':
//                e1.setPrecio(e1.getPrecio() + 500);
//                break;
//            case 'e':
//                e1.setPrecio(e1.getPrecio() + 300);
//                break;
//            case 'f':
//                e1.setPrecio(e1.getPrecio() + 100);
//                break;
//       }
        
//        if (e1.getPeso()<=19) {
//            e1.setPrecio(e1.getPrecio()+100);
//            
//        }else if (e1.getPeso()<=49) {
//            e1.setPrecio(e1.getPrecio()+500);
//            
//        }else if (e1.getPeso()<=79) {
//            e1.setPrecio(e1.getPrecio()+800);
//        }else{
//            e1.setPrecio(e1.getPrecio()+1000);
//        }
//
//        
//    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
}
