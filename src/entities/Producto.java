package entities;

public class Producto {

    /*
    Implementa un programa para una tienda de productos utilizando un ArrayList. Para ello, se debe crear una
    clase llamada Producto que guarde la información de cada uno de los productos de la tienda. La clase
    Producto debe guardar el nombre del producto, la categoría, el precio y la cantidad en inventario.
    En el main, se creará un ArrayList de tipo Producto que guardará todos los productos creados. A
    continuación, tendrás que crear un bucle que solicite al usuario los datos de cada producto y los setee en
    el objeto Producto correspondiente, que se agregará al ArrayList.*/

    //Atributos

    private String nombreProducto;
    private String categoria;
    private double precio;
    private int cantidadInventario;

    //Constructores

    public Producto() {
    }

    public Producto(String nombreProducto, String categoria, double precio, int cantidadInventario) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
    }

    //Getters y setters

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    //toString

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", cantidadInventario=" + cantidadInventario +
                '}';
    }
}
