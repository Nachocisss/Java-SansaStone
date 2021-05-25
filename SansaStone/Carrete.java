package SansaStone;

public class Carrete extends Carta{
    private int curacion;

    public Carrete(int i){
        if (i == 0){
            setNomCarta("Cerrito");
            setDescripcion("Recupera 55 puntos de prioridad.");
            curacion = 55;
        }
        if (i == 1){
            setNomCarta("InterMechon");
            setDescripcion("Recupera 80 puntos de prioridad.");
            curacion = 80;
        }
        if (i == 2){
            setNomCarta("SansaFonda");
            setDescripcion("Recupera 100 puntos de prioridad.");
            curacion = 100;
        }
        if (i == 3){
            setNomCarta("SemanaSansana");
            setDescripcion("Recupera 150 puntos de prioridad.");
            curacion = 150;
        }
        if (i == 4){
            setNomCarta("BloqueLibre");
            setDescripcion("Recupera 30 puntos de prioridad.");
            curacion = 30;
        }
        if (i == 5){
            setNomCarta("FiestaOmbligo");
            setDescripcion("Recupera 125 puntos de prioridad.");
            curacion = 125;
        }
    }

    private void Carretear(Sansano s){
        int aux;
        aux = s.getPrioridad()+curacion;
        if (aux > 3000){
            s.setPrioridad(3000);
        }
        else
            s.setPrioridad(aux);
    }

    public void Activar(Sansano s, Sansano s2){
        System.out.println("\n"+s.getNombre()+" has robado " + getNomCarta());
        System.out.println(getDescripcion()+"\n");
        Carretear(s);
    }

    public int getCuracion() {
        return curacion;
    }
}
