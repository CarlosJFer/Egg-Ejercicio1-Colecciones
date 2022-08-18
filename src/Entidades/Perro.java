package Entidades;

import Servicios.Perro_Sv;
import java.util.Scanner;

public class Perro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Perro_Sv nuevaEjecucion = new Perro_Sv();

        nuevaEjecucion.cargarPerro();

        nuevaEjecucion.imprimirPerros();
        
        System.out.println("Ingrese el nombre del perro que desea eliminar");
        String varElegido = leer.next();
        
        nuevaEjecucion.buscarEliminar(varElegido);
        
        
    }

}
