package gestorAplicacion.administracion;

import gestorAplicacion.restaurante.Restaurante;

import java.io.Serializable;
import java.util.ArrayList;

public class Contabilidad implements Serializable{
    public static Restaurante restaurante;
    public static float saldo = 1000000;
    public ArrayList<Factura> Facturas;
    
    public Contabilidad(float saldo,ArrayList<Factura> Facturas){
        this.saldo = saldo;
        this.Facturas = Facturas;

    }

    public static float getSaldo() {
        return saldo;
    }

    public static void setSaldo(float saldo) {
        Contabilidad.saldo = saldo;
    }

    public static Restaurante getRestaurante() {
        return restaurante;
    }

    public static void setRestaurante(Restaurante restaurante) {
        Contabilidad.restaurante = restaurante;
    }

    public ArrayList<Factura> getFacturas() {
        return Facturas;
    }
}
