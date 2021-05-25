package SansaStone;

import java.util.Random;
import java.util.Scanner;

public class Curso extends Carta{
    private int ataque;
    private int defensa;

    public Curso(int i){
        if (i == 0){
            setNomCarta("Matematica");
            setDescripcion("Ataca 550/Cura 200 puntos de prioridad.");
            ataque = 550;
            defensa = 200;
        }
        if (i == 1){
            setNomCarta("Fisica");
            setDescripcion("Ataca 450/Cura 150 puntos de prioridad.");
            ataque = 450;
            defensa = 150;
        }
        if (i == 2){
            setNomCarta("LP");
            setDescripcion("Ataca 510/Cura 180 puntos de prioridad.");
            ataque = 510;
            defensa = 180;
        }
        if (i == 3){
            setNomCarta("Programacion");
            setDescripcion("Ataca 110/Cura 300 puntos de prioridad.");
            ataque = 110;
            defensa = 300;
        }
        if (i == 4){
            setNomCarta("ED");
            setDescripcion("Ataca 470/Cura 160 puntos de prioridad.");
            ataque = 470;
            defensa = 160;
        }
        if (i == 5){
            setNomCarta("EDD");
            setDescripcion("Ataca 430/Cura 120 puntos de prioridad.");
            ataque = 430;
            defensa = 120;
        }
    }

    private void Aprobar(Sansano s){
        int aux = s.getPrioridad()+defensa;
        if (aux > 3000){
            s.setPrioridad(3000);
        }
        else
            s.setPrioridad(aux);
    }

    private void Reprobar(Sansano s){
        int aux = s.getPrioridad()-ataque;
        if (aux < 0){
            s.setPrioridad(0);
        }
        else
            s.setPrioridad(aux);
    }

    public void Activar(Sansano pl,Sansano pl2) {
        int opcion;

        System.out.println("\n"+pl.getNombre()+" has robado " + getNomCarta());
        System.out.println(getDescripcion()+"\n");

        if (pl.getNombre() != "Oponente"){
            System.out.println("presione 1 para reprobar, presione 2 para aprobar: ");
            Scanner n = new Scanner(System.in);
            opcion = (n.nextInt());
            if (opcion == 1) {
                Reprobar(pl2);
                System.out.println(pl.getNombre()+" utilizo Reprobar");
            }
            if (opcion == 2) {
                Aprobar(pl);
                System.out.println(pl.getNombre()+" utilizo Aprovar");
            }
        }
        else {
            Random f = new Random();
            int jugada = f.nextInt(2);
            if (jugada == 0) {
                Reprobar(pl2);
                System.out.println(pl.getNombre()+" utilizo Reprobar");
            }
            if (jugada == 1) {
                Aprobar(pl);
                System.out.println(pl.getNombre()+" utilizo Aprovar");
            }
        }
    }

}
