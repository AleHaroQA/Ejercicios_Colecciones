package entities;

import java.util.Comparator;

public class Pais {

    //Atributos
    private String nombre;

    //Constructor
    public Pais(String nombre) {
        this.nombre = nombre;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString
    @Override
    public String toString() {
        return "Pais [nombre=" + nombre + "]";
    }

	/*@Override
	public int compareTo(Pais o) {
		return o.getNombre().compareTo(this.nombre);
	}*/
}
