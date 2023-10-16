package gestorAplicacion.restaurante;

import java.io.Serializable;

public class Menu implements Serializable {
    private String tipoHamburguesa;
    private int precioHamburguesa;
    private String acompanantes;
    private int precioAcompanantes;

    public Menu(String tipoHamburguesa, int precioHamburguesa, String acompanantes, int precioAcompanantes) {
        this.tipoHamburguesa = tipoHamburguesa;
        this.precioHamburguesa = precioHamburguesa;
        this.acompanantes = acompanantes;
        this.precioAcompanantes = precioAcompanantes;
    }
    public Menu hamCarne (String acompanantes, int precioAcompanantes){
        Menu hamburguesaDeCarne = new Menu("Clasica de Carne", 18500, acompanantes, precioAcompanantes);
        this.acompanantes = acompanantes;
        this.precioAcompanantes = precioAcompanantes;
        ; //aqui faltan los metodos necesarios para restar los ingredientes usados
        return hamburguesaDeCarne;
    }
    public Menu hamPollo (String acompanantes, int precioAcompanantes){
        Menu hamburguesaDePollo = new Menu("Clasica de Pollo", 19000, acompanantes, precioAcompanantes);
        this.acompanantes = acompanantes;
        this.precioAcompanantes = precioAcompanantes;
        ; //aqui faltan los metodos necesarios para restar los ingredientes usados
        return hamburguesaDePollo;
    }
    public Menu hamDoble (String acompanantes, int precioAcompanantes){
        Menu hamburguesaDobleDeCarne = new Menu("Doble de Carne", 22000, acompanantes, precioAcompanantes);
        this.acompanantes = acompanantes;
        this.precioAcompanantes = precioAcompanantes;
        ; //aqui faltan los metodos necesarios para restar los ingredientes usados
        return hamburguesaDobleDeCarne;
    }public Menu hamQuesoTocineta (String acompanantes, int precioAcompanantes){
        Menu hamburguesaDeCarneQyT = new Menu("Carne con Queso y Tocineta", 23000, acompanantes, precioAcompanantes);
        this.acompanantes = acompanantes;
        this.precioAcompanantes = precioAcompanantes;
        ; //aqui faltan los metodos necesarios para restar los ingredientes usados
        return hamburguesaDeCarneQyT;
    }public Menu hamPolloQueso (String acompanantes, int precioAcompanantes){
        Menu hamburguesaDePolloyQ = new Menu("Pollo con Queso", 22000, acompanantes, precioAcompanantes);
        this.acompanantes = acompanantes;
        this.precioAcompanantes = precioAcompanantes;
        ; //aqui faltan los metodos necesarios para restar los ingredientes usados
        return hamburguesaDePolloyQ;
    }public Menu hamVegetariana (String acompanantes, int precioAcompanantes){
        Menu hamburguesaVegetariana = new Menu("Vegetariana", 21000, acompanantes, precioAcompanantes);
        this.acompanantes = acompanantes;
        this.precioAcompanantes = precioAcompanantes;
        ; //aqui faltan los metodos necesarios para restar los ingredientes usados
        return hamburguesaVegetariana;
    }public Menu hamDobleQyT (String acompanantes, int precioAcompanantes){
        Menu hamburguesaDobleQyT = new Menu("Doble con Queso y Tocineta", 27000, acompanantes, precioAcompanantes);
        this.acompanantes = acompanantes;
        this.precioAcompanantes = precioAcompanantes;
        ; //aqui faltan los metodos necesarios para restar los ingredientes usados
        return hamburguesaDobleQyT;
    }
    public Menu hamDobleSinVegetales (String acompanantes, int precioAcompanantes){
        Menu hamburguesaDobleSInVegetales = new Menu("Doble sin Vegetales", 25000, acompanantes, precioAcompanantes);
        this.acompanantes = acompanantes;
        this.precioAcompanantes = precioAcompanantes;
        ; //aqui faltan los metodos necesarios para restar los ingredientes usados
        return hamburguesaDobleSInVegetales;
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
    
    public String getAcompanantes() {   //Hay que defininír si los acompañantes quedan como string o pasan a ser solo un boolean.
    	return acompanantes;
    }
    
    public void setAcompanantes(String acompanantes) {
    	this.acompanantes = acompanantes;
    }
    
    public int getPrecioAcompañantes() {
    	return precioAcompanantes;
    }
    
    public void setPrecioAcompanantes(int precioAcompanantes) {
    	this.precioAcompanantes = precioAcompanantes;
    }
}

