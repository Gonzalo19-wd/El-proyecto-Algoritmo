package com.mycompany.proyecto_algoritmo;

import java.util.Scanner;
import com.mycompany.proyecto_algoritmo.EstructuraDatos.*;

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
                + "5. Registor de Ultimo Registro (Pila)\n"
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
                case 3:
                    System.out.println("Indique material a Ingresar:"
                            + "\n1) Libro"
                            + "\n2) Articulo"
                            + "\n3) Revista"
                            + "\n0) Cancelar");
                    int acti = consola.nextInt();
                    switch (acti) {
                        case 1:
                            System.out.println("Ingrese ID:");
                            String idLi = consola.next();
                            System.out.println("Ingrese título:");
                            String tituloLib = consola.next();
                            System.out.println("Ingrese autor:");
                            String autorLib = consola.next();
                            System.out.println("Ingrese fecha:");
                            String fechaLib = consola.next();
                            System.out.println("Ingrese ISBN:");
                            String barras = consola.next();
                            System.out.println("Ingrese páginas:");
                            int pagsLib = consola.nextInt();
                            
                            Libro inser = new Libro(idLi, barras, tituloLib, autorLib, fechaLib, pagsLib);
                            gestor.InsertarLibro(inser);
                            break;
                        case 2:
                            System.out.println("Ingrese ID:");
                            String idArt = consola.next();
                            System.out.println("Ingrese título:");
                            String tituloArt = consola.next();
                            System.out.println("Ingrese autor:");
                            String autorArt = consola.next();
                            System.out.println("Ingrese fecha:");
                            String fechaArt = consola.next();
                            System.out.println("Ingrese N° Vol:");
                            int vol = consola.nextInt();
                            
                            Articulo artinsr = new Articulo(idArt, tituloArt, autorArt, fechaArt, vol);
                            gestor.InsertarArticulo(artinsr);
                            break;
                        case 3:
                            System.out.println("Ingrese ID:");
                            String idre = consola.next();
                            System.out.println("Ingrese título:");
                            String tituloRev = consola.next();
                            System.out.println("Ingrese autor:");
                            String autorRev = consola.next();
                            System.out.println("Ingrese fecha:");
                            String fechaRev = consola.next();
                            System.out.println("Ingrese editorial:");
                            String editorial = consola.next();
                            System.out.println("Ingrese páginas:");
                            int pagsRev = consola.nextInt();
                            
                            Revista revins = new Revista(idre, tituloRev, autorRev, fechaRev, editorial, pagsRev);
                            gestor.InsertarRevista(revins);
                            break;
                        case 0:
                            break;
                        default:
                            throw new AssertionError();
                    }
                case 4:
                    GestorActivoDigital gestorCirc = new GestorActivoDigital();
                    ListaCirc<ActivoDigital> catalogo = gestor.transformarEnListaCircular();

                    boolean continuar = true;

                    while (continuar) {
                        ActivoDigital actual = catalogo.siguiente();
                        System.out.println("Material actual: " + actual);

                        System.out.println("1) Siguiente material");
                        System.out.println("2) Salir");
                        int seguir = consola.nextInt();

                        if (seguir == 2) {
                            continuar = false;
                        }
                    }
                case 5:
                    
                default:
                    throw new AssertionError();
            }
            consola.nextLine();
        } while (opcion != 0);

    }
}
