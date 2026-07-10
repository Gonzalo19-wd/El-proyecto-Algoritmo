package com.mycompany.proyecto_algoritmo;

public class Usuario implements Comparable<Usuario> {

    public String codigoUser;
    public String nombre;
    public String apellido;
    public String DNI;

    public Usuario(String codigoUser, String nombre, String apellido, String DNI) {
        this.codigoUser = codigoUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    @Override
    public int compareTo(Usuario otro) {
        return this.codigoUser.compareTo(otro.codigoUser);
    }

}
