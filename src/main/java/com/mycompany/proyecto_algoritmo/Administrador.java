package com.mycompany.proyecto_algoritmo;

import java.util.Scanner;

public class Administrador {

    private Prestamo[] prestamos;
    private int cantidadPrestamos; //TOTAL DE PRESTAMOS
    private int cantidadLibros; //SOLO PUEDE REALIZAR 3 PRESTAMOS
    private int cantidadRevistas; //SOLO PUEDE REALIZAR 2 PRESTAMOS
    private GestorActivoDigital gestor;

    public Administrador(GestorActivoDigital gestor) {
        this.prestamos = new Prestamo[5];
        this.gestor = gestor;
    }

    public void mostrarActivosDigitales() {
        System.out.println("----LIBROS DISPONIBLES---");
        for (int i = 0; i < gestor.getLibros().tamanio(); i++) {
            Libro libro = gestor.getLibros().get(i);

            if (libro.isDisponible()) {
                System.out.println("Codigo:" + libro.idActivo); 
                System.out.println(libro.mostrarDetalle());
                System.out.println();
            }
        }

        System.out.println("----REVISTAS DISPONIBLES---");
        for (int i = 0; i < gestor.getRevistas().tamanio(); i++) {
            Revista revista = gestor.getRevistas().get(i);

            if (revista.isDisponible()) {
                System.out.println("Codigo:" + revista.idActivo);
                System.out.println(revista.mostrarDetalle());
                System.out.println();
            }
        }
    }

    public void realizarPrestamo(String codigoUser, ActivoDigital activo) {
        if (cantidadPrestamos >= 5) {
            System.out.println("El usuario ya realizo 5 prestamos");
            return;
        }

        if (activo instanceof Libro) {
            if (cantidadLibros >= 3) {
                System.out.println("El usuario ya tiene 3 libros");
                return;
            }
        }
        if (activo instanceof Revista) {
            if (cantidadRevistas >= 2) {
                System.out.println("El usuario ya tiene 2 revistas");
                return;
            }
        }

        Iprestable prestable = (Iprestable) activo; //Se realiza un downcasting de la referencia ActivoDigital a la interfaz Iprestable para acceder a los metodos definidos en la interfaz, esto funciona porque implementan la interfaz
        prestable.Prestar(codigoUser, activo.idActivo); //Implementa el metodo Prestar() de la implementacion correspondiente del objeto, es decir se aplica polimorfismo para ejecutar el comportamiento definido en libro o revista y actualizar el estado del activo digital como no disponible
        prestamos[cantidadPrestamos] = new Prestamo(codigoUser, activo);
        cantidadPrestamos++;

        if (activo instanceof Libro) {
            cantidadLibros++;
        }
        if (activo instanceof Revista) {
            cantidadRevistas++;
        }

    }

    public void devolverPrestamo(String codigoUser, ActivoDigital activo) {
        for (int i = 0; i < cantidadPrestamos; i++) {
            if (prestamos[i].getActivo() == activo) {
                Iprestable prestable = (Iprestable) activo;
                prestable.Devolver(codigoUser, activo.idActivo);
                prestamos[i] = prestamos[cantidadPrestamos - 1];

                prestamos[cantidadPrestamos - 1] = null;
                cantidadPrestamos--;

                if (activo instanceof Libro) {
                    cantidadLibros--;
                }
                if (activo instanceof Revista) {
                    cantidadRevistas--;
                }
            }
        }
    }

    public ActivoDigital buscarActivo(String id) {

        for (int i = 0; i < gestor.getLibros().tamanio(); i++) {

            Libro libro = gestor.getLibros().get(i);

            if (libro.idActivo.equals(id)) {
                return libro;
            }
        }

        for (int i = 0; i < gestor.getRevistas().tamanio(); i++) {

            Revista revista = gestor.getRevistas().get(i);

            if (revista.idActivo.equals(id)) {
                return revista;
            }
        }

        for (int i = 0; i < gestor.getArticulos().tamanio(); i++) {

            Articulo articulo = gestor.getArticulos().get(i);

            if (articulo.idActivo.equals(id)) {
                return articulo;
            }
        }

        return null;
    }
}
