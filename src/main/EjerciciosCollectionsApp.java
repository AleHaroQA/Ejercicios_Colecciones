package main;

import entities.AppTienda;
import entities.Ciudad;
import entities.Producto;
import services.*;

import java.util.*;

import static java.lang.System.in;

public class EjerciciosCollectionsApp {

    public static void main(String[] args) {

        // Deteccion de errores

       /* ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> nombres = new TreeSet();
        HashMap<Integer, String> personas = new HashMap<>();*/

        //EJERCICIO COLECCIONES
        // Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.

        /*ArrayList<Integer> numA = new ArrayList();
        TreeSet<Integer> numB = new TreeSet();
        HashMap<Integer, String> alumnos = new HashMap();

        for (int i = 0; i < 5; i++) {
            numA.add(i + 1);
        }

        for (int i = 5; i < 10; i++) {
            numB.add(i + 1);
        }

        for (int i = 0; i < 5; i++) {
            alumnos.put(i + 1, "Ale");
        }

        System.out.println("Arraylist");
        for (Integer numsA : numA) {
            System.out.print(numsA + "|");
        }

        System.out.println("");
        System.out.println("TreeSet");
        for (Integer numsB : numB) {
            System.out.print(numsB + "|");
        }

        System.out.println("");
        System.out.println("HashMap");
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("DNI: " + entry.getKey() + " Nombre: " + entry.getValue());
        }

        //Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
        //cada forma que aprendiste arriba.

        numA.remove(0);
        //Integer inte = 4;
        numA.remove(Integer.valueOf("4"));
        numB.remove(8);
        alumnos.remove(2);

        System.out.println("Tamaño numA: " + numA.size());
        System.out.println("Arraylist");
        for (Integer numsA : numA) {
            System.out.print(numsA + "|");
        }
        System.out.println("");
        System.out.println("Tamaño numB: " + numB.size());
        System.out.println("Tamaño alumnos: " + alumnos.size());

        //Deteccion de errores

        HashMap<Integer,String> personas = new HashMap<>();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(1,n1);
        personas.put(2,n2);*/

        //Deteccion de errores

        /*ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it =bebidas.iterator();
        while (it.hasNext()){
            if (it.next().equals("café")){
                it.remove();
            }*/

        //EJERCICIO LISTA LIBROS

        /*LibroService ls = new LibroService();
        ls.mostrarLista();*/


        //EJERCICIOS DE APRENDIZAJE
        //EJERCICIO 1 y 2

       /* RazaPerrosService rps = new RazaPerrosService();
        rps.preguntarAlUsuario();*/


        //EJERCICIO 3

        /*AlumnoService as = new AlumnoService();

        as.preguntarAlUsuario();

        int notaFinal = as.notaFinal();

        System.out.println("La nota final es: "+ notaFinal);
*/

        //EJERCICIO EXTRA COOPERATIVO
        /*Scanner reader = new Scanner(System.in);
        TiendaService ts = new TiendaService();

        ArrayList<Producto> productos = new ArrayList();
        int opc;
        boolean salir = false;

        do {
            System.out.println("--------Menú tienda--------");
            System.out.println("1. Ingresar productos");
            System.out.println("2. Vender producto");
            System.out.println("3. Reponer producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            opc = reader.nextInt();

            switch (opc){

                case 1:
                    agregarProducto(productos);
                    break;
                case 2:
                    boolean seRealizoLaVenta = ts.venta(productos);
                    if (seRealizoLaVenta == true) {
                        System.out.println("Compra exitosa");
                    }else{
                        System.out.println("No hay stock. No se pudo realizar la compra");
                    }
                    break;
                case 3:
                    ts.reposicion(productos);
                    break;
                case 4:
                    for (Producto p:productos) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Opción inválida");
            }


        } while (!salir);*/

        //EJERCICIO 4

        /*PeliculaService pS = new PeliculaService();
        pS.agregarPeli();
        pS.ordenarPeliDesc();
        System.out.println("");
        pS.ordenarPeliTitulo();
        System.out.println("");
        pS.ordenarPeliDirector();*/

        //EJERCICIO 5

        PaisService ps = new PaisService();
        ps.agregarPais();
        ps.mostrarPais();
        ps.eliminarPais();


        //EJERCICIO 6

       /* AppTiendaService ats = new AppTiendaService();
        AppTienda ap = ats.crearProducto();

        ats.agregarProducto(ap);
        ats.mostrarProductos();
        ats.modificarPrecio();
        System.out.println("");
        ats.mostrarProductos();
        System.out.println("");
        ats.eliminarProducto();
        ats.mostrarProductos();*/


        //EJERCICIO 1 EXTRA

        /*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
        los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
        introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
        programa mostrará por pantalla el número de valores que se han leído, su suma y su
        media (promedio).*/

        /*List<Integer> serieNumeros = new ArrayList<>();

        agregarNumeros(serieNumeros);
        mostrarNumeros(serieNumeros);*/

        //EJERCICIO 2 EXTRA

        /*CantanteService cS = new CantanteService();
        cS.menu();*/


        //EJERCICIO 3 EXTRA

        /*LibreriaService ls = new LibreriaService();
        ls.agregarLibro();

        ls.mostrarLibreria();

        boolean prestamo = ls.prestamo();
        if (prestamo) {
            System.out.println("Prestamo exitoso");
            ls.mostrarLibreria();
        }else {
            System.out.println("No quedan ejemplares disponibles para préstamo");
            ls.mostrarLibreria();
        }
        boolean devolucion = ls.devolucion();
        if (devolucion) {
            System.out.println("Devolución exitosa");
            ls.mostrarLibreria();
        }else {
            System.out.println("No hay ejemplares prestados");
            ls.mostrarLibreria();
        }*/



        //EJERCICIO 4 EXTRA

        /*CiudadService cs = new CiudadService();
        cs.agregarCiudad();
        cs.mostrarCiudades();
        cs.pedirCiudad();
        cs.agregarNuevaCiudad();
        cs.eliminarCiudad();
        cs.mostrarCiudades();*/



    }

    public static void agregarNumeros(List<Integer> numeros) {

        Scanner reader = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un número: ");
            num = reader.nextInt();
            if (num != -99) {
                numeros.add(num);
            }
        } while (num != -99);

    }

    public static void mostrarNumeros(List<Integer> numeros) {

        int suma = 0;

        for (Integer nums : numeros) {
            suma += nums;
            System.out.print("[" + nums + "]");
        }
        System.out.println(" ");

        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + (suma / numeros.size()));


    }


    public static void agregarProducto(ArrayList<Producto> productos) {
        Scanner reader = new Scanner(in).useDelimiter("\n");
        Producto p1 = new Producto();
        System.out.println("Ingresar nombre del producto: ");
        p1.setNombreProducto(reader.next());
        System.out.println("Ingrese categoría: ");
        p1.setCategoria(reader.next());
        System.out.println("Ingrese precio: ");
        p1.setPrecio(reader.nextDouble());
        System.out.println("Ingrese cantidad en inventario: ");
        p1.setCantidadInventario(reader.nextInt());

        productos.add(p1);

    }

}
