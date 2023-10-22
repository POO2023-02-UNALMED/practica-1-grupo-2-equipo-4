package gestorAplicacion.administracion;

import java.io.Serializable;


public class Calificacion implements Serializable{
    private int idFactura;
    private Empleado empleado;
    private int calificacion;
public Calificacion() {
        // Constructor sin argumentos necesario para deserialización
    }
    
    public Calificacion(int idFactura, Empleado empleado, int calificacion) {
    	this.idFactura = idFactura;
    	this.empleado = empleado;
    	this.calificacion = calificacion;
    }
    
    public void setIdFactura(int idFactura){
    	this.idFactura = idFactura;
    }
    
    public void setIdEmpleado(Empleado idEmpleado){
    	this.empleado = idEmpleado;
    }
    
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public int getIdFactura() {
    	return idFactura;
    }
    
    public Empleado getIdEmpleado() {
    	return empleado;
    }
    
    public int getCalificacion() {
    	return calificacion;
    }
}





