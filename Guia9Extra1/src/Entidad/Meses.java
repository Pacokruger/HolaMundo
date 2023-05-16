/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a 
intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Meses {
    
    private String[] mesesDelAño=new String [12];
    private String mesSecreto;

    public Meses() {
    }

    public String[] getMesesDelAño() {
        return mesesDelAño;
    }

    public void setMesesDelAño(String[] mesesDelAño) {
        this.mesesDelAño = mesesDelAño;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

 private String[] meses = {"enero","ferero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
  
    
    
    public void adivinarMes(){
String mes;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Adivine un mes secreto");
            mes = leer.next();
            mes= mes.toLowerCase();
            if (mes.equalsIgnoreCase(mesSecreto)) {
                System.out.println("Adivinaste!!!");
                //false;
            }else{
                System.out.println("Intenta de nuevo :(");
            }
        } while (!mes.equalsIgnoreCase(mesSecreto));

    }

    
}
