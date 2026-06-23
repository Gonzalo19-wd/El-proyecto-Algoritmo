package com.mycompany.proyecto_algoritmo;

public class Revista extends ActivoDigital implements Iprestable{
    String Editorial;
    int numero;
    boolean disponible; 

    public Revista(String idActivo, String titulo, String autor, String fecha, String Editorial, int numero) {
        super(idActivo, titulo, autor, fecha);
        this.Editorial = Editorial;
        this.numero = numero;
        this.disponible = true;
    }

    @Override
    String mostrarDetalle() {
        StringBuilder sbMensaje = 
            new StringBuilder("----------------------------\nDATOS DE LA REVISTA\n----------------------------");

        sbMensaje.append("\nID Activo: ").append(idActivo);
        sbMensaje.append("\nTitulo: ").append(titulo);
        sbMensaje.append("\nAutor: ").append(autor);
        sbMensaje.append("\nFecha: ").append(fecha);
        sbMensaje.append("\nEditorial: ").append(Editorial);
        sbMensaje.append("\nNumero: ").append(numero);

        return sbMensaje.toString();
    }
    @Override
    public void Prestar(String codigoUser, String idActivo) {
        if(disponible){
            disponible = false;
            
            System.out.println("----------------------------");
            System.out.println("PRESTAMO REALIZADO");
            System.out.println("----------------------------");
            System.out.println("Usuario: " + codigoUser);
            System.out.println("Revista: " + titulo);
        }else{
            System.out.println("La revista ya esta prestado");
        }
    }

    @Override
    public void Devolver(String codigoUser, String idActivo) {
        if(!disponible){
            disponible = true;
            
            System.out.println("----------------------------");
            System.out.println("DEVOLUCION REALIZADA");
            System.out.println("----------------------------");
            System.out.println("Usuario: " + codigoUser);
            System.out.println("Revista: " + titulo);
        }else { 
            System.out.println("La revista se devolvio correctamente");
        }
    }
    
    public boolean isDisponible(){
        return disponible;
    }
    
}