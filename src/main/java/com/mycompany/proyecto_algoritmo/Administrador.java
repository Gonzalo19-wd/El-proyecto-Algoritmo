package com.mycompany.proyecto_algoritmo;

import java.util.Scanner;


public class Administrador {
    int[] Prestamos = new int[10];
    Scanner consola = new Scanner(System.in);
    public void Prestamo(){
        int[] prestamo = new int[5];
        int basta = 0;
        System.out.println("cuantos activos va a llevar?");
        basta = consola.nextInt();
        int opcion = 0;
        do {
            System.out.println("Elige una opcion\n");
            System.out.println("Libro(1)"
                    + "Revista(2)");
            switch (opcion) {
                case 1:
                                    
                case 2:
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (true);
    }
    
    public void Devolver(){
        
    }            
}

