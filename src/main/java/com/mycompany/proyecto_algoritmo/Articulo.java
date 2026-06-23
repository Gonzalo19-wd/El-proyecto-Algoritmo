package com.mycompany.proyecto_algoritmo;

public class Articulo extends ActivoDigital{
    int volumen;

    public Articulo(String idActivo, String titulo, String autor, String fecha, int volumen) {
        super(idActivo, titulo, autor, fecha);
        this.volumen = volumen;
    }

     @Override
    String mostrarDetalle() {
        StringBuilder sbMensaje = 
            new StringBuilder("----------------------------\nDATOS DEL ARTICULO\n----------------------------");

        sbMensaje.append("\nID Activo: ").append(idActivo);
        sbMensaje.append("\nTitulo: ").append(titulo);
        sbMensaje.append("\nAutor: ").append(autor);
        sbMensaje.append("\nFecha: ").append(fecha);
        sbMensaje.append("\nVolumen: ").append(volumen);

        return sbMensaje.toString();
    }
    
    
}
