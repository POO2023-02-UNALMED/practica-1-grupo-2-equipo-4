package gestorAplicacion.restaurante;
import java.util.ArrayList;
import java.io.Serializable;
public class Mesas implements Serializable {
    public static java.util.ArrayList<Mesas> mesas;
    public int idMesa;
    public int numeroDeSillas;
    public boolean estadoMesa;
    public int idCliente;

    public Mesas(int idMesa, int numeroDeSillas, boolean estadoMesa) {
        this.idMesa = idMesa;
        this.numeroDeSillas = numeroDeSillas;
        this.estadoMesa = estadoMesa;
        this.idCliente = 0;
        mesas.add(this);
    }

    public void crearReserva(int idCliente) {
        this.idCliente = idCliente;
        this.estadoMesa = false;

    }

    public void cancelarReserva() {
        this.idCliente = 0;
        this.estadoMesa = true;

    }

    public void liberarMesa() {

    }

    public static ArrayList<Mesas> getMesas() {
        return mesas;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumeroDeSillas() {
        return numeroDeSillas;
    }

    public void setNumeroDeSillas(int numeroDeSillas) {
        this.numeroDeSillas = numeroDeSillas;
    }

    public boolean isEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(boolean estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}

