package poo.relaciones;

import poo.relaciones.enums.Color;
import poo.relaciones.enums.Fabricante;
import poo.relaciones.enums.TipoAutomovil;
import poo.relaciones.enums.TipoMotor;

public class AppAutomovil {

    public static void main(String[] args) {

        Rueda[] ruedas = new Rueda[4];
        ruedas[0] = new Rueda("Yokohama", 16, 7.5);
        ruedas[1] = new Rueda("Yokohama", 16, 7.5);
        ruedas[2] = new Rueda("Yokohama", 16, 7.5);
        ruedas[3] = new Rueda("Yokohama", 16, 7.5);

        Persona conductor = new Persona("Juan José", "G.R.");
        Automovil mazda = new Automovil();
        mazda.setFabricante(Fabricante.MAZDA);
        mazda.setModelo("MX-5");
        mazda.setMotor(new Motor(2.0d, TipoMotor.GASOLINA));
        mazda.setEstanque(new Estanque(50));
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAutomovil.COUPE);
        mazda.setConductor(conductor);
        mazda.setRuedas(ruedas);

        mazda.encontrarTipo(mazda.getTipo());

        mazda.detallesTipo();

        //System.out.println(mazda.equals(auto2) + "\n");

        System.out.println(mazda.toString());



    }
}
