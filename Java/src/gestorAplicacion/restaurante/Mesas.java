package gestorAplicacion.restaurante;
import java.util.ArrayList;
import java.io.Serializable;
public class Mesas implements Serializable {
    public static Restaurante restaurante;
    public int idMesa;
    public int numeroDeSillas;
    public boolean ocupado;
    public int idCliente;

    public Mesas(int idMesa, int numeroDeSillas, boolean ocupado) {
        this.idMesa = idMesa;
        this.numeroDeSillas = numeroDeSillas;
        this.ocupado = ocupado;
        this.idCliente = 0;
        Restaurante.mesas.add(this);
    }

    public void crearReserva(int idCliente) {/** Este método asigna un cliente a cada mesa*/
        this.idCliente = idCliente;
        this.ocupado = false;

    }

    public void cancelarReserva() {/** Este método libera la mesa dejandola sin ningún cliente*/
        this.idCliente = 0;
        this.ocupado = true;

    }


    public static Restaurante getRestaurante() {
        return restaurante;
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
        return ocupado;
    }

    public void setEstadoMesa(boolean estadoMesa) {
        this.ocupado = estadoMesa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}

