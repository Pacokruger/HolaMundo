/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Entidad;

/**
 *
 * @author Paola
 */
public class Tienda {
    
    private String prod;
    private Double precio;

    public Tienda() {
    }

    public Tienda(String prod, Double precio) {
        this.prod = prod;
        this.precio = precio;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "prod=" + prod + ", precio=" + precio + '}';
    }
    
    
    
}
