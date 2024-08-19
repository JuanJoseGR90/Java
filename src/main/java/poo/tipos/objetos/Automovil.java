package poo.tipos.objetos;

public class Automovil {

    private String fabricante, modelo, color;
    private float cilindrada;
    private TipoAutomovil tipo;
    private TipoAutomovil[] tipos;

    public Automovil() {

    }

    public Automovil(String fabricante, String modelo, String color, float cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil (TipoAutomovil tipo, String fabricante, String modelo, String color, float cilindrada) {
        this(fabricante, modelo, color, cilindrada);
        this.tipo = tipo;

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

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
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

    public void encontrarTipo (TipoAutomovil tipo) {

        switch (tipo) {
            case COUPE -> System.out.println("\nAutomovil pequeño de dos puertas");
            case CONVERTIBLE -> System.out.println("\nDeportivo descapotable");
            case SEDAN -> System.out.println("\nAutomóvil mediano");
        }
    }

    public void detallesTipo () {

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
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }
}
