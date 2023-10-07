package gestorAplicacion.administracion;

import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;

import java.io.Serializable;

public class Factura implements Serializable {
    public int idEmpleado;
    public Mesas mesa;
    public Pedido pedido;
    public int fecha;
    public int idFactura;

    public Factura(int idEmpleado, Mesas mesa, Pedido tomarPedido, int idFactura) {
    	this.idEmpleado = idEmpleado;
    	this.mesa = mesa;
    	this.pedido = tomarPedido;
    	this.idFactura = idFactura;
    }
    
}
