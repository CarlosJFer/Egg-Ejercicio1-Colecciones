package Metodos;

public class Perro_Mt {

    private String raza;
    private String nombre;
    private String tamaño;

    public Perro_Mt(String raza, String nombre, String tamaño) {
        this.raza = raza;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro_Mt{" + "raza=" + raza + ", nombre=" + nombre + ", tamaño" + tamaño + '}';
    }

}
