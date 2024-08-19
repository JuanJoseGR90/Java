package poo.relaciones;

import poo.relaciones.enums.Color;
import poo.relaciones.enums.Fabricante;
import poo.relaciones.enums.TipoAutomovil;

import java.util.Arrays;

public class Automovil {

    private int id;
    private String modelo;
    private TipoAutomovil tipo;
    private TipoAutomovil[] tipos;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private Rueda rueda;
    private Fabricante fabricante;
    private Color color;

    private static int ultimoId;

    public Automovil() {

    }

    public Automovil(Fabricante fabricante, String modelo, Color color, Motor motor) {
        this.id = ++ultimoId;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    public Automovil(Fabricante fabricante, String modelo, Color color, Motor motor, TipoAutomovil tipo, Estanque estanque, Persona conductor, Rueda rueda) {
        this(fabricante, modelo, color, motor);
        this.tipo = tipo;
        this.estanque = estanque;
        this.conductor = conductor;
        this.rueda = rueda;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public TipoAutomovil[] getTipos() {
        return tipos;
    }

    public void setTipos(TipoAutomovil[] tipos) {
        this.tipos = tipos;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String detalle() {

        StringBuilder sb = new StringBuilder();

        return "\n" + getFabricante() + "\n" + getModelo() + "\n" + getColor() + "\n" + getMotor();
    }

    public String acelerar(int rpm) {
        return "acelerar";
    }

    public String frenar() {
        return "frenar";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + frenar;
    }

    public void encontrarTipo(TipoAutomovil tipo) {

        switch (tipo) {
            case COUPE -> System.out.println("\nAutomovil pequeño de dos puertas");
            case CONVERTIBLE -> System.out.println("\nDeportivo descapotable");
            case SEDAN -> System.out.println("\nAutomóvil mediano");
        }
    }

    public void detallesTipo() {

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil ta : tipos) {
            System.out.println("\n" + ta + " => " + ta.name()
                    + ", " + ta.getNombre() + ", " + ta.getDescripcion()
                    + ", " + ta.getNumeroPuertas());
            System.out.println();
        }

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Automovil)) {
            return false;
        }

        Automovil a = (Automovil) obj;

        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{ id="  + id  +
                ", color=" + color +
                ", fabricante=" + fabricante +
                ", ruedas=" + Arrays.toString(ruedas) +
                ", conductor=" + conductor +
                ", estanque=" + estanque +
                ", motor=" + motor +
                ", tipo=" + tipo +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
