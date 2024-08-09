package abstractas_con_interfaces;

import static abstractas_con_interfaces.Genero.TERROR;

public class EjemploImprenta {

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Jhon", "Doe"), "DAM", "Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Scala")
                .addExperiencia("Python")
                .addExperiencia("PHP")
                .addExperiencia("Go");

        Informe informe = new Informe(
                new Persona("Martin", "Fowler"),
                new Persona("James", "Watt"),
                "Estudios...");

        Libro libro = new Libro(
                new Persona("H.P.", "Lovecraft"),
                "En las montañas de locura",
                TERROR);
        libro.addPagina(
                new Pagina("Capítulo 1"))
                .addPagina(new Pagina("Capítulo 2"))
                .addPagina(new Pagina("Capítulo 3"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }
}
