package services;

import entities.Alumno;
import entities.Producto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.in;

public class TiendaService {

    /*Método venta(): El usuario ingresa el nombre del producto que quiere comprar y se lo busca en el
    ArrayList. Si está en el ArrayList, se llama con ese objeto Producto al método. El método se
    decrementa de a uno, como un carrito de compras, el atributo cantidad en inventario, del producto que
    ingresó el usuario. Esto sucederá cada vez que se realice una venta del producto. No se podrán vender
    productos de los que no queden inventario disponible para vender. Devuelve true si se ha podido
    realizar la operación y false en caso contrario.*/

    Scanner reader = new Scanner(System.in);

    public boolean venta(ArrayList<Producto> productos) {

        System.out.println("Ingrese producto que desee comprar: ");
        String productoAComprar = reader.next();

        Iterator<Producto> it = productos.iterator();
        boolean nombreEncontrado = false;

        while (it.hasNext()) {
            Producto p = it.next();
            if (p.getNombreProducto().equalsIgnoreCase(productoAComprar)) {
                if (p.getCantidadInventario() > 0) {
                    p.setCantidadInventario(p.getCantidadInventario() - 1);
                    nombreEncontrado = true;
                }
            }
        }

        return nombreEncontrado;
    }

    /* Método reposición(): El usuario ingresa el nombre del producto que quiere reponer y se lo busca en el
    ArrayList. Si está en el ArrayList, se llama con ese objeto al método. El método incrementa de a uno,
    como un carrito de compras, el atributo cantidad en inventario, del producto seleccionado por el
    usuario. Esto sucederá cada vez que se produzca una reposición de un producto.*/

    public void reposicion(ArrayList<Producto> productos) {

        System.out.println("Ingrese producto que desea reponer: ");
        String productoAReponer = reader.next();

        Iterator<Producto> it = productos.iterator();
        boolean productoEncontrado = false;

        while (it.hasNext()) {
            Producto p = it.next();
            if (p.getNombreProducto().equalsIgnoreCase(productoAReponer)) {
                p.setCantidadInventario(p.getCantidadInventario() + 1);
                productoEncontrado = true;
            }
        }

        if (productoEncontrado) {
            System.out.println("Producto repuesto con éxito");
        } else {
            System.out.println("El producto no está en la tienda");
        }

    }

}
