package poo.clasesgenericas;

public class EjemploClasesGenericas {

    public static void main(String[] args) {

        Camion transporteCaballos = new Camion(5);
        transporteCaballos.addObjeto(new Animal("a","Caballo"));
        transporteCaballos.addObjeto(new Animal("b","Caballo"));
        transporteCaballos.addObjeto(new Animal("c","Caballo"));
        transporteCaballos.addObjeto(new Animal("d","Caballo"));

        for (Object o : transporteCaballos) {

            Animal a = (Animal) o;

            System.out.println("Nombre " + a.getNombre() + " tipo " + a.getTipo());
        }
    }
}
