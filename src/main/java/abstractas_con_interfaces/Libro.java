package abstractas_con_interfaces;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {
    private List<Imprimible> paginas;
    public String autor, titulo;
    public Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina) {
        paginas.add(pagina);
        return this;
    }

    public String imprimir() {
        System.out.println("\n=== LIBRO ===");
        StringBuilder sb = new StringBuilder("Título: ");
        sb.append(titulo).append('\n')
                .append("Autor: ").append(this.autor).append('\n')
                .append("Genero: ").append(this.genero).append('\n');
        for (Imprimible pagina : paginas) {
            sb.append(pagina.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
