package gestorAplicacion.restaurante;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Pedido implements Serializable {

    private int idPedido;
    private Mesas mesa;
    private Menu menu;
    private List<Comida> pedidoComidas;
    private List<Gaseosas> pedidoGaseosas;
    private String fecha;
    private int idCliente;
    private Boolean reserva;

    public Pedido(int idPedido, Mesas mesa, String fecha, int idCliente) { // crea un pedido que a la vez efectua la reserva asociada a la fecha y al id del cliente
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.pedidoComidas = new ArrayList<>();
        this.pedidoGaseosas = new ArrayList<>();
        mesa.efectuarReserva(idCliente, mesa.getIdMesa(), fecha);
    }

    public Pedido(int IdPedido, Mesas mesa, String fecha) { // crea un pedido que a la vez crea una reserva en esa mesa para que no se vea disponible
        this.idPedido = IdPedido;
        this.mesa = mesa;
        this.fecha = fecha;
        this.pedidoComidas = new ArrayList<>();
        this.pedidoGaseosas = new ArrayList<>();
        mesa.crearReserva(getIdPedido(), mesa.getIdMesa(), fecha);
    }


    public void agregarComidaAlPedido(Comida... comidas) { //agrega comidas al pedido
        pedidoComidas.addAll(Arrays.asList(comidas));

    }
    public void agregarGaseosaAlPedido(Gaseosas... gaseosas) { //agrega gaseosas al pedido
        pedidoGaseosas.addAll(Arrays.asList(gaseosas));

    }


    public void confirmarOrden() {
        // resta ingredientes asociados a la orden del inventario, crea una factura, calcula el total del pedido
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
}

