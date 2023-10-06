package gestorAplicacion.administracion;

public class Empleado {
    private String nombre;
    public int idEmpleado;
    private float salario;
    private Calificacion calificacion;
    private int cantidadEmpleados;

    public Empleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }
}
}
