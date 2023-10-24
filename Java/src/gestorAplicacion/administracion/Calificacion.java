package gestorAplicacion.administracion;

import java.io.Serializable;
import java.util.ArrayList;


public class Calificacion implements Serializable {
    public static ArrayList<Calificacion> calificaciones = new ArrayList<>();
    private int idFactura;
    private Empleado empleado;
    private float calificacion;

    public Calificacion() {
        // Constructor sin argumentos necesario para deserialización
    }

    public Calificacion(int idFactura, Empleado empleado, float calificacion) {
        this.idFactura = idFactura;
        this.empleado = empleado;
        this.calificacion = calificacion;
    }

    //Getters y Setters
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;

    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.empleado = idEmpleado;
    }


    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado:").append(this.getEmpleado().getNombre()).append("\n");
        sb.append("Calificación: ").append(this.calificacion).append("\n");
        return sb.toString();
    }
}






