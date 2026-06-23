package com.mycompany.proyecto_algoritmo;


abstract class ActivoDigital {
    protected String idActivo;
    protected String titulo;
    protected String autor;
    protected String fecha;

    public ActivoDigital(String idActivo, String titulo, String autor, String fecha) {
        this.idActivo = idActivo;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }
    
    abstract String mostrarDetalle();
    
}
