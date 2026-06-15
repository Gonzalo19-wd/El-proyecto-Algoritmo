package com.mycompany.proyecto_algoritmo;

interface Iprestable {
    void Prestar(String codigoUser, String idActivo);
    void Devolver(String codigoUser, String idActivo);
}
