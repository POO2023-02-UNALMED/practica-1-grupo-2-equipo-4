package gestorAplicacion.restaurante;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
public class Pedido implements Serializable {

    private int IdPedido;
    private int
    private Mesas mesa;
    private ArrayList<Comida> pedidoComidas;
    private ArrayList<Gaseosas> pedidoGaseosas;
    private boolean tieneReserva;
    private String fecha;
    public Pedido(int IdPedido,Mesas mesa,ArrayList<Comida> pedidoComidas,ArrayList<Gaseosas> pedidoGaseosas,boolean tieneReserva){
        this.IdPedido = IdPedido;
        this.mesa = mesa;
        this.pedidoComidas = pedidoComidas;
        this.pedidoGaseosas = pedidoGaseosas;
        this.tieneReserva = tieneReserva;
        if(tieneReserva){
            Mesas.efectuarReserva(this.mesa.getIdCliente(),this.mesa.getIdMesa(),this.mesa.getFechaReserva());
            System.out.println("Su reserva fue efectuada correctamente");

        }
        else {
            Mesas.crearReserva()
        }
    }



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

