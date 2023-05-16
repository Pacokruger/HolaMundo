/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números
reales con los cuales se realizarán diferentes operaciones matemáticas. La clase
debe tener un constructor vacío, getters y setters.  En el constructor vacío se 
usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService,
en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author Paola
 */
public class ParDeNumerosServicio {
    
    ParDeNumeros pn = new ParDeNumeros();
    
    public void generarValores(){
        pn.setNum1((int) (Math.random() * 10 + 1));
        pn.setNum2((int) (Math.random() * 10 + 1));
       // int num1= (int) (Math.random() * 10 + 1);
        //int num2= (int) (Math.random() * 10 + 1);
        
    }
  
    public void mostrarValores(){
        //Método mostrarValores que muestra cuáles son los dos números guardados.
        System.out.println("el primer numero es: "+pn.getNum1());
        System.out.println("el segundo numero es: "+pn.getNum2());
        
    }
    public void devolverMayor(){
    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
        if (pn.getNum1()>pn.getNum2()) {
            System.out.println("el primer numero es mayor :"+pn.getNum1());
            
        } else {
            System.out.println("el segundo numero es mayor :" +pn.getNum2());
        }
  }
  public void calcularPotencia(){  
   // Método calcularPotencia para calcular la potencia del mayor valor de la clase 
//elevado al menor número. Previamente se deben redondear ambos valores.
if (pn.getNum1()>pn.getNum2()) {
    System.out.println("la potencia de "+pn.getNum1()+ " es : "+ Math.pow(pn.getNum1(), pn.getNum2()));
          
      }else{
    System.out.println("la potencia de "+pn.getNum2()+ " es " +Math.pow(pn.getNum2(), pn.getNum1()));
}
}
  public void calcularRaiz(){
//  Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

      if (pn.getNum1()>pn.getNum2() ) {
          System.out.println("La raiz cuadrada de "+ pn.getNum2()+ " es :" + Math.sqrt(pn.getNum2()));
          
      } else {
          System.out.println("La raiz cuadrada de "+ pn.getNum1()+ " es :" + Math.sqrt(pn.getNum1()));
      }

  }
}
    
