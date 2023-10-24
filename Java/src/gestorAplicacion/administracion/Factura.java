package gestorAplicacion.administracion;

import gestorAplicacion.restaurante.Comida;
import gestorAplicacion.restaurante.Gaseosas;
import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;

import java.io.Serializable;
import java.util.ArrayList;

public class Factura implements Serializable {

    public static ArrayList<Factura> facturas = new ArrayList<>();
    private Empleado empleado;
    private Mesas mesa;
    private Pedido pedido;
    private int idFactura;

    private String fecha;

    private Calificacion calificacionFinal;

    public Factura(Empleado empleado, Mesas mesa, Pedido pedido, int idFactura, String fecha) {
        this.empleado = empleado;
        this.mesa = mesa;
        this.idFactura = idFactura;
        this.pedido = pedido;
        this.fecha = fecha;

    }

    public Factura(Empleado empleado, Mesas mesa, Pedido pedido, int idFactura, double calificacionServicio, String fecha) {
        this.empleado = empleado;
        this.mesa = mesa;
        this.pedido = pedido;
        this.idFactura = idFactura;
        this.fecha = fecha;

        Calificacion calficacionFinal = new Calificacion(this.idFactura, this.empleado, calificacionServicio);
        empleado.calificaciones.add(calficacionFinal);
        // En este constructor se asignan las características del momento después a que el cliente comió

        //En este constructor se asignan las características del momento después a que el cliente comió

    }

    public void getFactura() {

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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("fecha: ").append(getFecha()).append("\n");
        sb.append("  Id factura:  ").append(getIdFactura()).append("\n");
        sb.append("  te atendio: ").append(this.getEmpleado()).append("\n");
        sb.append("  estuviste en la Mesa: ").append(mesa.getIdMesa()).append("\n");
        sb.append("  el valor a pagar es: ").append(this.precioTotal()).append("\n");
        sb.append("\n");

        return sb.toString();
    }

}



