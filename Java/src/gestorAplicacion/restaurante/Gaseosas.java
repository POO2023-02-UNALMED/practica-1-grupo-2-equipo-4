package gestorAplicacion.restaurante;

import gestorAplicacion.administracion.Contabilidad;

import java.util.ArrayList;

public class Gaseosas extends Inventario{
    public static ArrayList<Gaseosas> listaGaseosas = new ArrayList<>();

    public Gaseosas(String nombre, float precio, int cantidad) {
        super(nombre,precio,cantidad);
        listaGaseosas.add(this);
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
    @Override
    public String toString() {
        return "Nombre: " + nombre + "Precio: " + precio + "Cantidad: " + cantidad + "Disponibilidad: " + disponibilidad;
    }
}
