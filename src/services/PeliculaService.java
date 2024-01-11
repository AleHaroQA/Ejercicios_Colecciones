package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import entities.Pelicula;
import utilities.Comparadores;

public class PeliculaService {

    private List<Pelicula> listaPeli;
    private Scanner reader;

    public PeliculaService() {
        this.listaPeli = new ArrayList<>();
        this.reader = new Scanner(System.in);
    }

    public Pelicula crearPelicula() {

        System.out.println("Vamos a crear una película");
        System.out.println("Ingrese el título");
        String titulo = reader.next();
        System.out.println("Ingrese el director");
        String director = reader.next();
        System.out.println("Ingrese la duración (en horas)");
        double duracion = reader.nextDouble();
        Pelicula peli = new Pelicula(titulo, director, duracion);
        return peli;
    }

    public void agregarPeli() {
        String resp;
        listaPeli.add(crearPelicula());
        System.out.println("Desea agregar otra película? (S/N)");
        resp = reader.next();
        if (resp.equalsIgnoreCase("S")) {
            agregarPeli();
        } else {
            System.out.println("Muchas gracias!");
        }
    }

    public void mostrarPeli() {
        for (Pelicula pelicula : listaPeli) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPeliUnaHora() {
        for (Pelicula pelicula : listaPeli) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarPeliDesc() {
        Collections.sort(listaPeli, Comparadores.ordenarDuracionDesc);
        mostrarPeli();
    }

    public void ordenarPeliAsc() {
        Collections.sort(listaPeli, Comparadores.ordenarDuracionAsc);
        mostrarPeli();
    }

    public void ordenarPeliTitulo() {
        Collections.sort(listaPeli, Comparadores.ordenarTitulo);
        mostrarPeli();
    }

    public void ordenarPeliDirector() {
        Collections.sort(listaPeli, Comparadores.ordenarDirector);
        mostrarPeli();
    }

}
