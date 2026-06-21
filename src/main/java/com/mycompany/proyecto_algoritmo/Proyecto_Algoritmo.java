package com.mycompany.proyecto_algoritmo;

import java.util.Scanner;

public class Proyecto_Algoritmo {

    static Scanner consola = new Scanner(System.in);
    static Usuario usuarioActual;
    static Administrador admin;

    private static int MostrarMenu() {
        int opc = 0;
        System.out.println(
                "---------------Sistema de Biblioteca--------------\n"
                + "1. Registrar usuario\n"
                + "2. Realizar Prestamo (arreglo)\n"
                + "3. Ingresar nuevo activo (Lista Enlazada)\n"
                + "4. Ver catalogo (cola circular)\n"
                + "5. Registor de Prestamos (Pila)\n"
                + "0. FIN\n"
                + "-----------------------------------------------------\n"
                + "Ingrese la opcion [1 - 4] =>");
        opc = consola.nextInt();
        return opc;
    }

    public static void main(String[] args) {
        GestorActivoDigital gestor = new GestorActivoDigital();
        admin = new Administrador(gestor);
        int opcion;
        do {
            opcion = MostrarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese codigo");
                    String codigo = consola.next();
                    System.out.println("Ingrese nombre");
                    String nombre = consola.next();
                    System.out.println("Ingrese apellido:");
                    String apellido = consola.next();
                    System.out.println("Ingrese DNI:");
                    String dni = consola.next();
                    
                    usuarioActual = new Usuario(codigo, nombre, apellido, dni);
                    
                    System.out.println("Usuario registrado correctamente");
                    
                    break;
                case 2:
                    admin.mostrarActivosDigitales();
                    
                    System.out.println("Ingrese codigo del activo:");
                    String id = consola.next();
                    
                    ActivoDigital activo = admin.buscarActivo(id);
                    
                    if (activo != null) {
                        admin.realizarPrestamo(usuarioActual.codigoUser, activo);
                    } else {
                        System.out.println("Activo no encontrado");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            consola.nextLine();
        } while (opcion != 0);

    }
}
