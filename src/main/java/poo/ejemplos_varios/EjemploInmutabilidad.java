package poo.ejemplos_varios;

public class EjemploInmutabilidad {

    //  Se pasa por valor de esta manera tanto si es un tipo primitivo, como si es un tipo Wrapper como Integer.
    //  El tipo wrapper lo que hace es devolver una nueva instancia de la clase, no modifica el valor anterior.

    public static void main(String[] args) {

        Integer n = 10;

        System.out.println();

        System.out.println("\nmain n = " + n);

        test(n);

        System.out.println("\nmain n finalizado con = " + n);
    }

    public static void test (Integer n) {

        System.out.println("\ntest = " + n);

        n = 35;

        System.out.println("\ntest n finalizado con = " + n);
    }
}
