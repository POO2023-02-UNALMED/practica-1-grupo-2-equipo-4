package gestorAplicacion.administracion;

import gestorAplicacion.administracion.Calificacion;
import gestorAplicacion.administracion.Empleado;
import gestorAplicacion.restaurante.Pedido;

public class Repartidor extends Empleado {
    private String vehiculo;
    public Pedido pedido;
    public boolean estadoPedido = false;

    public void entregarPedido() {
        this.estadoPedido = true;
    }

    public Repartidor(String nombre, int idEmpleado, float salario, String vehiculo) {
        super(nombre, idEmpleado, salario);
        this.vehiculo = vehiculo;
    }

    public void realizarEntrega() {
        if (this.vehiculo == null || this.vehiculo.isEmpty()) {
            System.out.println("No se puede realizar la entrega porque el repartidor no tiene un vehículo asignado.");
            return;
        }

        // código para realizar la entrega
        System.out.println("Entrega realizada por el repartidor " + this.getNombre() + " utilizando el vehículo " + this.vehiculo);
    }

    // Getters y setters para vehiculo
    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
}