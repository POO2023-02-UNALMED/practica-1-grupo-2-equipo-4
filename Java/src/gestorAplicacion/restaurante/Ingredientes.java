package gestorAplicacion.restaurante;

import gestorAplicacion.administracion.Contabilidad;

import java.io.Serializable;
import java.util.ArrayList;

public class Ingredientes implements Serializable {
    public static ArrayList<Ingredientes> listaIngredientes;
    public String nombreIngrediente;
    public float precio;
    public int cantidad;
    public boolean disponibilidad;
    public Ingredientes (String nombreIngrediente, float precio, int cantidad) {
        this.nombreIngrediente = nombreIngrediente;
        this.precio = precio;
        this.cantidad = cantidad;
        this.disponibilidad = false;// La disponibilidad se inicia como false
        listaIngredientes.add(this);
        this.conocerDisponibilidad();// Se usa el método conocer disponibilidad para saber si hay ingredientes disponibles y cambiar la disponibilidad
    }
    public void conocerDisponibilidad (){ //Método que dependiendo de la cantidad de ingredientes dice si hay disponibilidad o no
        if (this.cantidad >= 1){
            this.disponibilidad = true;
        }
        else {
            this.disponibilidad = false;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad (int cantidad){
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad){
        this.disponibilidad = disponibilidad;
    }

    public void comprarIngredientes (int cantidad){ //Método para comprar ingredientes
        this.cantidad += cantidad; // se agregan los ingredientes comprados
        Contabilidad.agregarGasto(cantidad * this.precio); // se suma a los gastos la cantidad comprada por el precio del ingrediente

    }
}
