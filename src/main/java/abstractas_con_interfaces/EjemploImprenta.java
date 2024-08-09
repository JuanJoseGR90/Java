package abstractas_con_interfaces;

public class EjemploImprenta {

    public static void imprimir (Hoja imprimible) {
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

        imprimir(cv);
        imprimir(informe);
    }



}
