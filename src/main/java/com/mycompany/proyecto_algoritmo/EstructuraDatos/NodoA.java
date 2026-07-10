/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_algoritmo.EstructuraDatos;

/**
 *
 * @author User
 */
public class NodoA<T extends Comparable<T>>{
    T dato;
    NodoA<T>izquierdo;
    NodoA<T>derecho;

    public NodoA(T dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
    
    
}
