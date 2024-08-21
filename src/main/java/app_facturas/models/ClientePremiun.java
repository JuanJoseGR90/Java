package app_facturas.models;

public class ClientePremiun extends Cliente implements Comparable<ClientePremiun>{

    public ClientePremiun(String nombre) {
        super(nombre);
    }

    public ClientePremiun(String nombre, String apellido) {
        super(apellido);
    }

    @Override
    public int compareTo(ClientePremiun o) {
        return 0;
    }
}
