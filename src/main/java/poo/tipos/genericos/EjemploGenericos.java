package poo.tipos.genericos;

import app_facturas.models.Cliente;
import app_facturas.models.ClientePremiun;

import javax.sound.sampled.Clip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {

    public static void main(String[] args) {

//        Aquí es necesario hacer un casting.

        /*
          List clientes = new ArrayList();

          clientes.add(new Cliente("Juan José", "G.R."));

          Cliente juanjose = (Cliente) clientes.get(0);   //  o iterator().next(); pero devuelve un tipo Object.
        */

//        Ahora la lista guarda y devuelve tipos cliente; ya no es necesario hacer el casting

        List <Cliente> clientes = new ArrayList();

        clientes.add(new Cliente("Juan José", "G.R."));

        Cliente juanjose = clientes.iterator().next();

        Cliente[] clientes1 = {
                new Cliente("Hellrider", "Ozone"),
                new Cliente("Bishop"),
                new Cliente("Ash")
        };

        Integer[] enteros = {1,2,3};

        ClientePremiun[] listaClientePremiun = {
                new ClientePremiun("Cloud", "Strife"),
                new ClientePremiun("Tifa", "Lockhart")};

//        Aquí se ve cómo la función estática puede recibir tanto un arreglo de Clientes como de enteros,
//        ya que es genérica.

        List<Cliente> listaClientes = fromArrayToList(clientes1, enteros);
        List<Cliente> listaClientes2 = fromArrayToList(clientes1);
        List<Integer> listaEnteros = fromArrayToList(enteros);
        List<ClientePremiun> listaClientesPremiun = fromArrayToList(listaClientePremiun);

        listaClientes.forEach(System.out::println);
        listaClientes2.forEach(System.out::println);
        listaEnteros.forEach(System.out::println);
        listaClientesPremiun.forEach(System.out::println);
    }

//      Quiero convertir cualquier tipo de dato, pero la siguiente forma sólo me permite convertir un array de Clientes.
//      El objetivo de los genéricos es ser muy reutilizable, pudiendo usar cualquier tipo de dato

    /*public static List<Cliente> fromArrayToList(Cliente[] clientes) {
        return Arrays.asList(clientes);
    */

//      Ahora sí es genérico. Agrego <T>, sustituyo tipo Cliente por T en el List, y que recibe un array T[] por parámetro.
//      Ahora puede recibir y devolver cualquier tipo de objeto.

    public static <T> List<T> fromArrayToList(T[] t) {
        System.out.println();

        return Arrays.asList(t);
    }

    public static <T, G> List<T> fromArrayToList(T[] t, G[] g) {

        for (G elemento : g) {
            System.out.println(elemento);
        }

        System.out.println();

        return Arrays.asList(t);
    }

//    En este el tipo genérico que devuelve es cualquiera que herede de Number.

    public static <T extends Number> List<T> fromArrayToList(T[] t) {
        System.out.println();

        return Arrays.asList(t);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] t) {
        System.out.println();

        return Arrays.asList(t);
    }
}
