package abstractas_con_interfaces;

import static abstractas_con_interfaces.Genero.TERROR;

public class EjemploImprenta {

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Jhon Doe", "DAM", "Resumen laboral...");
        cv.addExperiencia("Java");
        cv.addExperiencia("Scala");
        cv.addExperiencia("Python");
        cv.addExperiencia("PHP");
        cv.addExperiencia("Go");

        Informe informe = new Informe("Martin Fowler", "James", "Estudios...");

        Libro libro = new Libro("H.P. Lovecraft", "En las montañas de locura", TERROR);
        libro.addPagina(new Pagina("Capítulo 1"))
                .addPagina(new Pagina("Capítulo 2"))
                .addPagina(new Pagina("Capítulo 3"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }
}
