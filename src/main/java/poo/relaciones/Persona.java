package poo.relaciones;

public class Persona {

    private String nombre, apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + ' ' + apellido;
    }
}
