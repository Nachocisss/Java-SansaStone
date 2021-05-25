package SansaStone;

public class Profesor extends Carta{
    private int dano;

    public Profesor(int i){
        if (i == 0){
            setNomCarta("Bahamondes");
            setDescripcion("Reduce 420 puntos de prioridad.");
            dano = 420;
        }
        if (i == 1){
            setNomCarta("MaxAraya");
            setDescripcion("Reduce 350 puntos de prioridad.");
            dano = 350;
        }
        if (i == 2){
            setNomCarta("Cifuentes");
            setDescripcion("Reduce 390 puntos de prioridad.");
            dano = 390;
        }
        if (i == 3){
            setNomCarta("MaxRivera");
            setDescripcion("Reduce 280 puntos de prioridad.");
            dano = 280;
        }
    }

    private void Recorregir(Sansano s){
        int aux;
        aux = s.getPrioridad()-dano;
        if (aux < 0){
            s.setPrioridad(0);
        }
        else
            s.setPrioridad(aux);
    }

    public void Activar(Sansano s, Sansano s2){
        System.out.println("\n"+s.getNombre()+" has robado " + getNomCarta());
        System.out.println(getDescripcion()+"\n");
        Recorregir(s);
    }

    public int getDano() {
        return dano;
    }

}
