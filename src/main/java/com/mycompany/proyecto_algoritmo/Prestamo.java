package com.mycompany.proyecto_algoritmo;

public class Prestamo {

    //La clase Prestamo sirve para guardar la información del préstamo realizado
    private String codigoUser;
    private ActivoDigital activo;

    public Prestamo(String codigoUser, ActivoDigital activo) {

        this.codigoUser = codigoUser;
        this.activo = activo;

    }

    public ActivoDigital getActivo() {

        return activo;

    }

    @Override
    public String toString() {

        return "Usuario: " + codigoUser
                + "\nActivo: " + activo.titulo;

    }
}
