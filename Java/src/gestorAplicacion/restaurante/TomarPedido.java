package gestorAplicacion.restaurante;

public class TomarPedido {
    public int idReserva;
    public Menu menu;
    private boolean estadoInventario;
    private float totalPedido;

    public Menu getMenu() {
        return menu;
    }

    public void setEstadoInventario(boolean estadoInventario) {
        this.estadoInventario = estadoInventario;
    }

    public boolean isEstadoInventario() {
        return estadoInventario;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
}

