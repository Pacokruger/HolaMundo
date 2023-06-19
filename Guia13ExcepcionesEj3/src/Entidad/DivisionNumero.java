/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package Entidad;

/**
 *
 * @author Paola
 */
public class DivisionNumero {
    
    public double dividirNumero(String num1, String num2) {

        int numero1;
        int numero2;
        double division;

        numero1 = Integer.parseInt(num1);
        numero2 = Integer.parseInt(num2);

        division = numero1 / numero2;

        return division;
    }

}