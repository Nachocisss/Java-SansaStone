package SansaStone;

import java.util.ArrayList;

import java.util.List;

public class Sansano {
    private String nombre;
    private int prioridad;
    private List<Carta> mazo = new ArrayList<Carta>();


    public Sansano() {
        prioridad = 3000;
    }

    public int TamanoMazo(){
        return mazo.size();

    }

    public void  mostrar(){
        for (Carta carta : mazo) {
            System.out.println("robe "+carta.getNomCarta());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public List<Carta> getMazo() {
        return mazo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setMazo(List<Carta> mazo) {
        this.mazo = mazo;
    }
}
