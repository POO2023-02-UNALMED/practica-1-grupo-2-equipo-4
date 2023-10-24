package gestorAplicacion.administracion;

import gestorAplicacion.restaurante.Comida;
import gestorAplicacion.restaurante.Gaseosas;
import gestorAplicacion.restaurante.Pedido;

import java.util.ArrayList;

public class Cocinero extends Empleado {
    private String especialidad;
    private static final String ocupacion = "Cocinero";

    public Cocinero(String nombre, float salario, String especialidad) {
        super(nombre, salario);
        this.especialidad = especialidad;
    }
    @Override
    public String accion() {// Ligadura Dinamica
        return "El Cocinero " + this.getNombre() + " esta cocinando.";
    }
    @Override
    public String getOcupacion() {
        return "Cocinero";
    }

    public void prepararPlato(Pedido pedido) {
        System.out.println("El cocinero " + this.getNombre() + " ha terminado de preparar el pedido de" + pedido.getIdPedido());
    }

    // Getters y setters para especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
