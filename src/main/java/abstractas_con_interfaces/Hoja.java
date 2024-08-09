package abstractas_con_interfaces;

abstract public class Hoja {

    protected String contenido;

    public Hoja () {}

    public Hoja (String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir ();

}
