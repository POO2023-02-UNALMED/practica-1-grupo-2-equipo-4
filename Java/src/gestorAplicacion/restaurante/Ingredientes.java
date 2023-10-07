package gestorAplicacion.restaurante;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ingredientes implements Serializable {
    public String nombreIngrediente;
    public int precio;
    public int cantidad;
    public boolean disponibilidadInventario;
    public ArrayList<String> listaIngredientes;
    public Ingredientes () {
    }

    public int getCantidad() {
        return cantidad;
    }



}
