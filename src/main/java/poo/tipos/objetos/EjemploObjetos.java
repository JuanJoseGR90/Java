package poo.tipos.objetos;

public class EjemploObjetos {

    public static void main(String[] args) {

        Automovil auto = new Automovil(TipoAutomovil.SEDAN, "Mazda", "MX-5", "Azul", 2.0f);
        Automovil auto2 = new Automovil(TipoAutomovil.SEDAN, "Mazda", "MX-7", "Azul", 2.0f);

        auto.encontrarTipo(auto.getTipo());

        auto.detallesTipo();

        System.out.println(auto.equals(auto2));

    }
}
