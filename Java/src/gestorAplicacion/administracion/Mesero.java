package gestorAplicacion.administracion;
import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;

public class Mesero extends Empleado implements Serializable {
    public ArrayList<Mesas> mesasDeTrabajo = new ArrayList<>();
    public Mesero(String nombre, int idEmpleado, float salario) {
        super(nombre, idEmpleado, salario);
    }
    public void agregarMesas (Mesas mesa){
        this.mesasDeTrabajo.add(mesa);
    }
    public void quitarMesas (Mesas quitar){
        this.mesasDeTrabajo.removeIf(mesa -> mesa.equals(quitar));
    }
    // Getters y setters
}