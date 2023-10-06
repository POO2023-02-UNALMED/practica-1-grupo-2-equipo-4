package gestorAplicacion.restaurante;

public class Menu {
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

}

