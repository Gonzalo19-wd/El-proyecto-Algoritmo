package com.mycompany.proyecto_algoritmo;

public class Articulo extends ActivoDigital{
    int volume;

    public Articulo(int volume, String idActivo, String titulo, String autor, String fecha) {
        super(idActivo, titulo, autor, fecha);
        this.volume = volume;
    }

    

    @Override
    void mostrarDetalle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
