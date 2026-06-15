package com.mycompany.proyecto_algoritmo;

public class Libro extends ActivoDigital implements Iprestable{
    int npaginas;
    String ISBN;

    public Libro(int npaginas, String ISBN, String idActivo, String titulo, String autor, String fecha) {
        super(idActivo, titulo, autor, fecha);
        this.npaginas = npaginas;
        this.ISBN = ISBN;
    }

    

    @Override
    void mostrarDetalle() {
        
        
    }

    @Override
    public void Prestar(String codigoUser, String idActivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Devolver(String codigoUser, String idActivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
