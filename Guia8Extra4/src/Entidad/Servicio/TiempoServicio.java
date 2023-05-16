/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos 
constructores: un constructor vacío y otro con la hora, minutos y segundos ingresado 
por el usuario. Deberá definir además, los métodos getters y setters correspondientes,
y el método imprimirHoraCompleta(). Recordar crear una validación sobre las horas,
minutos y segundos ingresados por el usuario. Te animas a simular el paso del 
tiempo en consola??????
 */
package Entidad.Servicio;

import Entidad.Tiempo;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class TiempoServicio {
  private Tiempo t1 = new Tiempo();
    private Scanner leer = new Scanner(System.in);
    
    public void valores(){
        System.out.println("Ingrese las horas:");
        t1.setHoras(leer.nextInt());
        System.out.println("Ingrese los minutos:");
        t1.setMin(leer.nextInt());
        System.out.println("Ingrese los segundos:");
        t1.setSeg(leer.nextInt());
    }
    
    public void imprimirHoraCompleta() {
        do {
            if (t1.getSeg() < 60) {
                do {
                    t1.setSeg(t1.getSeg() + 1);
                    System.out.println(t1.getHoras() + ":" + t1.getMin() + ":" + t1.getSeg());
                } while (t1.getSeg() < 60); 
            }
            if (t1.getSeg() >= 60) {
                t1.setMin(t1.getMin() + 1);
                t1.setSeg(t1.getSeg() - 60);
            }
            if (t1.getMin() >= 60) {
                t1.setHoras(t1.getHoras() + 1);
                t1.setMin(t1.getMin() - 60);
            }
            System.out.println(t1.getHoras() + ":" + t1.getMin() + ":" + t1.getSeg());
        } while (t1.getHoras() < 24); 
    }
}