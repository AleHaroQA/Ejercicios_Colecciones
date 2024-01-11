package services;

import entities.Alumno;
import entities.RazaPerros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.in;

public class AlumnoService {

    /*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
    toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    pregunta al usuario si quiere crear otro Alumno o no.
    Después de ese bucle tendremos el siguiente método en el servicio de Alumno:*/

    private Scanner reader;
    private ArrayList<Alumno> alumnos;

    public AlumnoService() {
        this.reader = new Scanner(System.in);
        this.alumnos = new ArrayList<>();
    }

    public Alumno crearAlumno() {

        System.out.println("Ingrese el nombre del alumno:");
        String nombre = reader.next();

        return new Alumno(nombre, llenarNotas());
    }

    public ArrayList<Integer> llenarNotas() {

        ArrayList<Integer> notas = new ArrayList();
        int nota;
        int cont = 0;
        do {
            System.out.println("Ingrese nota: " + (cont + 1));
            nota = reader.nextInt();
            notas.add(nota);
            cont++;
        } while (cont < 3);

        return notas;
    }

    public void preguntarAlUsuario() {

        boolean salir = false;
        int opc;
        Alumno al1 = crearAlumno();
        alumnos.add(al1);
        do {
            System.out.println("Quiere ingresar un nuevo alumno? 1. Si | 2. No");
            opc = reader.nextInt();

            if (opc == 1) {
                Alumno al2 = crearAlumno();
                alumnos.add(al2);
            } else {
                salir = true;
            }

        } while (!salir);

    }

    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    promedio final, devuelto por el método y mostrado en el main.
     */

    public int notaFinal() {

        Iterator<Alumno> it = alumnos.iterator();
        boolean nombreEncontrado = false;
        int suma = 0;

        System.out.println("Ingrese alumno al cual quiere calcular nota final: ");
        String nombre = reader.next();

        while (it.hasNext()) {
            Alumno alumno = it.next();
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                for (Integer nota : alumno.getNotas()) {
                    suma += nota;
                }
                nombreEncontrado = true;
            }
        }

        if (nombreEncontrado) {
            return suma / 3;
        } else {
            System.out.println("El alumno no está en la lista");
            return 0;
        }

    }


}
