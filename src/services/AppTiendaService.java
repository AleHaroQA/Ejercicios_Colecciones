package services;

import entities.AppTienda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppTiendaService {

    /*Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    Hashmap).*/

    private Map<String, Double> productos;
    private Scanner reader;

    public AppTiendaService() {
        this.productos = new HashMap<>();
        this.reader = new Scanner(System.in);
    }

    public AppTienda crearProducto() {

        System.out.println("Ingrese nombre del producto: ");
        String nombreProducto = reader.next();
        System.out.println("Ingrese precio del producto: ");
        Double precioProducto = reader.nextDouble();

        return new AppTienda(nombreProducto, precioProducto);
    }

    public void agregarProducto(AppTienda producto) {

        int opc;
        productos.put(producto.getNombre(), producto.getPrecio());
        System.out.println("Desea ingresar un nuevo producto? | 1. SI , 2. NO");
        opc = reader.nextInt();
        if (opc == 1) {
            agregarProducto(crearProducto());
        } else {
            System.out.println("Saliendo de agregar producto...");
        }
    }

    public void modificarPrecio() {

        System.out.println("Ingrese nombre del producto al que desea modificar precio:");
        String nombre = reader.next();
        System.out.println("Ingrese el nuevo precio");
        Double precio = reader.nextDouble();

        productos.replace(nombre, precio);

    }

    public void mostrarProductos() {

        for (Map.Entry<String, Double> prod : productos.entrySet()) {
            System.out.println("Nombre :" + prod.getKey() + " | Precio: " + prod.getValue());
        }

        System.out.println(" ");
    }

    public void eliminarProducto() {

        System.out.println("Ingrese nombre del producto que desea eliminar");
        String nombre = reader.next();

        productos.remove(nombre);
    }

}
