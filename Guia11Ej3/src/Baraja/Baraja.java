/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Baraja;

import Carta.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Baraja {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Carta> cartas = new ArrayList<>();
    private ArrayList<Carta> cartasMonton = new ArrayList();

    public void llenarBaraja() {

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                Carta c1 = new Carta();

                switch (i) {
                    case 0:
                        c1.setPalo("oro");
                        break;
                    case 1:
                        c1.setPalo("basto");
                        break;
                    case 2:
                        c1.setPalo("copa");
                        break;
                    case 3:
                        c1.setPalo("espada");
                        break;

                }
                c1.setNumero(j);
                if (j != 8 && j != 9) {
                    cartas.add(c1);

                }
            }

        }

    }

    //mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja() {

        for (Carta aux : cartas) {
            System.out.println(aux);
        }

    }

    //• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        System.out.println("Barajar cartas");
        Collections.shuffle(cartas);
    }
//    siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.

    public void siguienteCarta() {
        int cont = 0;
        String resp;
        do {
            System.out.println("su carta es :" + cartas.get(cont));
            System.out.println("Desea ver la siguiente carta? S/N");
            resp = leer.next();
            cartas.remove(cont);
            cont++;
        } while (resp.equalsIgnoreCase("S") || cont == 40);
        System.out.println("gracias");

    }
//cartasDisponibles(): indica el número de cartas que aún se puede repartir.

    public void cartasDisponibles() {
        siguienteCarta();
        System.out.println("Aun le quedan :" + (cartas.size()) + " cartas para repartir");

    }
//     darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.

    public void darCartas() {

        int num;

        do {
            num = 0;
            System.out.println("Cuantas cartas desea repartir?");
            num = leer.nextInt();
            if (num > cartas.size()) {
                System.out.println("no dispone de esa cantidad de cartas para repartir");

            } else {
                System.out.println("sus cartas son:");
                for (int i = 0; i < num; i++) {
                    for (Carta aux : cartas) {
                        System.out.println(aux);
                        cartasMonton.add(aux);
                        cartas.remove(aux);
                        break;

                    }

                }
            }
        } while (num < cartas.size());
    }
//    cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario

    public void cartasMonton() {
        System.out.println("CARTAS DEL MONTON");
        for (Carta aux : cartasMonton) {
            if (cartasMonton.isEmpty()) {
                System.out.println("No hay cartas disponibles");

            } else {
                System.out.println(aux);
            }
        }
    }

}

    
    



