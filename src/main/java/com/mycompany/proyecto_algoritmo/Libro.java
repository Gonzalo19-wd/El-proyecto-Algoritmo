package com.mycompany.proyecto_algoritmo;

public class Libro extends ActivoDigital implements Iprestable {

    int npaginas;
    String ISBN;
    boolean disponible; 

    public Libro(String idActivo, String ISBN, String titulo, String autor, String fecha, int npaginas) {
        super(idActivo, titulo, autor, fecha);
        this.npaginas = npaginas;
        this.ISBN = ISBN;
        this.disponible = true;
    }

    @Override
    String mostrarDetalle() {
        StringBuilder sbMensaje
                = new StringBuilder("----------------------------\nDATOS DEL LIBRO\n----------------------------");

        sbMensaje.append("\nID Activo: ").append(idActivo);
        sbMensaje.append("\nISBN: ").append(ISBN);
        sbMensaje.append("\nTitulo: ").append(titulo);
        sbMensaje.append("\nAutor: ").append(autor);
        sbMensaje.append("\nFecha: ").append(fecha);
        sbMensaje.append("\nNumero de paginas: ").append(npaginas);

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
            System.out.println("Libro: " + titulo);
        }else{
            System.out.println("El libro ya esta prestado");
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
            System.out.println("Libro: " + titulo);
        }else { 
            System.out.println("El libro se devolvio correctamente");
        }
    }
    
    public boolean isDisponible(){
        return disponible;
    }

}
