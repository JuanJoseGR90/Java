package herencia;

public class Persona {

    private String nombre, apellido, direccion, dni;
    private short telefono;

    public Persona() {

    }

    public Persona(String nombre, String apellidos, String direccion, String dni, short telefono) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public short getTelefono() {
        return telefono;
    }

    public void setTelefono(short telefono) {
        this.telefono = telefono;
    }

    public String hablar(String informacion) {
        return "\n==> Persona está hablando sobre ".concat(informacion);
    }

    public String toString() {
        return nombre + " " + apellido + " " + direccion + " " + dni + " " + telefono;
    }
}
