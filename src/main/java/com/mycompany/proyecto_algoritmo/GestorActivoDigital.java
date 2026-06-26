package com.mycompany.proyecto_algoritmo;

import com.mycompany.proyecto_algoritmo.EstructuraDatos.*;

public class GestorActivoDigital {
    
    private Lista<Libro> libros;
    private Lista<Articulo> articulos;
    private Lista<Revista> revistas;
    private Pila<ActivoDigital> pila;
    private ListaCirc<ActivoDigital> ListCirc;

    public GestorActivoDigital() {
        libros = new Lista<>();
        articulos = new Lista<>();
        revistas = new Lista<>();
        pila = new Pila<>();
        cargarDatosPredeterminados();
    }

    private void cargarDatosPredeterminados() {

        // Libros
        libros.insertarCola(new Libro("L001", "978-84-376-0494-7", "Cien años de soledad", "Gabriel García Márquez", "1967", 496));
        libros.insertarCola(new Libro("L002", "978-84-204-7431-0", "Don Quijote de la Mancha", "Miguel de Cervantes", "1605", 863));
        libros.insertarCola(new Libro("L003", "978-0-14-044926-6", "La Odisea", "Homero", "Antigüedad", 560));
        libros.insertarCola(new Libro("L004", "978-84-376-0494-8", "La ciudad y los perros", "Mario Vargas Llosa", "1963", 350));
        libros.insertarCola(new Libro("L005", "978-0-452-28423-5", "1984", "George Orwell", "1949", 328));
        libros.insertarCola(new Libro("L006", "978-84-376-0494-9", "El Principito", "Antoine de Saint-Exupéry", "1943", 96));
        libros.insertarCola(new Libro("L007", "978-84-376-0495-0", "Rayuela", "Julio Cortázar", "1963", 600));

        // Artículos
        articulos.insertarCola(new Articulo("A001", "Inteligencia Artificial en la Educación", "Juan Pérez", "2024", 12));
        articulos.insertarCola(new Articulo("A002","Bases de Datos Distribuidas", "María López", "2023", 8));
        articulos.insertarCola(new Articulo("A003", "Redes Neuronales Convolucionales", "Carlos Gómez", "2022", 15));
        articulos.insertarCola(new Articulo("A004", "Blockchain en Finanzas", "Ana Torres", "2021", 10));
        articulos.insertarCola(new Articulo("A005", "Computación Cuántica y Criptografía", "Luis Fernández", "2024", 18));
        articulos.insertarCola(new Articulo("A006", "Big Data en Salud", "Sofía Ramírez", "2023", 12));
        articulos.insertarCola(new Articulo("A007", "Robótica Autónoma", "Pedro Sánchez", "2025", 20));

        // Revistas
        revistas.insertarCola(new Revista("R001", "National Geographic", "Varios autores", "2025", "National Geographic Society", 320));
        revistas.insertarCola(new Revista("R002", "IEEE Spectrum", "IEEE", "2025", "IEEE", 45));
        revistas.insertarCola(new Revista("R003", "Scientific American", "Varios autores", "2024", "Springer Nature", 120));
        revistas.insertarCola(new Revista("R004", "Nature", "Nature Publishing Group", "2025", "Nature", 200));
        revistas.insertarCola(new Revista("R005", "Science", "AAAS", "2025", "AAAS", 150));
        revistas.insertarCola(new Revista("R006", "MIT Technology Review", "MIT", "2024", "MIT Press", 90));
        revistas.insertarCola(new Revista("R007", "Harvard Business Review", "Harvard University", "2023", "Harvard Business School", 75));
    }
    //GETTER 

    public Lista<Libro> getLibros() {
        return libros;
    }
    public void InsertarLibro(Libro nuevo){
        libros.insertarCabeza(nuevo);
        pila.ingresar(nuevo);
    }
    public void InsertarArticulo(Articulo nuevo){
        articulos.insertarCabeza(nuevo);
        pila.ingresar(nuevo);
    }
    public void InsertarRevista(Revista nuevo){
        revistas.insertarCabeza(nuevo);
        pila.ingresar(nuevo);
    }
    public ListaCirc<ActivoDigital> transformarEnListaCircular() {
        ListaCirc<ActivoDigital> listaCirc = new ListaCirc<>();

        // Agregar libros
        for (int i = 0; i < libros.tamanio(); i++) {
            listaCirc.insertar(libros.get(i));
        }

        // Agregar artículos
        for (int i = 0; i < articulos.tamanio(); i++) {
            listaCirc.insertar(articulos.get(i));
        }

        // Agregar revistas
        for (int i = 0; i < revistas.tamanio(); i++) {
            listaCirc.insertar(revistas.get(i));
        }

        return listaCirc;
    }
    
    public void verUltimoActivo() {
        ActivoDigital ultimo = pila.ultimo();
        if (ultimo != null) {
            System.out.println("Último activo ingresado: " + ultimo);
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    public void eliminarUltimoActivo() {
        ActivoDigital ultimo = pila.quitar();
        if (ultimo != null) {
            if (ultimo instanceof Libro) {
                libros.eliminarCabeza();
            } else if (ultimo instanceof Articulo) {
                articulos.eliminarCabeza();
            } else if (ultimo instanceof Revista) {
                revistas.eliminarCabeza();
            }
            System.out.println("Se eliminó el último activo: " + ultimo);
        } else {
            System.out.println("No hay activos para eliminar.");
        }
    }

    public Lista<Articulo> getArticulos() {
        return articulos;
    }

    public Lista<Revista> getRevistas() {
        return revistas;
    }
    
    

    
}
