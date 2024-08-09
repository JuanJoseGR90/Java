public class PracticaArrays {

    public static void main(String[] args) {

//        EJEMPLOS DE INICIALIZACIÓN

        int[][] numeros = new int[3][3];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;
        numeros[2][0] = 7;
        numeros[2][1] = 8;
        numeros[2][2] = 9;

//        3 x 3

        int[][] numeros2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Persona[][] personas = {{
                new Persona(1, "Juan Jose", 34),
                new Persona(2, "hellrider", 30),
                new Persona(3, "JJ", 24),
                new Persona(4, "JJGR", 14)},};

        Persona[] personas2 = new Persona[3];

//        ACCEDER A LOS ELEMENTOS

        System.out.println();

        System.out.println("Número de filas: " + numeros.length);
        System.out.println("Número de columnas: " + numeros[0].length);

        System.out.println();

        System.out.println("Posición 0,0: " + numeros[0][0]);
        System.out.println("Posición 0,1: " + numeros[0][1]);

        personas2[0] = new Persona(1, "Juan Jose", 34);
        personas2[1] = new Persona(2, "hellrider", 30);
        personas2[2] = new Persona(3, "JJ", 24);

//        FOR-EACH CON VALIDACIÓN

        for (Persona persona : personas2) {
            if (persona.getId() == 3) {
                System.out.println(persona.getNombre());
                System.out.println(persona.getEdad());
            }
        }

        for (int[] fila : numeros2) {

            for (int columna : fila) {
                System.out.println(columna);
            }
        }

//        FOR

        for(int i = 0; i < numeros2.length; i++) {
            for(int j = 0; j < numeros2[i].length; j++) {
                System.out.print(numeros2[i][j] + " ");
            }
        }
    }
}

class Persona {

    private int id;
    private String nombre;
    private int edad;

    public Persona () {

    }

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


class guardados {

    public static void main(String[] args) {

        int[] d = {1, 2, 3, 4, 5}, e = {1, 2, 3, 4, 5};

        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }

        System.out.println();

        for (int i = 1; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}