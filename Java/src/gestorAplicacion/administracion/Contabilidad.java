package gestorAplicacion.administracion;

import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.restaurante.*;

public class Contabilidad implements Serializable {
    private static final long serialVersionUID = 1L;
    private Empleado empleado;
    private float calcularUtilidad;
    private float calcularIngresos;
    private float pagarSueldos;
    private float calcularGastos;
    public static float saldo = 1000000;

    private ArrayList<Factura> facturas;

    private static final float serviciosPublicos = 0;

    public Contabilidad(Empleado empleado, float calcularUtilidad, float calcularIngresos, float pagarSueldos, float calcularGastos, ArrayList<Factura> facturas) {
        this.empleado = empleado;
        this.calcularUtilidad = calcularUtilidad;
        this.calcularIngresos = calcularIngresos;
        this.pagarSueldos = pagarSueldos;
        this.calcularGastos = calcularGastos;
        this.facturas = facturas;
    }

    public static float getSaldo() {
        return saldo;
    }

    public static void setSaldo(float saldo) {
        Contabilidad.saldo = saldo;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
    // Método para pagar servicios No terminado
    public static void sumarIngresosPedidoAlSaldo(float ingreso){
                saldo = saldo+ingreso;
            }

    public void pagarServicios(float serviciosPublicos) {
        if (serviciosPublicos > 0 && saldo >= serviciosPublicos) {
            saldo -= serviciosPublicos;
            System.out.println("Pago de servicios exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes para realizar el pago.");
        }
    }

    //Metodo para calcular Ingresos Totales
    /* public float calcularIngresos() {
        float ingresoVentas = 0;
        for (Factura factura : facturas) {
            ingresoVentas +=  ;
        }
        this.calcularIngresos = ingresoVentas;
        return this.calcularIngresos;
    } */

    //Metodo para calular Utilidad
    /* public float calcularUtilidad() {
        float totalGastos = calcularGastos();
        float ingresoVentas = calcularIngresos();
        this.calcularUtilidad = ingresoVentas - totalGastos;
        return this.calcularUtilidad;
    } */

    //Metodo para calcular Los Gastos de La Hamburgueseria
    public float calcularGastos() {
        float gastos = pagarSueldos() + Ingredientes.ingredientesComprados;
        return gastos;
    }

    //Metodo para Pagar los sueldos a los empleados
    public float pagarSueldos() {
        float totalPago = 0;
        for (Empleado empleado : empleado.empleados) { // deberia
            totalPago += empleado.getSalario();
            if (empleado.BONO()) { // Sí el Empleado tiene un buen promedio de las calificaciones se le aplicara el Bono a su salario final.
                totalPago += (empleado.getSalario() * 200000); // Necesita multiplicar el Salario por el valor del bono.
            } else {
                totalPago += empleado.getSalario();
            }
        }
        this.pagarSueldos = totalPago;
        return this.pagarSueldos;
    }
}