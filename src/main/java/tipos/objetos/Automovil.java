package tipos.objetos;

public class Automovil {

    private String fabricante, modelo, color;
    private float cilindrada;

    public Automovil() {

    }

    public Automovil(String fabricante, String modelo, String color, float cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String detalle() {

        StringBuilder sb = new StringBuilder();

        return "\n" + getFabricante() + "\n" +  getModelo() + "\n" + getColor() + "\n" + getCilindrada();
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

    @Override
    public boolean equals(Object obj) {

        Automovil a = (Automovil) obj;

        return (a.fabricante.equals(this.fabricante) && a.modelo.equals(this.modelo));
    }
}
