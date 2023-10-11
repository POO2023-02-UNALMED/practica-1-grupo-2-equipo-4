package gestorAplicacion.administracion;

import java.io.Serializable;
import java.util.ArrayList;

public class Empleado implements Serializable {
    private String nombre;
    public java.util.ArrayList<Calificacion> calificaciones;
    public int idEmpleado;
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
}

