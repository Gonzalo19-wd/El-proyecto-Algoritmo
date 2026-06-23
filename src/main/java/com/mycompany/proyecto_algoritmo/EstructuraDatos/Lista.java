package com.mycompany.proyecto_algoritmo.EstructuraDatos;

public class Lista<T> {

    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamanio;

    public Lista() {
        this.cabeza = null;
        this.cola = null;
        this.tamanio = 0;
    }

    public void insertarCola(T dato) { //Insercion al final de la cola 
        if (tamanio == 0) {
            cabeza = cola = new Nodo<>(dato);
        } else {
            cola.next = new Nodo<>(dato);
            cola = cola.next;
        }
        tamanio++;
    }

    public void insertarCabeza(T dato) { //Insercion del elemento en la cabeza
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.next = cabeza;
        cabeza = nuevoNodo;

        if (tamanio == 0) { // Verifica si la lista estaba vacía Si estaba vacía, cola también apunta al nuevo nodo
            cola = nuevoNodo;
        }

        tamanio++;
    }

    public T get(int indice) { //Recuperacion del elemento
        if (indice < 0 || indice >= tamanio) {
            throw new IndexOutOfBoundsException("Indice fuera del los limites");
        }

        Nodo<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.next;
        }
        return actual.dato;
    }

    public void eliminarCabeza() { // Eliminacion del nodo principal

        if (cabeza == null) { // Comprueba que la lista no esté vacía para evitar NullPointerException
            return;
        }
        cabeza = cabeza.next;
        if (cabeza == null) {
            cola = null;
        }
        tamanio--;
    }

    public void eliminarIndice(int indice) { //Elmininacion de un nodo por indice
        if (indice < 0 || indice >= tamanio) {
            throw new IndexOutOfBoundsException("Indice fuera del los limites");
        }

        if (indice == 0) {
            eliminarCabeza();
            return;
        }
        Nodo<T> actual = cabeza;
        for (int i = 0; i < indice - 1; i++) {
            actual = actual.next;
        }

        if (actual.next == cola) { // Verifica si el nodo a eliminar es la cola
            cola = actual;
        }
        actual.next = actual.next.next;
        tamanio--;
    }
    public int tamanio(){
        return tamanio;
    }
    

    public void mostrar() {
        Nodo<T> actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}
