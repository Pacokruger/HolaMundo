/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como
atributos una frase (String) y su longitud. Agregar constructor vacío y con atributo
frase solamente. Agregar getters y setters. El constructor con frase como atributo
debe setear la longitud de la frase de manera automática. Crear una clase 
CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene
la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
package Entidad.Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class CadenaServicio {
    
   Cadena c1 = new Cadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void mostrarVocales() {
        //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
        //tiene la frase ingresada.
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());
        
        int contador = 0;
        for (int i = 0; i < c1.getFrase().length() ; i++) {
            String letra = c1.getFrase().substring(i, i +1);
            if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es: "+contador);
    }
    
public void invertirFrase() {
        //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por
        //pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

        for (int i = c1.getFrase().length(); i > 0; i--) {
            String letra = c1.getFrase().substring(i - 1, i);
            System.out.print(letra);
        }
        System.out.println("");
    }

public void vecesRepetido(String letra){
   /* Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
usuario y contabilizar cuántas veces se repite el carácter en la frase, 
por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
   
        String sS;
        int contador = 0;
        for (int i = 0; i < c1.getFrase().length(); i++) {
            sS = c1.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase(sS)) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + contador + " veces");
    }

public void compararLongitud(String fraseMain){
   //Método compararLongitud(String frase), deberá comparar la longitud de la 
    //frase que compone la clase con otra nueva frase ingresada por el usuario.
   
        if (fraseMain.length()==c1.getFrase().length()) {
            
            System.out.println("Las longitudes son iguales");
       }else {
            System.out.println("Las longitudes son distintas");
            
     }
    }

public void unirFRases(String fraseMain){
    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.

    System.out.println("la nueva frase es: " + c1.getFrase() + " " +fraseMain);
}

public void reemplazar(String caracter){
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//mostrar la frase resultante.

String nuevaFrase=c1.getFrase().replace("a",caracter);
   
c1.setFrase(nuevaFrase);
 System.out.println(c1.getFrase());

        }
        
    }
        
   

