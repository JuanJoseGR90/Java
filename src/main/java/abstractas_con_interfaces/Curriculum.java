package abstractas_con_interfaces;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String exp) {
        experiencias.add(exp);
        return this;
    }

    public String imprimir() {
        System.out.println("\n=== CURRICULUM ===");
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(this.persona).append("\n")
                .append("Resumen: ").append(this.contenido).append("\n")
                .append("Profesión: ").append(this.carrera).append("\n")
                .append("Experiencias: ");
        for (String exp : experiencias) {
            sb.append(" - ").append(exp);
        }
        return sb.toString();
    }
}
