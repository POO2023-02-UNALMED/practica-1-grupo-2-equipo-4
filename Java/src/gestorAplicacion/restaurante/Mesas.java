package gestorAplicacion.restaurante;
import java.util.ArrayList;
import java.io.Serializable;
public class Mesas implements Serializable {
    public static java.util.ArrayList<Mesas> mesas;
    public int idMesa;
    public int numeroDeSillas;
    public boolean estadoMesa;
    public int idCliente;

    public Mesas(int idMesa, int numeroDeSillas, boolean estadoMesa, int idCliente) {
        this.idMesa = idMesa;
        this.numeroDeSillas = numeroDeSillas;
        this.estadoMesa = estadoMesa;
        this.idCliente = idCliente;
        mesas.add(this);
    }

    public void crearReserva() {

    }

    public void cancelarReserva() {

    }

    public void liberarMesa() {

    }
}

