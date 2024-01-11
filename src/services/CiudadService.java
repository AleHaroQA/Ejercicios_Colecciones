package services;

import entities.Ciudad;

import java.util.*;


public class CiudadService {

    private Scanner reader;
    private Map<Integer, String> codigosPostales;

    public CiudadService() {

        this.reader = new Scanner(System.in);
        this.codigosPostales = new HashMap<>();
    }

    public Ciudad crearCiudad() {

        System.out.println("Ingrese nombre de la ciudad: ");
        String nombre = reader.next();
        System.out.println("Ingrese código postal de la ciudad: ");
        int codigo = reader.nextInt();

        return new Ciudad(codigo, nombre);
    }

    // Pedirle al usuario que ingrese 10 códigos postales y sus ciudades
    public void agregarCiudad() {

        for (int i = 0; i < 4; i++) {
            System.out.println("Ciudad " + (i + 1));
            Ciudad ciudad = crearCiudad();
            codigosPostales.put(ciudad.getCodigoPostal(), ciudad.getNombreCiudad());
        }
    }

    //Muestra por pantalla los datos introducidos
    public void mostrarCiudades() {

        for (Map.Entry<Integer, String> c : codigosPostales.entrySet()) {
            System.out.println("Código postal: " + c.getKey() + ", Nombre ciudad: " + c.getValue());
        }
        System.out.println(" ");
    }

    // Pide un código postal y muestra la ciudad asociada si existe, sino avisa al usuario
    public void pedirCiudad() {

        boolean existe = false;
        String nombreEncontrado = "";
        System.out.println("Ingrese código postal para ver si ciudad está ingresada en base de datos: ");
        int codigoABuscar = reader.nextInt();

        for (Map.Entry<Integer, String> cp : codigosPostales.entrySet()) {
            if (cp.getKey().equals(codigoABuscar)) {
                existe = true;
                nombreEncontrado = cp.getValue();
                break;
            }
        }

        if (existe) {
            System.out.println("Se ha encontrado la ciudad -> " + nombreEncontrado);
        }else{
            System.out.println("Ciudad no está en base de datos ");
        }

        System.out.println(" ");
    }

    //Agregar una ciudad con su código postal correspondiente más al HashMap.
    public void agregarNuevaCiudad() {

        System.out.println("Ingrese nueva ciudad a base de datos:");
        Ciudad ciudad = crearCiudad();
        codigosPostales.put(ciudad.getCodigoPostal(), ciudad.getNombreCiudad());
        System.out.println(" ");

    }

    // Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario

    public void eliminarCiudad() {

        System.out.println("Ingrese codigo postal a eliminar:");
        int codigoPostalAEliminar = reader.nextInt();
        codigosPostales.remove(codigoPostalAEliminar);
        System.out.println(" ");
    }

}
