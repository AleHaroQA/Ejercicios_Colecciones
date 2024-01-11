package services;

import entities.Libro;
import entities.RazaPerros;

import java.util.ArrayList;
import java.util.Scanner;

public class LibroService {

    private ArrayList<Libro> libros;

    public LibroService() {
        this.libros = new ArrayList<>();
    }

    public void llenarLista() {

        Libro l1 = new Libro("Papelucho");
        Libro l2 = new Libro("Papelucho 2");
        Libro l3 = new Libro("Papelucho 3");

        libros.add(l1);
        libros.add(l2);
        libros.add(l3);
    }

    public void mostrarLista() {

        llenarLista();
        for (Libro libro : libros) {
            System.out.println(libro);
        }

    }

}
