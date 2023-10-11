package gestorAplicacion.restaurante;


import gestorAplicacion.administracion.Contabilidad;
import java.io.Serializable;
import java.util.*;
import java.util.Arrays;

public abstract class Inventario {

    public static ArrayList<Inventario> listaInventario  = new ArrayList<>();
    protected String nombre;
    protected float precio;
    protected int cantidad;
    protected boolean disponibilidad;

    protected Inventario(String nombre, float precio, int cantidad){

        this.nombre=nombre;
        this.precio = precio;
        this.cantidad= cantidad;
        listaInventario.add(this); // Lista de gaseosas + ingredientes
    }

    public abstract void comprar(int cantidad, Inventario elemento);
    public void disponibilidadInventario(){ //el void hay que cambiarlo por boolean, lo puse así pa que compile xd
       // Se debe desarrollar al tiempo que pedido
    }
    public String toString() {
        return "Nombre: " + nombre + " Precio: " + precio + " Cantidad: " + cantidad + " Disponibilidad: " + disponibilidad;
    }


}
