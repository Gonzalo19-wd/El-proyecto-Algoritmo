package com.mycompany.proyecto_algoritmo;

import com.mycompany.proyecto_algoritmo.EstructuraDatos.Lista;


public class GestorActivoDigital {
    
    private Lista<Libro> libros;
    private Lista<Articulo> articulos;
    private Lista<Revista> revistas;

    public GestorActivoDigital() {
        libros = new Lista<>();
        articulos = new Lista<>();
        revistas = new Lista<>();

        cargarDatosPredeterminados();
    }

    private void cargarDatosPredeterminados() {

        // Libros
        libros.insertarCola(new Libro("L001", "978-84-376-0494-7", "Cien años de soledad", "Gabriel García Márquez", "1967", 496));
        libros.insertarCola(new Libro("L002", "978-84-204-7431-0", "Don Quijote de la Mancha", "Miguel de Cervantes", "1605", 863));

        // Artículos
        articulos.insertarCola(new Articulo("A001", "Inteligencia Artificial en la Educación", "Juan Pérez", "2024", 12));
        articulos.insertarCola(new Articulo("A002","Bases de Datos Distribuidas", "María López", "2023", 8));

        // Revistas
        revistas.insertarCola(new Revista("R001", "National Geographic", "Varios autores", "2025", "National Geographic Society", 320));
        revistas.insertarCola(new Revista("R002", "IEEE Spectrum", "IEEE", "2025", "IEEE", 45));
    }
    //GETTER 

    public Lista<Libro> getLibros() {
        return libros;
    }

    public Lista<Articulo> getArticulos() {
        return articulos;
    }

    public Lista<Revista> getRevistas() {
        return revistas;
    }
    
    

    
}
