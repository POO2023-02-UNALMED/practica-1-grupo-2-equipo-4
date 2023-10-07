package gestorAplicacion.administracion;

import gestorAplicacion.restaurante.Pedido;

public class Factura {
    public int idEmpleado;
    public int idMesa;
    public Pedido tomarPedido;
    public int fecha;
    public int idFactura;

    public Factura(int idEmpleado, idMesa, Pedido tomarPedido, int fecha, idFactura) {
    	this.idEmpleado = idEmpleado;
    	this.idMesa = idMesa;
    	this.Pedido = tomarPedido;
    	this.fecha = fecha;
    	this.idFactura = idFactura;
    }
    
}
