package com.mycompany.proyecto_algoritmo.EstructuraDatos;

public class Pila<T> {
    private Nodo<T> tope;
    //apilar
    public void ingresar(T activo) {
        Nodo<T> nuevo = new Nodo<>(activo);
        nuevo.next = tope;
        tope = nuevo;
    }

    // deveulve el ultimo (pop)
    public T quitar() {
        if (tope == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        T dato = tope.dato;
        tope = tope.next;
        return dato;
    }

    // Ver el último elemento (peek)
    public T ultimo() {
        if (tope == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        return tope.dato;
    }

    // Verificar si está vacía
    public boolean isEmpty() {
        return tope == null;
    }

}
