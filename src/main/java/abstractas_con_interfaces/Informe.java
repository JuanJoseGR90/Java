package abstractas_con_interfaces;

public class Informe extends Hoja implements Imprimible {

    private String autor, revisor;

    public Informe(String autor, String revisor, String contenido) {
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
