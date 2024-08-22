package poo.clasesgenericas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable {

    private List objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList();
    }

    public void addObjeto(Object objeto) {
        if (objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("\nNo hay más espacio.");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
