/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejguiaanimal;

import Animal.Animal;
import Animal.Gato;
import Animal.Perro;
import java.util.ArrayList;

/**
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
public class Guia12EjGuiaAnimal {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        ArrayList<Animal> animales=new ArrayList<>();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        animales.add(a);
        animales.add(b);
        animales.add(c);
        for (Animal animale : animales) {
            animale.hacerRuido();
        }
    }
}