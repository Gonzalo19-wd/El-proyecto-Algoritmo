package com.mycompany.proyecto_algoritmo;
import java.util.Scanner;


public class Proyecto_Algoritmo {
    static Scanner consola = new Scanner(System.in);
    private static int MostrarMenu(){
        int opc=0;
        String opciones = "         Menu Biblioteca Gestion         \n"
                        + "Seleccione opcion:\n"
                        + " 1) Realizar prestamo (arreglo)\n"
                        + " 2) Ingresar nuevo Activo (Lista Entrelazada)\n"
                        + " 3) Ver catalogo (cola Circular)\n"
                        + " 4) Registros de prestamos (Pila)\n";
        System.out.println(opciones);
        opc  = consola.nextInt();
        return opc;
    }
    
    public static void main(String[] args) {
        switch (MostrarMenu()) {
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }
        
    }
}
