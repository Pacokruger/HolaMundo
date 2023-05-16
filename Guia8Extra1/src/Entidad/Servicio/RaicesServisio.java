/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de
una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, llamémosles
a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de
un método constructor. Luego, en RaicesServicio las operaciones que se podrán 
realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double).
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 
2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única
raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con 
los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo
delante de -b
 */
package Entidad.Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class RaicesServisio {
    
  Scanner leer = new Scanner(System.in);

    Raices r1 = new Raices();

    public void llenarValores() {
        System.out.println("Ingrese al valor de A");
        r1.setA(leer.nextInt());
        System.out.println("Ingrese al valor de B");
        r1.setB(leer.nextInt());
        System.out.println("Ingrese al valor de C");
        r1.setC(leer.nextInt());
    }

    public double getDiscriminante() {
//Método getDiscriminante(): devuelve el valor del discriminante (double). 
//El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
        double discriminante = Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
        return discriminante;
    }

    public boolean tieneRaices() {

        if (getDiscriminante() >= 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean tieneRaiz() {

        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices() {


        if (tieneRaices() == true) {
            //(-b±v((b^2)-(4*a*c)))/(2*a)
            //      (b^2)-4*a*c
            double raizNeg = -r1.getB() - Math.sqrt(getDiscriminante()) / (2 * r1.getA());
            System.out.println("La solucion negativa es " + raizNeg);
            ////(-b±v((b^2)-(4*a*c)))/(2*a)
            double raizPos = -r1.getB() + Math.sqrt(getDiscriminante()) / (2 * r1.getA());
            System.out.println("La solucion positica es " + raizPos);
        }

    }
    
  public void obtenerRaiz()   {
    //Método obtenerRaiz(): llama a tieneRaiz() y si devolvió´  true imprime una 
//única raíz. Es en el caso en que se tenga una única solución posible.
         
           if (tieneRaiz()) {
            double raiz = (-(r1.getB()) + (Math.sqrt(getDiscriminante()) ))/ (2 * r1.getA());
            System.out.println("La única solución es: " + raiz); 
        }



  }  
  
  public void calcular(){
 /* Método calcular(): este´  método llamara´  a tieneRaices() y a tieneRai´z(), y 
mostrara´  por pantalla las posibles soluciones que tiene nuestra ecuación 
con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan 
nuestros métodos y en caso de no existir solución, se mostrara´ un mensaje.*/
 tieneRaices();
 tieneRaiz();
 obtenerRaices();
 obtenerRaiz();
 
  if (tieneRaices()== false && tieneRaiz()==false){
      
      System.out.println("No ninguna solucion posible");
  }
 
  }
}