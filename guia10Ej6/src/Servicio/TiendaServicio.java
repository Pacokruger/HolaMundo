/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class TiendaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String,Double> producto= new HashMap();
    
    public HashMap<String,Double> introducir(){
        Tienda t = new Tienda();
        System.out.println("Ingrese un producto");
       t.setProd(leer.next());
        System.out.println("Ingrese el precio");
        t.setPrecio(leer.nextDouble());
        producto.put(t.getProd(),t.getPrecio());
        
        return producto;
    
    }
    
    public void modificarPrecio(){
        
        System.out.println("elija el producto que quiere modificar");
        String articulo = leer.next();
        if (producto.containsKey(articulo)) {
            System.out.println("Ingrese el nuevo valor");
          producto.replace(articulo, leer.nextDouble());
        }
   
    }
    
    public void eliminarProd(){
        System.out.println("Ingrese el producto q quiere eliminar");
        producto.remove(leer.next());
  
    }
    
    public void mostrarProd(){
        for (Map.Entry<String, Double> entry : producto.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: "+ key + ", precio: "+value);
    }
        
    }
    
    public void menu(){
        int var;
        do {
      System.out.println("Ingrese la opcion q desea realizar:\n"
                + "Opcion1: Ingresar un producto \n"
                + "Opcion 2: Modificar el precio\n"
                + "Opcion 3: Eliminar producto\n"
                + "Opcion 4: Mostrar lista\n"
                + "Opcion 5: Salir");
        var = leer.nextInt();
        switch (var) {
            case 1:
                introducir();
                break;
            case 2:
                modificarPrecio();
                break;
            case 3:
                eliminarProd();
                break;
            case 4:
                mostrarProd();
                break;
            case 5:
                System.out.println("Chau chau");
           break;
            default:
                System.out.println("Opcion invalida");
                menu();
        }
        }
        while(var>0 && var<5);
        
    }
 
}
