package poo.abstractas_con_interfaces;

public class Informe extends Hoja implements Imprimible {

    private Persona autor, revisor;

    public Informe(Persona autor, Persona revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    public String imprimir() {
        return "\n=== INFORME ==="
                + "\nInforme escrito por " + autor
                + "\nRevisado por: " + revisor
                + "\nContenido: " + this.contenido;
    }
}
