package gestorAplicacion.administracion;

import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;

import java.io.Serializable;

public class Factura implements Serializable {
    private int idEmpleado;
    private Mesas mesa;
    private Pedido pedido;
    private int fecha;
    private int idFactura;

    public Factura(int idEmpleado, Mesas mesa, Pedido tomarPedido, int idFactura) {
    	this.idEmpleado = idEmpleado;
    	this.mesa = mesa;
    	this.pedido = tomarPedido;
    	this.idFactura = idFactura;
        /** En este constructor se asignan las características del momento después a que el cliente comió */
    }
    public Factura(){ //Constructor sin argumentos necesario para deserialización
    }
    public int getIdEmpleado() {
    	return idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
    	this.idEmpleado = idEmpleado;
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
    
    public int getFecha() {
    	return fecha;
    }
    
    public void setFecha(int fecha) {
    	this.fecha = fecha;
    }
}
