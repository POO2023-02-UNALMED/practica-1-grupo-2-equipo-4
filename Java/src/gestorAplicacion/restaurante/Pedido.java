package gestorAplicacion.restaurante;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
public class Pedido implements Serializable {

    private int IdPedido;
    private Mesas mesa;
    private Menu menu;
    private ArrayList<Comida> pedidoComidas;
    private ArrayList<Gaseosas> pedidoGaseosas;
    private String fecha;
    private int idCliente;
    private Boolean reserva;

    public Pedido(int idPedido, Mesas mesa, String fecha, int idCliente) { // crea un pedido que a la vez efectua la reserva asociada a la fecha y al id del cliente
        this.IdPedido = IdPedido;
        this.mesa = mesa;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.pedidoComidas = new ArrayList<>();
        this.pedidoGaseosas = new ArrayList<>();
        mesa.efectuarReserva(idCliente, mesa.getIdMesa(), fecha);
    }

    public Pedido(int IdPedido, Mesas mesa, String fecha) { // crea un pedido que a la vez crea una reserva en esa mesa para que no se vea disponible
        this.IdPedido = IdPedido;
        this.mesa = mesa;
        this.fecha = fecha;
        this.pedidoComidas = new ArrayList<>();
        this.pedidoGaseosas = new ArrayList<>();
        mesa.crearReserva(getIdPedido(), mesa.getIdMesa(), fecha);
    }

    public void agregarAlPedido(ArrayList<Comida> comidas, ArrayList<Gaseosas> gaseosas) {
        if (pedidoComidas == null) {
            pedidoComidas = new ArrayList<>();
        }
        if (pedidoGaseosas == null) {
            pedidoGaseosas = new ArrayList<>();
        }
        pedidoComidas.addAll(comidas);
        pedidoGaseosas.addAll(gaseosas);
    }
    /*public void mostrarMenuDisponible() {
        System.out.println("Menú disponible:");
        for (Comida comida : menu.getListaComidas()) {
            if (ingredientes.tieneIngredientes(comida.getIngredientes())) {
                System.out.println(comida.getNombre());
            }
        }
    }*/

    public void confirmarOrden(){
        // resta ingredientes asociados a la orden del inventario, crea una factura, calcula el total del pedido
    }

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int idPedido) {
        IdPedido = idPedido;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public ArrayList<Comida> getPedidoComidas() {
        return pedidoComidas;
    }

    public ArrayList<Gaseosas> getPedidoGaseosas() {
        return pedidoGaseosas;
    }
}

