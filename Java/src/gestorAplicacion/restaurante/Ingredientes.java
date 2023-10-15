package gestorAplicacion.restaurante;


import gestorAplicacion.administracion.Contabilidad;
import java.io.Serializable;
import java.util.ArrayList;

public class Ingredientes extends Inventario implements Serializable {

    public static ArrayList<Ingredientes> listaIngredientes = new ArrayList<>();

    public Ingredientes(String nombre, float precio, int cantidad) {
        super(nombre,precio,cantidad);
        listaIngredientes.add(this);

    }
    public void comprar(int cantidad, Inventario ingrediente) { //Método para comprar ingredientes
        // se agrega la cantidad de ingrediente comprada
        for (Ingredientes i : listaIngredientes) {
            if (i.equals(ingrediente)) {
                ingrediente.cantidad = ingrediente.cantidad + cantidad;
                Contabilidad.saldo = Contabilidad.saldo - ingrediente.precio * cantidad; //resta del saldo de la tienda el precio*cantidad de ingredientes
            }
        }
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + " Precio: " + precio + " Cantidad: " + cantidad + " Disponibilidad: " + disponibilidad;

    }
}
