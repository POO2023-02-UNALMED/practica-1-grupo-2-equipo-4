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
    private Menu menu;
    private List<Comida> pedidoComidas;
    private List<Gaseosas> pedidoGaseosas;
    private String fecha;
    private int idCliente;
    private Boolean reserva;

    public Pedido( Mesas mesa, String fecha, int idCliente, Empleado empleado) { // crea un pedido que a la vez efectua la reserva asociada a la fecha y al id del cliente
        idPedido++ ;
        this.mesa = mesa;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.pedidoComidas = new ArrayList<>();
        this.pedidoGaseosas = new ArrayList<>();
        this.empleado = empleado;
        mesa.efectuarReserva(idCliente, mesa.getIdMesa(), fecha);
    }

    public Pedido( Mesas mesa, String fecha, Empleado empleado) { // crea un pedido que a la vez crea una reserva en esa mesa para que no se vea disponible
        idPedido++ ;
        this.mesa = mesa;
        this.fecha = fecha;
        this.pedidoComidas = new ArrayList<>();
        this.pedidoGaseosas = new ArrayList<>();
        this.empleado = empleado;
        mesa.crearReserva(getIdPedido(), mesa.getIdMesa(), fecha);
    }
    public void agregarComidaAlPedido(Comida... comidas) { //agrega comidas al pedido
        pedidoComidas.addAll(Arrays.asList(comidas));

    }
    public void agregarGaseosaAlPedido(Gaseosas... gaseosas) { //agrega gaseosas al pedido
        pedidoGaseosas.addAll(Arrays.asList(gaseosas));

    }
    public String confirmarOrden() {
        StringBuilder insufficientItems = new StringBuilder();


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

        Factura factura = new Factura(this.getEmpleado(),this.getMesa(),this.getIdPedido());
        return "Orden confirmada y factura creada";
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
    public void imprimirComidas() {
        for (Comida comida : pedidoComidas) {
            System.out.println("Su pedido es:" + comida.getNombre() + " su precio es: " + comida.calcularPrecio());
        }
    }
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}

