public class EjemploValidacion {

    public static void main(String[] args) {

        String nombre = "";
        boolean validacion;

        validacion = nombre.isEmpty();

        System.out.println("\nEstá vacío? ".concat(String.valueOf(validacion)));

        validacion = nombre == null;

        System.out.println("\nEs nulo? ".concat(String.valueOf(validacion)));

        nombre = null;

        validacion = nombre == null;

        System.out.println("\nY ahora es nulo? ".concat(String.valueOf(validacion)));
    }
}
