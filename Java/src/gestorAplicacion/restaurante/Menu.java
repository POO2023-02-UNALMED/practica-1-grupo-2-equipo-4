package gestorAplicacion.restaurante;

import java.io.Serializable;

public class Menu implements Serializable {
    private String tipoHamburguesa;
    private int precioHamburguesa;
    private String acompañantes;
    private int precioAcompañantes;

    public Menu(String tipoHamburguesa, int precioHamburguesa, String acompañantes, int precioAcompañantes) {
        this.tipoHamburguesa = tipoHamburguesa;
        this.precioHamburguesa = precioHamburguesa;
        this.acompañantes = acompañantes;
        this.precioAcompañantes = precioAcompañantes;
    }

    public String getTipoHamburguesa() {
    	return tipoHamburguesa;
    }
    
    public void setTipoHamburguesa(String tipoHamburguesa) {
    	this.tipoHamburguesa = tipoHamburguesa;
    }
    
    public int getPrecioHamburguesa() {
    	return precioHamburguesa;
    }
    
    public void setPrecioHamburguesa(int precioHamburguesa) {
    	this.precioHamburguesa = precioHamburguesa;
    }
    
    public String getAcompañantes() {   //Hay que defininír si los acompañantes quedan como string o pasan a ser solo un boolean.
    	return acompañantes;
    }
    
    public void setAcompañantes(String acompañantes) {
    	this.acompañantes = acompañantes;
    }
    
    public int getPrecioAcompañantes() {
    	return precioAcompañantes;
    }
    
    public void setPrecioAcompañantes(int precioAcompañantes) {
    	this.precioAcompañantes = precioAcompañantes;
    }
}

