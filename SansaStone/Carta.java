package SansaStone;

public abstract class Carta {
    private String NomCarta;
    private String descripcion;

    abstract void Activar(Sansano s, Sansano s2);

    public String getNomCarta() {
        return NomCarta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNomCarta(String nomCarta) {
        NomCarta = nomCarta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
