package gestorAplicacion.restaurante;
import gestorAplicacion.administracion.Contabilidad;

import java.util.ArrayList;

import java.io.Serializable;

public class Restaurante implements Serializable {
    public static ArrayList<Mesas> mesas = new ArrayList<>();
    public static Contabilidad contabilidad;
}
