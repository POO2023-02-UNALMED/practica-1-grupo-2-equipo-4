package uiMain;


import gestorAplicacion.administracion.Calificacion;
import gestorAplicacion.administracion.Cocinero;
import gestorAplicacion.administracion.Contabilidad;
import gestorAplicacion.administracion.Factura;
import gestorAplicacion.restaurante.Ingredientes;
import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;
import gestorAplicacion.restaurante.*;


import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // gaseosas

        Gaseosas coca_cola = new Gaseosas("Coca cola", 4000, 20);
        Gaseosas sprite = new Gaseosas("Sprite", 3500, 20);
        Gaseosas premio = new Gaseosas("Premio", 3000, 20);
        Gaseosas quatro = new Gaseosas("Quatro", 2500, 20);


        // ingredientes
        Ingredientes pan = new Ingredientes("Pan", 1000, 20);
        Ingredientes carneDeRes = new Ingredientes("Carne de res", 6000, 20);
        Ingredientes carneDePollo = new Ingredientes("Carne de pollo", 7000, 20);
        Ingredientes carneVegana = new Ingredientes("Carne vegana", 4000, 20);
        Ingredientes tomate = new Ingredientes("Tomate", 400, 20);
        Ingredientes cebolla = new Ingredientes("Cebolla", 200, 20);
        Ingredientes lechuga = new Ingredientes("Lechuga", 150, 20);
        Ingredientes queso = new Ingredientes("Queso", 2000, 20);
        Ingredientes tocineta = new Ingredientes("Tocineta", 1000, 20);

        // comidas
        Ingredientes[] ingredientesClasicaCarne = {pan, carneDeRes, tomate, cebolla, lechuga};
        int[] cantidadesClasicaCarne = {2, 1, 1, 1, 1};
        Comida clasicaDeCarne = new Comida("Clasica de carne", ingredientesClasicaCarne, cantidadesClasicaCarne);

        Ingredientes[] ingredientesCarneQuesoYTocineta = {pan, carneDeRes, queso, tocineta, tomate, cebolla, lechuga};
        int[] cantidadesCarneQuesoYTocineta = {2, 1, 2, 3, 1, 2, 2};
        Comida especialQuesoYTocineta = new Comida("Especial con queso y tocineta", ingredientesCarneQuesoYTocineta, cantidadesCarneQuesoYTocineta);

        Ingredientes[] ingredientesClasicaPollo = {pan, carneDeRes, tomate, cebolla, lechuga};
        int[] cantidadesClasicaPollo = {2, 1, 1, 1, 1};
        Comida clasicaDePollo = new Comida("Clasica de Pollo", ingredientesClasicaPollo, cantidadesClasicaPollo);


        Ingredientes[] ingredientesPolloqueso = {pan, carneDePollo, queso, tomate, cebolla, lechuga};
        int[] cantidadespolloconQueso = {2, 1, 1, 1, 1, 1};
        Comida polloconQueso = new Comida("Clasica de Pollo con queso", ingredientesPolloqueso, cantidadespolloconQueso);

        Ingredientes[] ingredientesDobleCarneTocineta = {pan, carneDeRes, queso, tocineta, tomate, cebolla, lechuga};
        int[] cantidadesDobleCarneTocineta = {2, 2, 3, 4, 2, 2, 2};
        Comida dobleCarneTocineta = new Comida("Doble carne tocineta", ingredientesDobleCarneTocineta, cantidadesDobleCarneTocineta);

        Ingredientes[] ingredientesVegetariana = {pan, carneVegana, queso, tomate, cebolla, lechuga};
        int[] cantidadesVegetariana = {2, 1, 2, 2, 2, 2};
        Comida vegetariana = new Comida("Vegetariana", ingredientesVegetariana, cantidadesVegetariana);

        Ingredientes[] ingredientesCarnibora = {pan, carneDeRes, carneDePollo, tocineta, queso};
        int[] cantidadesCarnibora = {2, 1, 1, 4, 2};
        Comida carnibora = new Comida("Carnibora", ingredientesCarnibora, cantidadesCarnibora);


        Mesas mesa1 = new Mesas(1, 2);
        Mesas mesa2 = new Mesas(2, 2);
        Mesas mesa3 = new Mesas(3, 2);
        Mesas mesa4 = new Mesas(4, 2);
        Mesas mesa5 = new Mesas(5, 4);
        Mesas mesa6 = new Mesas(6, 4);
        Mesas mesa7 = new Mesas(7, 4);
        Mesas mesa8 = new Mesas(8, 4);
        Mesas mesa9 = new Mesas(9, 4);
        Mesas mesa10 = new Mesas(10, 6);
        Mesas mesa11 = new Mesas(11, 6);
        Mesas mesa12 = new Mesas(12, 8);
        Mesas mesa13 = new Mesas(13, 8);
        Mesas mesa14 = new Mesas(14, 10);
        Mesas mesa15 = new Mesas(15, 10);

        Cocinero linguini = new Cocinero("linguini", 0100, 9000, "Calvas");
        Cocinero remi = new Cocinero("remi", 0101, 9000, "Calvas");

        Pedido pedido3 = new Pedido(mesa4, "23-10-2023 8:50:00", linguini);
        pedido3.agregarGaseosaAlPedido(coca_cola, coca_cola);
        pedido3.agregarComidaAlPedido(clasicaDeCarne, dobleCarneTocineta);
        pedido3.confirmarOrden();

        Pedido pedido5 = new Pedido(mesa2, "23-10-2023 5:50:00", remi);
        pedido5.agregarGaseosaAlPedido(coca_cola, sprite);
        pedido5.agregarComidaAlPedido(vegetariana);
        pedido5.confirmarOrden();

        Pedido pedido4 = new Pedido(mesa1, "23-10-2023 3:50:00", linguini);
        pedido4.agregarGaseosaAlPedido(quatro, sprite);
        pedido4.agregarComidaAlPedido(clasicaDePollo, especialQuesoYTocineta);
        pedido4.confirmarOrden();



        int idFacturaDeseada = 10000001;
        for (Factura factura : Factura.facturasSinPagar) {
            if (factura.getIdFactura() == idFacturaDeseada ) {
                factura.pagarFactura();
                factura.calificarEmpleado(4.5f);
                break;
            }
        }
        int idFacturaDeseada2 = 10000002;
        for (Factura factura : Factura.facturasSinPagar) {
            if (factura.getIdFactura() == idFacturaDeseada2 ) {
                factura.pagarFactura();
                factura.calificarEmpleado(5);
                break;
            }
        }
        int idFacturaDeseada3 = 10000003;
        for (Factura factura : Factura.facturasSinPagar) {
            if (factura.getIdFactura() == idFacturaDeseada3 ) {
                factura.pagarFactura();
                factura.calificarEmpleado(4.7f);
                break;
            }
        }

        Mesas.crearReserva(345,1,"10-12-2023 13:00:00");
        Mesas.crearReserva(576, 2,"22-11-2023 13:00:00");
        }

    }