package gestorAplicacion.administracion;

import java.io.Serializable;
import java.util.ArrayList;

public class Empleado implements Serializable {
    private String nombre;
    public java.util.ArrayList<Calificacion> calificaciones = new ArrayList<>();
    private int idEmpleado;
    private float salario;
    private static int cantidadEmpleados = 0;
    public java.util.ArrayList<Empleado> empleados = new ArrayList<>();

    public Empleado(String nombre, int idEmpleado, float salario) {
        cantidadEmpleados++;
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        empleados.add(this);
        /** En este constructor se asignan las características de cada empleado y se agrega cada empleado creado a una lista estática*/
    }

    // Calcular el promedio de las calificaciones y determinar si califica para el bono
    public boolean BONO() {

        double suma = 0.0;
        for (Calificacion calificacion : calificaciones) {
            suma += calificacion.getCalificacion();
        }

        double promedio = suma / calificaciones.size();

        if (promedio >= 4.5) { // Si el promedio es mayor a 4.5 aplica para el bono
            return true;
        } else {
            return false;
        }
    }

    public Empleado() { // Constructor sin argumentos necesario para deserialización
    }

    //Getter y Setters
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
}
