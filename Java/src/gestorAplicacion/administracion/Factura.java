package gestorAplicacion.administracion;

import gestorAplicacion.restaurante.Comida;
import gestorAplicacion.restaurante.Gaseosas;
import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;

import java.io.Serializable;
import java.util.ArrayList;

public class Factura implements Serializable {

    public static ArrayList<Factura> facturasSinPagar = new ArrayList<>();
    public static ArrayList<Factura> facturasPagadas = new ArrayList<>();
    private Empleado empleado;
    private Mesas mesa;
    private Pedido pedido;
    private int idFactura;

    private String fecha;
    private boolean facturaPagada; //false es no pagada

    private float precioTotal;

    private float precioTotalSinGanancia;

    private Calificacion calificacionFinal;

    public Factura(Empleado empleado, Mesas mesa, Pedido pedido, int idFactura, String fecha, float precioTotal, float precioTotalSinGanancia) {
        this.empleado = empleado;
        this.mesa = mesa;
        this.idFactura = idFactura;
        this.facturaPagada = false;
        this.pedido = pedido;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
        this.precioTotalSinGanancia = precioTotalSinGanancia;


    }

    public Factura(Empleado empleado, Mesas mesa, Pedido pedido, int idFactura, double calificacionServicio, String fecha, float precioTotal,float precioTotalSinGanancia) {
        this.empleado = empleado;
        this.mesa = mesa;
        this.pedido = pedido;
        this.idFactura = idFactura;
        this.facturaPagada = false;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
        this.precioTotalSinGanancia = precioTotalSinGanancia;

        Calificacion calficacionFinal = new Calificacion(this.idFactura, this.empleado, calificacionServicio);
        empleado.calificaciones.add(calficacionFinal);
        // En este constructor se asignan las características del momento después a que el cliente comió

        //En este constructor se asignan las características del momento después a que el cliente comió

    }

    public Factura() { //Constructor sin argumentos necesario para deserialización
    }


    public void pagarFactura() {
        this.facturaPagada = true;
        this.precioTotal = pedido.precioTotal();
        Factura.facturasPagadas.add(this);
        Factura.facturasSinPagar.remove(this);
        Contabilidad.sumarIngresosPedidoAlSaldo(this.getPrecioTotal());
        Contabilidad.calcularUtilidades(this.getPrecioTotal(), this.getPrecioTotalSinGanancia());
        Mesas.cancelarReserva(getIdFactura(), getFecha());

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

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public float getPrecioTotalSinGanancia() {
        return precioTotalSinGanancia;
    }

    public void setPrecioTotalSinGanancia(float precioTotalSinGanancia) {
        this.precioTotalSinGanancia = precioTotalSinGanancia;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  Id factura:  ").append(getIdFactura()).append("\n");
        sb.append("fecha: ").append(getFecha()).append("\n");
        if (facturaPagada == true) {
            sb.append("  La factura está pagada").append("\n");
        } else {
            sb.append("  La factura no está pagada").append("\n");
        }
        sb.append("  tu pedido fue: \n").append(pedido.imprimirComidas()).append("\n");
        sb.append(pedido.imprimirGaseosas()).append("\n");
        sb.append("  te atendio: ").append(this.getEmpleado()).append("\n");
        sb.append("  estuviste en la Mesa: ").append(mesa.getIdMesa()).append("\n");
        sb.append("  el valor a pagar es: ").append(pedido.precioTotal()).append("\n");
        sb.append("\n");

        return sb.toString();
    }

}



