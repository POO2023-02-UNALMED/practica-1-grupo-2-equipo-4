import java.io.Serializable;
package gestorAplicacion.administracion;

public class Calificacion {
    private int idFactura;
    private int idEmpleado;
    private int calificacion;

    
    public Calificacion(int idFactura, int idEmpleado, int calificacion) {
    	this.idFactura = idFactura;
    	this.idEmpleado = idEmpleado;
    	this.calificacion = calificacion;
    }
    
    public void setIdFactura(int idFactura){
    	this.idFactura = idFactura;
    }
    
    public void setIdEmpleado(int idEmpleado){
    	this.idEmpleado = idEmpleado;
    }
    
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public int getIdFactura() {
    	return idFactura;
    }
    
    public int getIdEmpleado() {
    	return idEmpleado;
    }
    
    public int getCalificacion() {
    	return calificacion;
    }
}





