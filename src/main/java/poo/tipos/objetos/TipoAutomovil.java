package poo.tipos.objetos;

public enum TipoAutomovil {
    CONVERTIBLE("Convertible", "Deportivo", 2),
    COUPE("Coupe", "Pequeño", 2),
    SEDAN("Sedan", "Mediano", 4),;

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil (String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
