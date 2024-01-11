package entities;

public class Libreria {

    /*Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
    repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
    cada uno de los libros de una Biblioteca. La clase Libro debe guardar
    el título del libro, autor, número de ejemplares y número de ejemplares prestados.
    También se creará en el main un HashSet de tipo Libro que guardará todos los libros
    Constructor por defecto.
    Constructor con parámetros.
    Métodos Setters/getters*/

    //Atributos

    private String titulo;
    private String autor;
    private int cantidad;
    private int prestados;

    //Constructores

    public Libreria() {
    }

    public Libreria(String titulo, String autor, int cantidad, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
        this.prestados = prestados;
    }

    //Getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    //toString

    @Override
    public String toString() {
        return "Libreria{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantidad=" + cantidad +
                ", prestados=" + prestados +
                '}';
    }
}
