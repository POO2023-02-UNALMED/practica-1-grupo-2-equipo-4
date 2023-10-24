package gestorAplicacion.administracion;
import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.restaurante.Mesas;

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
    @Override
    public void accion() {// Ligadura Dinamica
        System.out.println("El Mesero " + this.getNombre() + "está atendiendo a las mesas.");
    }
    public String toString (){
        StringBuilder cadena = new StringBuilder();
        cadena.append("EL mesero es el encargado de las mesas: ");
        for (Mesas mesa: this.mesasDeTrabajo){
            cadena.append(mesa.getIdMesa());
            cadena.append(", ");
        }
        return cadena.toString();
    }
    // Getters y setters
}