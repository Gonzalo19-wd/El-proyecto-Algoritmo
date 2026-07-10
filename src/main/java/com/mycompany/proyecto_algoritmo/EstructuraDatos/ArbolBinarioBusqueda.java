package com.mycompany.proyecto_algoritmo.EstructuraDatos;

public class ArbolBinarioBusqueda<T extends Comparable<T>> {

    private NodoA<T> raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public boolean buscar(T dato) {
        return buscarRec(raiz, dato);
    }

    private boolean buscarRec(NodoA<T> actual, T dato) {
        if (actual == null) {
            return false;
        }
        int comparar = dato.compareTo(actual.dato);

        if (comparar == 0) {
            return true;
        }
        if (comparar < 0) {
            return buscarRec(actual.izquierdo, dato);
        } else {
            return buscarRec(actual.derecho, dato);
        }
    }

    public void insertar(T dato) {
        raiz = insertarRec(raiz, dato);
    }

    private NodoA<T> insertarRec(NodoA<T> actual, T dato) {
        if (actual == null) {
            return new NodoA<>(dato);
        }
        if (dato.compareTo(actual.dato) < 0) {
            actual.izquierdo = insertarRec(actual.izquierdo, dato);
        } else if (dato.compareTo(actual.dato) > 0) {
            actual.derecho = insertarRec(actual.derecho, dato);
        }
        return actual;
    }
    

}
