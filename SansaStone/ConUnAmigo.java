package SansaStone;

import java.util.Scanner;


public class ConUnAmigo implements ModoJuego{

    public void iniciar(Sansano c1, Sansano c2) {
        System.out.println("ingrese su alias jugador 1: ");
        Scanner n = new Scanner (System.in);
        c1.setNombre(n.nextLine());

        System.out.println("ingrese su alias jugador 2: ");
        Scanner n2 = new Scanner (System.in);
        c2.setNombre(n2.nextLine());

        asignarCartas(c1,c2);

    }

    public void asignarCartas(Sansano c1, Sansano c2) {
        CreaMazo aux = new CreaMazo();
        CreaMazo aux2 = new CreaMazo();
        aux.CrearMazo(c1);
        aux2.CrearMazo(c2);
    }
}
