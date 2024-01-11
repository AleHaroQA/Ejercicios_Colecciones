package entities;

public class RazaPerros {

    /*Ejercicio 1.Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList.*/

    //Atributos

    private String razaPerro;

    //Constructor

    public RazaPerros(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    //Getters y setters

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    //toString

    @Override
    public String toString() {
        return "RazaPerros{" +
                "razaPerro='" + razaPerro + '\'' +
                '}';
    }
}
