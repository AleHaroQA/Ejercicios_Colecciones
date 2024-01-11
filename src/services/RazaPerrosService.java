package services;

import entities.RazaPerros;
import utilities.Comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class RazaPerrosService {

    /*Ejercicio 1.Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList.*/

    private Scanner reader;
    private ArrayList<RazaPerros> razasPerros;

    public RazaPerrosService() {
        this.reader = new Scanner(System.in);
        this.razasPerros = new ArrayList<>();
    }

    public RazaPerros pedirRaza() {

        System.out.print("Ingrese raza de perro: ");
        String raza = reader.next();

        return new RazaPerros(raza);
    }

    public void agregarRaza(RazaPerros rp) {

        razasPerros.add(rp);
    }

    public void preguntarAlUsuario() {

        int opc;
        boolean salir = false;

        RazaPerros rp = pedirRaza();
        agregarRaza(rp);

        do {
            System.out.println("Quiere ingresa otra raza? (1 Si | 2 No)");
            opc = reader.nextInt();

            if (opc == 1) {
                RazaPerros rp1 = pedirRaza();
                agregarRaza(rp1);
            } else {
                mostrarLista();
                salir = true;
                eliminarRaza();
            }
        } while (!salir);

    }

    public void mostrarLista() {

        Collections.sort(razasPerros, Comparadores.ordenarPorAlfabeto);
        for (RazaPerros razas : razasPerros) {
            System.out.print("[" + razas + "]");
        }
        System.out.println(" ");
    }

    /* Ejercicio 2.Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
    un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
    está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
    ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
    la lista ordenada.*/


    public void eliminarRaza() {

        Iterator<RazaPerros> it = razasPerros.iterator();
        boolean razaEncontrada = false;

        System.out.println(" ");
        System.out.println("-------Eliminar Raza-------");
        System.out.print("Ingrese raza a eliminar: ");
        String razaEliminada = reader.next();

        while (it.hasNext()) {
            RazaPerros rp = it.next();
            if (rp.getRazaPerro().equalsIgnoreCase(razaEliminada)) {
                it.remove();
                razaEncontrada = true;
            }
        }

        if (razaEncontrada) {
            System.out.println("Raza eliminada. Se ha actualizado la lista: ");
            mostrarLista();
        } else {
            System.out.println("La raza no está en la lista");
            mostrarLista();
        }

    }

}
