package com.mycompany.proyecto_algoritmo.EstructuraDatos;

public class ListaCirc<T> {
    private Nodo<T> cabeza;
    private Nodo<T> actual;
    private int tamanio;

    private static class Nodo<T> {

        T dato;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public ListaCirc() {
        cabeza = null;
        actual = null;
        tamanio = 0;
    }

    // Insertar al final
    public void insertar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza; // circular
        } else {
            Nodo<T> temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
        tamanio++;
    }

    // Mostrar todos los elementos una vuelta
    public void mostrarUnaVuelta() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo<T> temp = cabeza;
        do {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        } while (temp != cabeza);
        System.out.println("(regreso al inicio)");
    }

    // Obtener siguiente material (para recorrer uno por uno)
    public T siguiente() {
        if (actual == null) {
            actual = cabeza;
        } else {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    public int tamanio() {
        return tamanio;
    }
    
}
