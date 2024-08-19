package poo.ejemplos_varios;

public class PracticaObjetos {

    private String nombreObj;
    private int edad;
    private String dni;

    public PracticaObjetos() {
    }

    public PracticaObjetos(String nombreObj, int edad) {
        this.nombreObj = nombreObj;
        this.edad = edad;
    }

    public PracticaObjetos(String nombre, int edad, String dni) {
        this(nombre, edad);
        this.dni = dni;
    }

    public String getNombreObj() {
        return nombreObj;
    }

    public void setNombreObj(String nombreObj) {
        this.nombreObj = nombreObj;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static void main(String[] args) {

    }
}

class Cadenas {

    public static void main(String[] args) {
        //        USANDO STRING POOL

        /*
         * Uso del String Pool:
         * String str = "hola";
         * Esta forma utiliza el "String Pool", una optimización que Java realiza para ahorrar memoria.
         * Cuando se crea una cadena literal de esta manera, Java verifica si una cadena con el mismo contenido ya existe en el pool. Si existe, la referencia a la cadena existente se asigna a str. Si no existe, se crea una nueva cadena y se coloca en el pool.*/

        String cadena = "hola";

//          CREANDO OBJ NUEVO

        /*
         * Esta forma crea un nuevo objeto String en la memoria heap, incluso si una cadena con el mismo contenido ya existe en el String Pool.
         *
         * Esto significa que str será una referencia a un objeto diferente, incluso si otra cadena con el mismo contenido existe en el pool.
         * */

        String str1 = new String(" ");
        String str2 = new String(" ");

        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
    }
}
