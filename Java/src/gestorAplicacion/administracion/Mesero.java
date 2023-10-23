package gestorAplicacion.administracion;
import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;

public class Mesero extends Empleado implements Serializable {
    private String vehiculo;
    public Pedido pedido;
    public boolean estadoPedido = false;
    public ArrayList<Mesas> mesasDeTrabajo = new ArrayList<>();
    public void entregarPedido() {
        this.estadoPedido = true;
    }
    public Mesero(String nombre, int idEmpleado, float salario) {
        super(nombre, idEmpleado, salario);
        this.vehiculo = vehiculo;
    }
    public void agregarMesas (Mesas mesa){
        this.mesasDeTrabajo.add(mesa);
    }
    public void quitarMesas (Mesas quitar){
        this.mesasDeTrabajo.removeIf(mesa -> mesa.equals(quitar));
    }
    // Getters y setters
}