package gestorAplicacion.administracion;

import java.io.Serializable;
import java.util.ArrayList;

public class Empleado implements Serializable {
    private String nombre;
    public java.util.ArrayList<Calificacion> calificaciones;
    private int idEmpleado;
    private float salario;
    private Calificacion calificacion;
    private static int cantidadEmpleados = 0;


    public Empleado(String nombre, int idEmpleado, float salario, Calificacion calificacion) {
        cantidadEmpleados++;
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.calificacion = calificacion;
        /** En este constructor se asignan las características de cada empleado y se agrega cada empleado creado a una lista estática*/

    }


    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }
    
    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String Nombre) {
    	this.nombre = nombre;
    }
    
    public int getIdEmpleado() {
    	return idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
    	this.idEmpleado = idEmpleado;
    }
    
    public float getSalario() {
    	return salario;
    }
    
    public void setSalario(float salario) {
    	this.salario = salario;
    }
    
    public Calificacion getCalificacion() {
    	return calificacion;
    }
    
    public void setCalificacion(Calificacion calificacion) {
    	this.calificacion = calificacion;
    }
}


