/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar un 
libro pidiendo los datos al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el número de páginas.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Libro {
    
    
    
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumDePag;

    public Libro() {
        
    }

    public Libro(int ISBN, String Titulo, String Autor, int NumDePag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumDePag = NumDePag;
    }
    
    public void CargarLibro(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de ISBN");
        ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el titulo del libro");
        Titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        Autor = leer.nextLine();
        System.out.println("Ingrese el numero de paginas");
        NumDePag = leer.nextInt();
        leer.nextLine();
    }
    
    public void MostrarInformacion(){
    
        System.out.println("El numero de ISBN es : "+ ISBN);
        System.out.println("El titulo del libro es : "+Titulo);
        System.out.println("El autor del libro es : "+Autor);
        System.out.println("El numero de paginas del libro es : "+NumDePag);
}
}
