package gestorAplicacion.administracion;

import java.io.Serializable;
import java.util.ArrayList;
import gestorAplicacion.restaurante.*;

public class Contabilidad implements Serializable{
    private static final long serialVersionUID = 1L;
    private Empleado empleado;
    private double calcularUtilidad;
    private double calcularIngresos;
    private double pagarSueldos;
    private double calcularGastos;
    private static float saldo = 1000000;
    private ArrayList<Factura> facturas;
    private static final float serviciosPublicos = 0;
    
    public Contabilidad(float saldo,ArrayList<Factura> facturas, double calcularUtilidad, double calcularGastos, double calcularIngresos, double pagarSueldos){
        Contabilidad.saldo = saldo;
        this.facturas = facturas;
        this.calcularUtilidad= calcularUtilidad;
        this.calcularIngresos = calcularIngresos;
        this.calcularGastos = calcularGastos;
        this.pagarSueldos = pagarSueldos;

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
    public void pagarServicios(float serviciosPublicos) {
        if (serviciosPublicos > 0 && saldo >= serviciosPublicos) {
            saldo -= serviciosPublicos;
            System.out.println("Pago de servicios exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes para realizar el pago.");
        }
    }
    // Metodo para calcular Ingresos Totales
    public double calcularIngresos() {
        double ingresoVentas = 0;
        for (Factura factura : facturas) {
            ingresoVentas += factura.precioTotal();
        }
        this.calcularIngresos = ingresoVentas;
        return this.calcularIngresos;
    }
    // Metodo para calular Utilidad
    public double calcularUtilidad() {
        double totalGastos = calcularGastos() + pagarSueldos();
        double ingresoVentas = calcularIngresos();
        this.calcularUtilidad = ingresoVentas - totalGastos;
        return this.calcularUtilidad;
    }
    // Metodo para calcular Los Gastos de La Hamburgueseria
    public double calcularGastos(){

        return calcularGastos;
    }
    // Metodo para Pagar los sueldos a los empleados
    public double pagarSueldos() {
        double totalPago = 0;
        for (Empleado empleado : empleado.empleados) { // deberia
            totalPago += empleado.getSalario();
            if (empleado.BONO()) { // Si el Empleado tiene un buen promedio de las calificaciones se le aplicara el Bono a su salario final.
                totalPago += (empleado.getSalario() * 200000); // Necesita multiplicar el Salario por El valor de bono el cual es 200000$.
            } else {
                totalPago += empleado.getSalario();
            }
        }
        this.pagarSueldos = totalPago;
        return this.pagarSueldos;
    }
}