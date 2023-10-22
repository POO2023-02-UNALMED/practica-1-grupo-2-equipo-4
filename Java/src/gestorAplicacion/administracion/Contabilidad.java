package gestorAplicacion.administracion;

import java.io.Serializable;
import java.util.ArrayList;

public class Contabilidad implements Serializable{
    public static float saldo = 1000000;
    public ArrayList<Factura> Facturas;
    public static final float serviciosPublicos = 0;
    
    public Contabilidad(float saldo,ArrayList<Factura> Facturas){
        Contabilidad.saldo = saldo;
        this.Facturas = Facturas;


    }

    public static float getSaldo() {
        return saldo;
    }

    public static void setSaldo(float saldo) {
        Contabilidad.saldo = saldo;
    }

    public ArrayList<Factura> getFacturas() {
        return Facturas;
    }
}
