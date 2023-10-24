package gestorAplicacion.restaurante;

import gestorAplicacion.administracion.Empleado;
import gestorAplicacion.administracion.Factura;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Pedido implements Serializable {
    private static int idPedido = 10000000;
    private Mesas mesa;
    private Empleado empleado;
    private List<Comida> pedidoComidas;
    private List<Gaseosas> pedidoGaseosas;
    private String fecha;
    private int idCliente;

    public Pedido( Mesas mesa, String fecha, int idCliente, Empleado empleado) { // crea un pedido que a la vez efectua la reserva asociada a la fecha y al id del cliente
        idPedido++ ;
        this.mesa = mesa;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.pedidoComidas = new ArrayList<>();
        this.pedidoGaseosas = new ArrayList<>();
        this.empleado = empleado;
        Mesas.efectuarReserva(idCliente, fecha);
    }

    public Pedido( Mesas mesa, String fecha, Empleado empleado) { // crea un pedido que a la vez crea una reserva en esa mesa para que no se vea disponible
        idPedido++ ;
        this.mesa = mesa;
        this.fecha = fecha;
        this.pedidoComidas = new ArrayList<>();
        this.pedidoGaseosas = new ArrayList<>();
        this.empleado = empleado;
        Mesas.crearReserva(getIdPedido(), mesa.getIdMesa(), fecha);
    }
    public void agregarComidaAlPedido(Comida... comidas) { //agrega comidas al pedido
        pedidoComidas.addAll(Arrays.asList(comidas));

    }
    public void agregarGaseosaAlPedido(Gaseosas... gaseosas) { //agrega gaseosas al pedido
        pedidoGaseosas.addAll(Arrays.asList(gaseosas));

    }
    public String confirmarOrden() {
        System.out.println("confirmarOrden called for Pedido " + this.getIdPedido());
        StringBuilder insufficientItems = new StringBuilder();
        String ordenConfirmada = null;


        for (Comida comida : pedidoComidas) {
            if (!comida.verificarIngredientes()) {
                insufficientItems.append("No hay suficientes ingredientes para preparar " + comida.getNombre() + "\n");
            } else {
                comida.restarCantidad();
            }
        }

        for (Gaseosas gaseosa : pedidoGaseosas) {
            if (gaseosa.getCantidad() < 1) {
                insufficientItems.append("No hay suficientes " + gaseosa.getNombre() + "\n");
            } else {
                gaseosa.restarGaseosas(1, gaseosa);
            }
        }
        if (insufficientItems.length() > 0) {
            return insufficientItems.toString();
        }
        ordenConfirmada = "Orden confirmada y factura creada";
        if(ordenConfirmada.equals("Orden confirmada y factura creada")){
        Factura factura = new Factura(this.getEmpleado(),this.getMesa(),this,this.getIdPedido(),this.fecha, this.precioTotal(),this.precioTotalSinGanancia());
        Factura.facturasSinPagar.add(factura);}
        return ordenConfirmada;
    }

    public float precioTotal() {//calcula el precio total sumando las comidas y las gaseosas con los métodos

        float suma = 0;

        for (Comida comida : pedidoComidas) {
            suma += comida.calcularPrecioConGanancia();
        }

        for (Gaseosas gaseosa : pedidoGaseosas) {
            suma += gaseosa.getPrecioConGanancia();
        }

        return suma;
    }
    public float precioTotalSinGanancia(){
        float suma = 0;

        for (Comida comida : pedidoComidas) {
            suma += comida.calcularPrecio();
        }

        for (Gaseosas gaseosa : pedidoGaseosas) {
            suma += gaseosa.getPrecio();
        }

        return suma;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public List<Comida> getPedidoComidas() {
        return pedidoComidas;
    }

    public List<Gaseosas> getPedidoGaseosas() {
        return pedidoGaseosas;
    }
    public String imprimirComidas() {
        StringBuilder sb = new StringBuilder();
        for (Comida comida : pedidoComidas) {
            sb.append("Su pedido es: " + comida.getNombre() + " su precio es: " + comida.calcularPrecio());
        }
        return sb.toString();
    }
    public String imprimirGaseosas() {
        StringBuilder sb = new StringBuilder();
        for (Gaseosas gaseosas : pedidoGaseosas) {
            sb.append("Su pedido es: " + gaseosas.getNombre() + " su precio es: " + gaseosas.getPrecio());
        }
        return sb.toString();
    }
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }



}

