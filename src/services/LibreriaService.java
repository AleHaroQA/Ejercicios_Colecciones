package services;

import entities.Libreria;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class LibreriaService {

    private Scanner reader;
    private Set<Libreria> libros;

    public LibreriaService() {
        this.reader = new Scanner(System.in);
        this.libros = new HashSet<>();
    }

    /*En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
    datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
    pregunta al usuario si quiere crear otro Libro o no.*/

    public Libreria crearLibro() {

        Libreria libro = new Libreria();
        System.out.println("Ingrese titulo:");
        libro.setTitulo(reader.next());
        System.out.println("Ingrese autor:");
        libro.setAutor(reader.next());
        System.out.println("Ingrese cantidad de ejemplares:");
        libro.setCantidad(reader.nextInt());
        System.out.println("Ingrese cantidad de ejemplares prestados:");
        libro.setPrestados(reader.nextInt());

        return libro;
    }

    public void agregarLibro() {

        int opc;

        Libreria l = crearLibro();
        libros.add(l);
        System.out.println("Quiere agregar otro libro? 1.SI | 2.NO");
        opc = reader.nextInt();
        if (opc == 1) {
            agregarLibro();
        }
    }

    /*Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
    en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
    método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
    prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
    préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
    disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
    caso contrario.*/

    public boolean prestamo() {

        System.out.println(" ");
        boolean operacionExitosa = false;
        System.out.println("Ingrese título a prestar:");
        String tituloPrestar = reader.next();

        for (Libreria l : libros) {
            if (l.getTitulo().equalsIgnoreCase(tituloPrestar) && l.getCantidad() > l.getPrestados()) {
                l.setPrestados(l.getPrestados() + 1);
                operacionExitosa = true;
            }
        }

        return operacionExitosa;
    }

    /*Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
    busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
    método decrementa de a uno, como un carrito de compras, el atributo ejemplares
    prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
    produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
    ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
    caso contrario.*/

    public boolean devolucion() {

        System.out.println(" ");
        boolean operacionExitosa = false;
        System.out.println("Ingrese título a devolver:");
        String tituloDevolver = reader.next();

        for (Libreria l : libros) {
            if (l.getTitulo().equalsIgnoreCase(tituloDevolver) && l.getPrestados() > 0) {
                l.setPrestados(l.getPrestados() - 1);
                operacionExitosa = true;
            }
        }

        return operacionExitosa;
    }

    public void mostrarLibreria() {

        System.out.println(" ");
        for (Libreria l : libros) {
            System.out.println(l);
        }
    }

}
