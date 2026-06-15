package com.mycompany.proyecto_algoritmo;
import java.util.*;

private List<ActivoDigital> activos;

    // Constructor: al crear el gestor, se inicializan automáticamente los libros
    public GestorActivoDigital() {
        activos = new ArrayList<>();

        activos.add(new Libro(300, "978-3-16-148410-0", "L001", "El Quijote", "Miguel de Cervantes", "1605"));
        activos.add(new Libro(417, "978-1-4028-9462-6", "L002", "Cien años de soledad", "Gabriel García Márquez", "1967"));
        activos.add(new Libro(223, "978-0-7432-7356-5", "L003", "El Principito", "Antoine de Saint-Exupéry", "1943"));
        activos.add(new Libro(500, "978-0-452-28423-4", "L004", "1984", "George Orwell", "1949"));
        activos.add(new Libro(310, "978-84-376-0494-7", "L005", "La ciudad y los perros", "Mario Vargas Llosa", "1963"));
        activos.add(new Libro(280, "978-0-14-044913-6", "L006", "La Odisea", "Homero", "Antigüedad"));
    }


public class GestorActivoDigital {
    
    public void mostrarListado(){
        
    }
}
