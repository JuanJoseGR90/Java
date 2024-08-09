package abstractas_con_interfaces;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja {

    private String persona, carrera;
    private List<String> experiencias;

    public Curriculum(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String exp) {
        experiencias.add(exp);
        return this;
    }

    public String imprimir () {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(this.persona).append("\n")
                .append("Resumen: ").append(this.contenido).append("\n")
                .append("Profesión: ").append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for (String exp : experiencias) {
            sb.append(" - ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
