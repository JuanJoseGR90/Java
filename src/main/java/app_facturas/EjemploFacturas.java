package app_facturas;

import app_facturas.models.*;

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

        System.out.println();

        for (int i = 0; i<2; i++) {
            producto = new Producto();

            System.out.print("Ingrese código producto " + producto.getCodigo() + ": ");
            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese Precio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.print("Ingrese Cantidad: ");
            factura.addItemsFactura(new ItemFactura(sc.nextInt(), producto));

            System.out.println();
            sc.nextLine();
        }
        System.out.println(factura);
    }
}
