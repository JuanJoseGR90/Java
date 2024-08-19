package poo.relaciones;

public class Estanque {

    private int capacidad;

    public Estanque() {
        this.capacidad = 40;
    }

    public Estanque(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "" + capacidad;
    }
}
