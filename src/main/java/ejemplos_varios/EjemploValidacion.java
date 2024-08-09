package ejemplos_varios;

public class EjemploValidacion {

    public static void main(String[] args) {
//        VARIABLES
        String nombre = "";
        boolean validacion;

//        PRUEBAS
        validacion = nombre.isEmpty();

        System.out.println("\nEstá vacío? ".concat(String.valueOf(validacion)));

        validacion = nombre == null;

        System.out.println("\nEs nulo? ".concat(String.valueOf(validacion)));

        nombre = null;

        validacion = nombre == null;

        System.out.println("\nY ahora es nulo? ".concat(String.valueOf(validacion)));

        nombre = "";

        if (nombre.isEmpty()) {

            nombre = "Juan José";
        }

        System.out.println("\n".concat(nombre));

        nombre = null;

        if (nombre == null) {

            System.out.println("\nEs nulo");
        }

        nombre = "hellrider";

        int caracteres = nombre.length();

        System.out.println("\nNúmero de caracteres del nombre: ".concat(String.valueOf(caracteres)));

        if (nombre.length() > 8) {

            nombre = "hellride";
        }

        System.out.println(nombre);
    }
}
