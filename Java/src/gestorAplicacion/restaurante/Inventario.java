package gestorAplicacion.restaurante;


import gestorAplicacion.administracion.Contabilidad;

import java.io.Serializable;
import java.util.*;
import java.util.Arrays;

public abstract class Inventario {

    public static ArrayList<Inventario> listaInventario = new ArrayList<>();
    protected String nombre;
    protected float precio;
    protected int cantidad;
    protected boolean disponibilidad;

    protected Inventario() {
    }

    protected Inventario(String nombre, float precio, int cantidad) {

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        listaInventario.add(this); // Lista de gaseosas + ingredientes
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public abstract void comprar(int cantidad, Inventario elemento);


    //public boolean verificarDisponibilidad() { //el void hay que cambiarlo por boolean, lo puse así pa que compile xd
        // Se debe desarrollar al tiempo que clase pedido
    //}

    public void verificarDisponibilidad() {
    }

    public String toString() {
        return "Nombre: " + nombre + " Precio: " + precio + " Cantidad: " + cantidad ;
    }


}
