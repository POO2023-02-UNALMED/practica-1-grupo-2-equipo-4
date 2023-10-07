package gestorAplicacion.administracion;

import java.io.Serializable;
import java.util.ArrayList;

public class Contabilidad implements Serializable{
    public float saldo;
    public ArrayList<Factura> Facturas;
    public Contabilidad(float saldo,ArrayList<Factura> Facturas){
        this.saldo = saldo;
        this.Facturas = Facturas;

    }





}
