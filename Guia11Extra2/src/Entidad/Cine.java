/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
 */
package Entidad;

/**
 *
 * @author Paola
 */
public class Cine {
    
     private Pelicula pelicula;
    private int precio;
    private String [][] salaCine = new String[8][6];

    public Cine() {
    }

    public Cine(Pelicula pelicula, int precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String[][] getSalaCine() {
        return salaCine;
    }

    public void setSalaCine(String[][] sala) {
        this.salaCine = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precio=" + precio + ", sala=" + salaCine + '}';
    }
    
}
    
    
