package SansaStone;

public class Duelo {
    private static int turnos=1;


    public String QueTurno(){
        return ("                                 Turno " +turnos++);
    }

    public void FinPartida(Sansano c1, Sansano c2){

        if(c1.getPrioridad() == c2.getPrioridad()){
            System.out.println("empate");
        }
        if(c1.getPrioridad() > c2.getPrioridad()){
            System.out.println("Gano "+c1.getNombre());
        }
        if(c1.getPrioridad() < c2.getPrioridad()){
            System.out.println("Gano "+c2.getNombre());
        }
        turnos = 31;
    }


    public static int getTurnos() {
        return turnos;
    }

    public static void setTurnos(int turnos) {
        Duelo.turnos = turnos;
    }
}
