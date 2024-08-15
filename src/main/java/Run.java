import herencia.Alumno;
import herencia.Persona;

public class Run {

    public static void main(String[] args) {

        String[] datos = new String[3];
        datos[0] = "Matemáticas";
        datos[1] = "Inglés";
        datos[2] = "Historia";

        Alumno alumno = new Alumno();
        Persona persona = new Persona();

        alumno.agregarCursos(datos);
        alumno.verCursos();

    }
}
