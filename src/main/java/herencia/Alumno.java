package herencia;

import java.util.Arrays;

public class Alumno extends Persona {

    private String[] cursos, horarios, profesores;
    private String aula;

    public Alumno() {
        cursos = new String[3];
    }

    public Alumno(String nombre, String apellidos, String direccion, String dni, short telefono, String aula) {
        super(nombre, apellidos, direccion, dni, telefono);
        this.aula = aula;
    }

    public Alumno(String[] cursos, String[] horarios, String[] profesores, String aula) {
        this.cursos = cursos;
        this.horarios = horarios;
        this.profesores = profesores;
        this.aula = aula;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public String[] getHorarios() {
        return horarios;
    }

    public void setHorarios(String[] horarios) {
        this.horarios = horarios;
    }

    public String[] getProfesores() {
        return profesores;
    }

    public void setProfesores(String[] profesores) {
        this.profesores = profesores;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "cursos=" + Arrays.toString(cursos) +
                ", horarios=" + Arrays.toString(horarios) +
                ", profesores=" + Arrays.toString(profesores) +
                ", aula='" + aula + '\'' +
                '}';
    }

    public String hablar(String informacion) {
        return "\n==> Alumno hablando sobre " + informacion;
    }

    public void agregarCursos(String[] cursos) {

        for (int i = 0; i < cursos.length; i++) {
            this.cursos[i] = cursos[i];
        }
    }

    public void verCursos() {

        for (int i = 0; i < this.cursos.length; i++) {
            System.out.println(this.cursos[i]);
        }
    }
}
