package gestorAplicacion.restaurante;

import java.io.Serializable;

public class Pedido implements Serializable {
    public int idReserva;
    public Menu menu;
    private boolean estadoInventario;
    private float totalPedido;

    public Menu getMenu() {
        return menu;
    }
    
    public void setMenu(Menu menu) {
    	this.menu = menu;
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
    
    public int getIdReserva(int idReserva) {
    	return idReserva;
    }
}

