package poo.relaciones;

import poo.relaciones.enums.Color;
import poo.relaciones.enums.Fabricante;
import poo.relaciones.enums.TipoAutomovil;
import poo.relaciones.enums.TipoMotor;

public class AppAutomovil {

    public static void main(String[] args) {

        Automovil auto = new Automovil(Fabricante.AUDI, "A4", Color.NEGRO, new Motor(3.0D, TipoMotor.GASOLINA), TipoAutomovil.COUPE, new Estanque(50), new Persona("Juan José", "G.R"), new Rueda("Michelin", 24, 50d));

        Automovil auto2 = new Automovil();

        auto.encontrarTipo(auto.getTipo());

        auto.detallesTipo();

        System.out.println(auto.equals(auto2));

        System.out.println(auto.toString());
        //System.out.println(auto2.toString());

    }
}
