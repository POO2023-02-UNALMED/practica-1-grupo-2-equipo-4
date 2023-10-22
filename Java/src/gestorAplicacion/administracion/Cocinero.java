package gestorAplicacion.administracion;

public class Cocinero extends Empleado {
    private String especialidad;

    public Cocinero(String nombre, int idEmpleado, float salario, Calificacion calificacion, String especialidad) {
        super(nombre, idEmpleado, salario, calificacion);
        this.especialidad = especialidad;
    }

    public void prepararPlato() {
        // Método para preparar un plato
    }

    // Getters y setters para especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
