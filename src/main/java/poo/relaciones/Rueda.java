package poo.relaciones;

public class Rueda {

    private String fabricante;
    private int llanta;
    private double diametro;

    public Rueda(String fabricante, int llanta, double diametro) {
        this.fabricante = fabricante;
        this.llanta = llanta;
        this.diametro = diametro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getLlanta() {
        return llanta;
    }

    public double getDiametro() {
        return diametro;
    }

    @Override
    public String toString() {
        return "{" +
                "fabricante='" + fabricante + '\'' +
                ", llanta=" + llanta +
                ", diametro=" + diametro +
                '}';
    }
}
