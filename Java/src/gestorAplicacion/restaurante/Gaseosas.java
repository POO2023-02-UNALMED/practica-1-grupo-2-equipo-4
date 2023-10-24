package gestorAplicacion.restaurante;

import gestorAplicacion.administracion.Contabilidad;

import java.io.Serializable;
import java.util.ArrayList;

public class Gaseosas extends Inventario implements Serializable {
    public static ArrayList<Gaseosas> listaGaseosas = new ArrayList<>();

    public Gaseosas(String nombre, float precio, int cantidad) {
        super(nombre, precio, cantidad);
        listaGaseosas.add(this);
    }

    public Gaseosas() { //Constructor sin argumentos necesario para deserialización
    }


    public void comprar(int cantidad, Inventario gaseosa) { //Método para comprar gaseosas
        // se agrega la cantidad de la gaseosa comprada
        for (Gaseosas i : listaGaseosas) {
            if (i.equals(gaseosa)) {
                gaseosa.cantidad = gaseosa.cantidad + cantidad;
                Contabilidad.saldo = Contabilidad.saldo - gaseosa.precio * cantidad; //resta del saldo de la tienda el precio*cantidad de ingredientes
            }
        }
    }

    public void restarGaseosas(int cantidad, Gaseosas gaseosas) {
        gaseosas.setCantidad(gaseosas.getCantidad() - cantidad);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "Precio " + this.getPrecio() + " Cantidad:" + this.cantidad;
    }

    public  float getPrecioConGanancia(){
        return super.getPrecio() + super.getPrecio()*10/100;
    }
    @Override
    public float getPrecio() {
        return super.getPrecio();
    }

    @Override
    public int getCantidad() {
        return super.getCantidad();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public static ArrayList<Gaseosas> getListaGaseosas() {
        return listaGaseosas;
    }
}

