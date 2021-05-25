package SansaStone;

import java.util.Random;
import java.util.Scanner;

public class Juego {



    public static void main(String[] args) {
        Sansano player1 = new Sansano();
        Sansano player2 = new Sansano();

        Trigo miAplicacion = new Trigo();
        miAplicacion.setBounds(10,10,200,200);
        miAplicacion.pack();
        miAplicacion.setVisible(true);


        Random rand = new Random();
        int i = rand.nextInt(2);
        int opcion;
        int j = 0;
        Duelo duel = new Duelo();


        System.out.println("maquina = 1 o amigo = 2");
        Scanner n = new Scanner(System.in);
        opcion = (n.nextInt());

        if (opcion == 1) {
            UnJugador l2 = new UnJugador();
            if (i == 0) {
                l2.iniciar(player1, player2);
            } else l2.iniciar(player2, player1);
        }
        if (opcion == 2) {
            ConUnAmigo l = new ConUnAmigo();
            if (i == 0) {
                l.iniciar(player1, player2);
            } else l.iniciar(player2, player1);
        }

        System.out.println("quien parte: " + player1.getNombre());
        while (Duelo.getTurnos() <= 30) {

            if (player1.getPrioridad() != 0 && player2.getPrioridad() != 0) {

                System.out.println(duel.QueTurno());
                System.out.println("tu prioridad " + player1.getNombre() + " es: " + player1.getPrioridad());
                System.out.println("tu prioridad " + player2.getNombre() + " es: " + player2.getPrioridad());
                player1.getMazo().get(j).Activar(player1, player2);
            }
            if (player1.getPrioridad() != 0 && player2.getPrioridad() != 0) {
                System.out.println("tu prioridad " + player1.getNombre() + " es: " + player1.getPrioridad());
                System.out.println("tu prioridad " + player2.getNombre() + " es: " + player2.getPrioridad());
                player2.getMazo().get(j).Activar(player2, player1);
                j++;
            } else {
                System.out.println("tu prioridad " + player1.getNombre() + " es: " + player1.getPrioridad());
                System.out.println("tu prioridad " + player2.getNombre() + " es: " + player2.getPrioridad());
                duel.FinPartida(player1, player2);
            }
        }

    }

}


