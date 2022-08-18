package Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Perro_Sv {

    private ArrayList<String> nuevalista;
    private Scanner leer;

    public Perro_Sv() {
        this.nuevalista = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    String respuesta = "";

    public void cargarPerro() {
        do {
            System.out.println("Ingrese el nombre");
            String nombrePerro = leer.next();
            nuevalista.add(nombrePerro);

            System.out.println("Ingrese la raza");
            String razaPerro = leer.next();
            nuevalista.add(razaPerro);

            System.out.println("Ingrese tamaño");
            String tamañoPerro = leer.next();
            nuevalista.add(tamañoPerro);

            System.out.println("Quiere ingresar otro perro?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("Si"));

    }

    public void imprimirPerros() {
        for (String imprimir : nuevalista) {
            System.out.println(imprimir);
        }
    }

    public void buscarEliminar(String varElegido) {

        Iterator<String> it = nuevalista.iterator();

        while (it.hasNext()) {

            if (it.next().equals(varElegido)) {

                it.remove();

            } else{
                System.out.println("El perro ingresado no se encuentra en la lista");
            }
        }
        for (String imprimir : nuevalista) {
                    System.out.println(imprimir);
                }      
    }
}
