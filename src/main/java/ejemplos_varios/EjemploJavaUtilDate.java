package ejemplos_varios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("\n" + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String fechaString = df.format(fecha);

        System.out.println("\n".concat(fechaString));

        SimpleDateFormat df2 = new SimpleDateFormat("dd/MMMM/yyyy");

        String fechaStr2 = df2.format(fecha);

        System.out.println("\n".concat(fechaStr2));

    }
}
