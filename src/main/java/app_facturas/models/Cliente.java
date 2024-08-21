package app_facturas.models;

public class Cliente {

    private String nombre, apellido;
    private String nif;

    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, String apellido) {
        this(nombre);
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return nombre + ' ' + apellido + ' ' + nif;
    }
}
