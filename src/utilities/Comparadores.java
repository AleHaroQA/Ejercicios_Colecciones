package utilities;

import entities.Pais;
import entities.Pelicula;
import entities.RazaPerros;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<RazaPerros> ordenarPorAlfabeto = new Comparator<RazaPerros>() {

        @Override
        public int compare(RazaPerros o1, RazaPerros o2) {

            return o1.getRazaPerro().compareToIgnoreCase(o2.getRazaPerro());
        }
    };






    public static Comparator<Pais> ordenarAlfabetic = new Comparator<Pais>() {

        @Override
        public int compare(Pais p1, Pais p2) {

            return p1.getNombre().compareToIgnoreCase(p2.getNombre());
        }


    };





    public static Comparator<Pelicula> ordenarDuracionDesc = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };


    public static Comparator<Pelicula> ordenarDuracionAsc = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {
           return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };


    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDirector().compareToIgnoreCase(p2.getDirector());
        }
    };

}
