package gestorAplicacion.administracion;

import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.restaurante.*;

public class Contabilidad implements Serializable {
    private static final long serialVersionUID = 1L;
    public static float saldo = 1000000;

    private static float utilidades;

    private static float ingresos;

    private static float sueldos;

    private static float gastos;

    private static float serviciosPublicos;

    public Contabilidad() {
        utilidades = 0;
        ingresos = 0;
        sueldos = 0; // no es 0, se debe calcular en total sueldos en empleado
        gastos = 0;
        serviciosPublicos = 0;
    }

    public void pagarServicios(float serviciosPublicos) {
        if (serviciosPublicos > 0 && saldo >= serviciosPublicos) {
            saldo -= serviciosPublicos;
            System.out.println("Pago de servicios exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes para realizar el pago.");
        }
    }

    public static void sumarIngresosPedidoAlSaldo(float ingreso) {
        saldo = saldo + ingreso;
        ingresos += ingreso;

}


    //Metodo para calular Utilidad
    public static void calcularUtilidades(float ganancia, float neto) {
        utilidades = ganancia + neto;
    }

   public static float pagarSueldos() {
        float totalPago = 0;
        for (Empleado empleado : Empleado.empleados) {
            totalPago += empleado.getSalario();
            if (empleado.bono()) {
                totalPago = totalPago + (empleado.getSalario() * (15/100));
            } else {
                totalPago += empleado.getSalario();
            }
        }
        saldo = saldo - totalPago;
        return totalPago;
    }
   public float calcularGastos() {
       float gastos = Ingredientes.ingredientesComprados;
       return gastos;
   }

    public static void setSaldo(float saldo) {
        Contabilidad.saldo = saldo;
    }

    public static float getUtilidades() {
        return utilidades;
    }

    public static void setUtilidades(float utilidades) {
        Contabilidad.utilidades = utilidades;
    }

    public static float getIngresos() {
        return ingresos;
    }

    public static void setIngresos(float ingresos) {
        Contabilidad.ingresos = ingresos;
    }

    public static float getSueldos() {
        return sueldos;
    }

    public static void setSueldos(float sueldos) {
        Contabilidad.sueldos = sueldos;
    }

    public static float getGastos() {
        return gastos;
    }

    public static void setGastos(float gastos) {
        Contabilidad.gastos = gastos;
    }

}