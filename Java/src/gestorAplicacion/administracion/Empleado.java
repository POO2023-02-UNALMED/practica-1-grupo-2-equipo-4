package gestorAplicacion.administracion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleado implements Serializable {
    public static ArrayList<Empleado> empleados = new ArrayList<>();
    private String nombre;
    private static int idEmpleado = 00100;
    private float salario;
    private static int cantidadEmpleados = 0;

    public Empleado() { // Constructor sin argumentos necesario para deserialización
    }
    public Empleado(String nombre, float salario) {
        cantidadEmpleados++;
        this.nombre = nombre;
        idEmpleado++;
        this.salario = salario;
        this.empleados.add(this);
        /** En este constructor se asignan las características de cada empleado y se agrega cada empleado creado a una lista estática*/
    }
    public abstract String getOcupacion();
    public String accion() { // Ligadura Dinamica
        return "El Empleado esta Trabajando";
    }

    // Calcular el promedio de las calificaciones y determinar si califica para el bono

    public boolean bono() {

        List<Float> calificacionesEmpleado = new ArrayList<>();
        float suma = 0;
        boolean tieneBono;
        for (Calificacion calificacion : Calificacion.calificaciones) {
            if(calificacion.getEmpleado() == this){
                calificacionesEmpleado.add(calificacion.getCalificacion());
            }
        }
        for (float califica : calificacionesEmpleado) {
            suma += califica;
        }
        float promedio = suma / calificacionesEmpleado.size();

        if(promedio >= 4.5f){
            tieneBono = true;
        }
        else{
            tieneBono = false;
        }

        return tieneBono;
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

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("El empleado: ").append(this.getNombre()).append("\n");
        sb.append("Tiene el id: ").append(this.getIdEmpleado()).append("\n");
        sb.append("Gana un salario de: ").append(this.getSalario()).append("\n");
        if (this.bono() == true){
            sb.append("El empleado tiene bono").append("\n");
        }
        else {
            sb.append("El empleado no tiene bono").append("\n");
        }
        return sb.toString();
    }
}
