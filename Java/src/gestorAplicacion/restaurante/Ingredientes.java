package gestorAplicacion.restaurante;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ingredientes {
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
