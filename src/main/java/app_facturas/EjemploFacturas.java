package app_facturas;

import app_facturas.models.Cliente;
import app_facturas.models.Factura;
import app_facturas.models.ItemFactura;
import app_facturas.models.Producto;

import java.util.Scanner;

public class EjemploFacturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setNif("78945647-F");

        System.out.print("Introduzca descripción de la factura: ");
        String desc = sc.nextLine();
        Factura factura = new Factura(cliente, desc);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i<5; i++) {
            producto = new Producto();

            System.out.print("Ingrese Nº producto " + producto.getCodigo() + ": ");
            nombre = sc.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese Precio: ");
            precio = sc.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese Cantidad: ");
            cantidad = sc.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemsFactura(item);

            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
}
