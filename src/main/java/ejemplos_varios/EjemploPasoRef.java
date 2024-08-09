package ejemplos_varios;

public class EjemploPasoRef {

    public static void main(String[] args) {

        //  Aquí se modifica el valor en el main por se modifica por referencia.

        int[] array = {1, 2, 3};

        System.out.println("\nAntes del test: ");

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

        System.out.println("\nDespués del test: ");

        test(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void test(int[] arrayInt) {

        for (int i = 0; i < arrayInt.length; i++) {

            arrayInt[i] = arrayInt[i] + 10;
        }
    }
}
