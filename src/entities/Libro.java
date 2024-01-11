package entities;

public class Libro {

    //¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.

    //Atributos

    private String titulo;

    //Constructor

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    //Getter y setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //toString (*crear siempre para objetos)

    @Override
    public String toString() {
        return "Titulo='" + titulo + '\'';
    }
}
