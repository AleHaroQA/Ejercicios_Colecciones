package entities;

public class AppTienda {

    /*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    productos que venderemos y el precio que tendrán. Además, se necesita que la
    aplicación cuente con las funciones básicas.
    El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.*/

    //Atributos

    private String nombre;
    private Double precio;


    //Constructores

    public AppTienda() {
    }

    public AppTienda(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    //toString


    @Override
    public String toString() {
        return "AppTienda{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

