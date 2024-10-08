package app_facturas.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int hojaFactura;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;

    public static final int MAX_ITEMS = 12;
    public static int ultimaHojaFactura;

    public Factura() {
    }

    public Factura(Cliente cliente, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.items = new ItemFactura[MAX_ITEMS];
        this.hojaFactura = ++ultimaHojaFactura;
        this.fecha = new Date();
    }

    public int getHojaFactura() {
        return hojaFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemsFactura(ItemFactura items) {

        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = items;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;

        for (ItemFactura item : items) {
            if (item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {

        StringBuilder sb = new StringBuilder("Factura nº: " + hojaFactura + "\n");

        System.out.println();
        sb.append("\nCliente: ")
                .append(cliente.getNombre())
                .append("\tNIF: ")
                .append(cliente.getNif())
                .append("\tDescripción: ")
                .append(descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        sb.append("\nFecha de emisión: ")
                .append(df.format(fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCantidad\tTotal\n");

        for(ItemFactura item : items) {
            if (item == null) {
                continue;
            }

            sb.append(item.toString()).append("\n");
        }

        sb.append("\nTotal factura: ").append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
