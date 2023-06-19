/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package guia13ej5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Guia13Ej5 {

    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
//        Random r1 = new Random();
//        int numeroAdivinar = r1.nextInt(500) + 1;
//        int numero = 0;
//        int contador = 0;
//        System.out.println("el numero a adivinar es " + numeroAdivinar);
//        try {
//            do {
//
//                System.out.println("INGRESE UN NUMERO ENTRE 1 Y 500 Q CREE Q ES EL INCOGNITO");
//                numero = leer.nextInt();
//                contador++;
//                if (numero == numeroAdivinar) {
//                    System.out.println("FELICITACIONES HAS ACERTADO!!!");
//                }
//                if (numero < numeroAdivinar) {
//                    System.out.println("EL NUMERO INGRESADO ES MENOR");
//
//                }
//                if (numero > numeroAdivinar) {
//                    System.out.println("EL NUMERO INGRESADO ES MAYOR");
//                }
//
//            } while (numero != numeroAdivinar);
//        } catch (InputMismatchException e1) {
//            System.out.println("ERROR!!! NO INGRESASTE UN NUMERO VALIDO");
//            contador++;
//        }
//        System.out.println("USTED AH INTENTADO " + contador + " VECES ADIVINAR EL NUMERO");
//
//    }
//}

//Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
//        Random r = new Random();
//        int numeroAdivinar = r.nextInt(500) + 1;
//        int numero=0;
//        int contador = 0;
//        System.out.println("el numero a adivinar es " + numeroAdivinar);
//        
//        do {
//            try{
//                System.out.println("INGRESE UN NUMERO ENTRE 1 Y 500 Q CREE Q ES EL INCOGNITO");
//                numero = leer.nextInt();
//                contador++;
//                if (numero == numeroAdivinar) {
//                    System.out.println("FELICITACIONES HAS ACERTADO!!!");
//                    System.out.println("USTED AH INTENTADO " + contador + " VECES ADIVINAR EL NUMERO");
//                }
//                if (numero < numeroAdivinar) {
//                    System.out.println("EL NUMERO INGRESADO ES MENOR");
//
//                }
//                if (numero > numeroAdivinar) {
//                    System.out.println("EL NUMERO INGRESADO ES MAYOR");
//                }
//            }
//            catch (InputMismatchException e1) {
//                System.out.println("ERROR!!! NO INGRESASTE UN NUMERO");
//                contador++;
//                System.out.println("USTED AH INTENTADO " + contador + " VECES ADIVINAR EL NUMERO");
//                    break;
//            }
//        } while (numero != numeroAdivinar);
//        
//    }
//}

//Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
//        Random r = new Random();
//        int numeroAdivinar = r.nextInt(500) + 1;
//        String numero="";
//        int contador = 0;
//        int numeroInt = 0;
//        System.out.println("el numero a adivinar es " + numeroAdivinar);
//        
//        do {
//            try{
//                System.out.println("INGRESE UN NUMERO ENTRE 1 Y 500 Q CREE Q ES EL INCOGNITO");
//                numero = leer.next();
//                numeroInt = Integer.parseInt(numero);
//                contador++;
//                if (numeroInt == numeroAdivinar) {
//                    System.out.println("FELICITACIONES HAS ACERTADO!!!");
//                }
//                if (numeroInt < numeroAdivinar) {
//                    System.out.println("EL NUMERO INGRESADO ES MENOR");
//
//                }
//                if (numeroInt > numeroAdivinar) {
//                    System.out.println("EL NUMERO INGRESADO ES MAYOR");
//                }
//            }
//            catch (Exception e1) {
//                System.out.println("ERROR!!! NO INGRESASTE UN NUMERO");
//                contador++;
//                
//                
//            }
//        } while (numeroInt != numeroAdivinar);
//        
//        System.out.println("USTED HA INTENTADO " + contador + " VECES ADIVINAR EL NUMERO");
//    }
//}

//Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        Random r = new Random();
//        int adivinar= r.nextInt(500) + 1;
//        int n = 0;
//        int contador = 0;
//        boolean error = false;
//        
//        System.out.println("Su número a adivinar es: " + adivinar);
//        
//        do {
//            
//            do {
//                try{
//                    System.out.println("Ingrese un número entre 1 y 500");
//                    n = sc.nextInt();
//                }
//                catch (InputMismatchException e){
//                    System.out.println("Algo salió mal");
//                    System.out.println("Error: "+e);
//                    error = true;
//                    contador++;
//                }
//                if (error) {
//                    System.out.println("INTENTE NUEVAMENTE");
//                    sc.next();
//                    error=false;
//                }
//            } while (error);
//            
//            contador++;
//            if (n==adivinar) {
//                System.out.println("FELICITACIONES HAS ACERTADO!!!");
//                System.out.println("Sus intentos fueron: " + contador);
//            }
//            if (n<adivinar) {
//                System.out.println("EL NUMERO INGRESADO ES MENOR");
//            }
//            if (n>adivinar) {
//                System.out.println("EL NUMERO INGRESADO ES MAYOR");
//            }
//            
//        } while (n != adivinar);     
//        
//    }
//}

Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random r = new Random();
        int adivinar= r.nextInt(500) + 1;
        int n = 0;
        int contador = 0;
        boolean error = false;
        
        System.out.println("Su número a adivinar es: " + adivinar);


        do {

            do {
                error = false;
                try {
                    System.out.println("Ingrese un número entre 1 y 500");
                    n = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Algo salió mal");
                    System.out.println("Error: " + e);
                    error = true;
                    contador++;
                }
                if (error) {
                    System.out.println("INTENTE NUEVAMENTE");
                    sc.next();
                    // No es necesario establecer 'error' como 'false' aquí
                }
            } while (error);

            contador++;
            if (n == adivinar) {
                System.out.println("FELICITACIONES HAS ACERTADO!!!");
                System.out.println("Sus intentos fueron: " + contador);
            }
            if (n < adivinar) {
                System.out.println("EL NUMERO INGRESADO ES MENOR");
            }
            if (n > adivinar) {
                System.out.println("EL NUMERO INGRESADO ES MAYOR");
            }

        } while (n != adivinar);
        
    }
}