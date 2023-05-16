/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un
empleado en función de su edad y salario actual. El aumento salarial debe ser
del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void calcularAumento() {
        
        Scanner leer = new Scanner(System.in);
        double aumento;
        System.out.println("Ingrese el nombre del empleado");
        nombre=leer.nextLine();
        System.out.println("Ingrese la edad");
        edad=leer.nextInt();
        System.out.println("ingrese el salario");
        salario=leer.nextInt();
        if (edad>=30) {
            aumento= salario*0.1;
       salario = salario+aumento;
        }else{
            aumento=salario*0.05;
            salario = salario+aumento;
        }
        System.out.println("El salario es de : " +salario);
    }
    
}
