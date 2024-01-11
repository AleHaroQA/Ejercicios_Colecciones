package entities;

public class Ciudad {

    /*Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
    página: https://mapanet.eu/index.htm Nota: Poner el código postal sin la letra, solo el
    número.*/

    //Atributos

    private Integer codigoPostal;
    private String nombreCiudad;

    //Constructores

    public Ciudad(Integer codigoPostal, String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
        this.codigoPostal = codigoPostal;
    }

    //Getters y setters

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    //toString

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombreCiudad='" + nombreCiudad + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
