package poo.relaciones;

import poo.relaciones.enums.TipoMotor;

public class Motor {

    private double cilindrada;
    private TipoMotor tipoMotor;

    public Motor() {
    }

    public Motor(double cilindrada, TipoMotor tipoMotor) {
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "" + cilindrada + ", " + tipoMotor;
    }
}
