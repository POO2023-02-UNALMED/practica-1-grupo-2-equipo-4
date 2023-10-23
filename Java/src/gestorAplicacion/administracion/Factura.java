package gestorAplicacion.administracion;

import gestorAplicacion.restaurante.Comida;
import gestorAplicacion.restaurante.Gaseosas;
import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;

import java.io.Serializable;

public class Factura implements Serializable {
    private Empleado empleado;
    private Mesas mesa;
    private Pedido pedido;
    private int idFactura;
    private Calificacion calificacionFinal;


    public Factura(Empleado empleado, Mesas mesa, Pedido pedido, int idFactura) {
        this.empleado = empleado;
        this.mesa = mesa;
        this.pedido = pedido;
        this.idFactura = idFactura;

    }
    public Factura(Empleado empleado, Mesas mesa, Pedido pedido, int idFactura, double calificacionServicio) {
        this.empleado = empleado;
        this.mesa = mesa;
        this.pedido = pedido;
        this.idFactura = idFactura;

        Calificacion calficacionFinal = new Calificacion(this.idFactura, this.empleado, calificacionServicio);
        empleado.calificaciones.add(calficacionFinal);
        // En este constructor se asignan las características del momento después a que el cliente comió

        //En este constructor se asignan las características del momento después a que el cliente comió

    }

    public float precioTotal() {//calcula el precio total sumando las comidas y las gaseosas con los métodos

        float suma = 0;

        for (Comida comida : this.pedido.getPedidoComidas()) {
            suma += comida.calcularPrecio();
        }

        for (Gaseosas gaseosa : this.pedido.getPedidoGaseosas()) {
            suma += gaseosa.getPrecio();
        }

        return suma;
    }

    public Factura() { //Constructor sin argumentos necesario para deserialización
    }


    public void calificarEmpleado(int calificacion) { //Método que cambia el atributo int calificación de la clase Calificacón que ya se añadio al empleado
        this.calificacionFinal.setCalificacion(calificacion);
    }

    //Getter y setters
    public Empleado getIdEmpleado() {
        return empleado;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public Calificacion getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(Calificacion calificacionFinal) {
        this.calificacionFinal = calificacionFinal;

    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}



