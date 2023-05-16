/*
Crear una clase Pass, donde declaremos los siguientes atributos: 
● pass : Del tipo String 
● nombre: Del tipo String 
● dni: Del tipo int. 
Métodos para desarrollar: 
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por 
teclado) 
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos 
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña. 
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada. 
● Crear un método para analizar la contraseña(analizarPass). Donde: 
o SI Existe al menos una letra z : Es nivel MEDIO 
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO 
o Si ninguna condición se cumple es nivel BAJO 
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero 
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el 
acceso a modificar los datos. 
● A través de un menú de opciones: 
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una 
contraseña valida). 
o B) Mensaje al usuario que tipo de NIVEL es su contraseña 
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para 
dar permiso 
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso, 
SINO impedir cambios 
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso, 
SINO impedir cambios 

 */
package Entidad.Servicio;

import Entidad.Pass;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class PassServicio {
    
    Scanner leer = new Scanner(System.in);
    
    Pass p1 = new Pass();
    char [] letra; 
    
    public void datosUsuario(){
        
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("DNI: " + p1.getDni());
        
    }
 
    public void crearPass() {
      /* Crear un método para ingresar una contraseña (crearPass). En este método, debemos 
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña. 
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
*/
        do {
            System.out.println("Ingrese una contraseña de 10 digitos"); 
            p1.setPass(leer.next());
            if (p1.getPass().length()==10) {
                
                System.out.println("Su contraseña es valida");
                
            }else{
                System.out.println("Contraseña invalida, ingrese nuevamente");
            }
  
        } while (p1.getPass().length()!=10);
 
    }

    public void analizarPass(){
            /* Crear un método para analizar la contraseña(analizarPass). Donde: 
o SI Existe al menos una letra z : Es nivel MEDIO 
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO 
o Si ninguna condición se cumple es nivel BAJO
*/
         letra =new char[10];
            int cont=0;
            int cont2=0;
         
            for (int i = 0; i <10; i++) {
           letra[i]=p1.getPass().charAt(i);
                System.out.print(letra[i]);
               
                    if (p1.getPass().equals("z")) {
             cont ++;
            }else if (p1.getPass().equals("a")) {
                 cont2 ++;   
        }
            
           
        }
        if (cont>=1 && cont2 ==0) {
            System.out.println("Su contraseña es nivel medio");
     }else if (cont>=1 && cont2 >=2) {
            System.out.println("su contraseña es nivel alto");
        }else{
            System.out.println("Su contraseña es de nivel bajo");
     }
    }
     
        public void modificarDatos(){
            
            
            
        }
        
                    }
    
                    
                
                
                
                
            
        
   

