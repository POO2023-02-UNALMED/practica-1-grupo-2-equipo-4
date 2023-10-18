package gestorAplicacion.restaurante;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Serializable {

    private int IdPedido;
    private Mesas mesa;
    private List<Comida> pedidoComidas;
    private List<Gaseosas> pedidoGaseosas;



    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int idPedido) {
        IdPedido = idPedido;
    }

    public Mesas getMesa() {

    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public ArrayList getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList pedido) {
        this.pedido = pedido;
    }
}

