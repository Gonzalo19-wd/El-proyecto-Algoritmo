package com.mycompany.proyecto_algoritmo;

public class Revista extends ActivoDigital implements Iprestable{
    String Editorial;
    int numero;

    public Revista(String Editorial, int numero, String idActivo, String titulo, String autor, String fecha) {
        super(idActivo, titulo, autor, fecha);
        this.Editorial = Editorial;
        this.numero = numero;
    }

    @Override
    void mostrarDetalle() {
        System.out.println("Mostrando detalles del activo:");
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