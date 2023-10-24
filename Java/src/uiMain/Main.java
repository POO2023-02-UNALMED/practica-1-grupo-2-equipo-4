package uiMain;


import baseDatos.Serializador;
import gestorAplicacion.administracion.Cocinero;
import gestorAplicacion.administracion.Factura;
import gestorAplicacion.administracion.Mesero;
import gestorAplicacion.restaurante.Ingredientes;
import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;
import gestorAplicacion.restaurante.*;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // gaseosas
        ArrayList<Gaseosas> listaGaseosas = new ArrayList<>();
        Gaseosas coca_cola = new Gaseosas("Coca cola", 4000, 20);
        Gaseosas sprite = new Gaseosas("Sprite", 3500, 20);
        Gaseosas premio = new Gaseosas("Premio", 3000, 20);
        Gaseosas quatro = new Gaseosas("Quatro", 2500, 20);
        listaGaseosas.add(coca_cola);
        listaGaseosas.add(sprite);
        listaGaseosas.add(premio);
        listaGaseosas.add(quatro);
        Serializador.serializarGaseosa(listaGaseosas);// Serializar Gaseosas

        // ingredientes
        ArrayList<Ingredientes> listaIngredientes = new ArrayList<>();
        Ingredientes pan = new Ingredientes("Pan", 1000, 20);
        Ingredientes carneDeRes = new Ingredientes("Carne de res", 6000, 20);
        Ingredientes carneDePollo = new Ingredientes("Carne de pollo", 7000, 20);
        Ingredientes carneVegana = new Ingredientes("Carne vegana", 4000, 20);
        Ingredientes tomate = new Ingredientes("Tomate", 400, 20);
        Ingredientes cebolla = new Ingredientes("Cebolla", 200, 20);
        Ingredientes lechuga = new Ingredientes("Lechuga", 150, 20);
        Ingredientes queso = new Ingredientes("Queso", 2000, 20);
        Ingredientes tocineta = new Ingredientes("Tocineta", 1000, 20);
        listaIngredientes.add(pan);
        listaIngredientes.add(carneDeRes);
        listaIngredientes.add(carneDePollo);
        listaIngredientes.add(tomate);
        listaIngredientes.add(cebolla);
        listaIngredientes.add(lechuga);
        listaIngredientes.add(queso);
        listaIngredientes.add(tocineta);
        Serializador.serializarIngredientes(listaIngredientes);// Serializar Ingredientes

        // comidas
        ArrayList<Comida> listaComida = new ArrayList<>();
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
        listaComida.add(clasicaDeCarne);
        listaComida.add(especialQuesoYTocineta);
        listaComida.add(clasicaDePollo);
        listaComida.add(polloconQueso);
        listaComida.add(dobleCarneTocineta);
        listaComida.add(vegetariana);
        listaComida.add(carnibora);
        Serializador.serializarComida(listaComida);// Serializar Comida

        // Mesas
        ArrayList<Mesas> listaMesas = new ArrayList<>();
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
        listaMesas.add(mesa1);
        listaMesas.add(mesa2);
        listaMesas.add(mesa3);
        listaMesas.add(mesa4);
        listaMesas.add(mesa5);
        listaMesas.add(mesa6);
        listaMesas.add(mesa7);
        listaMesas.add(mesa8);
        listaMesas.add(mesa9);
        listaMesas.add(mesa10);
        listaMesas.add(mesa11);
        listaMesas.add(mesa12);
        listaMesas.add(mesa13);
        listaMesas.add(mesa14);
        listaMesas.add(mesa15);
        Serializador.serializarMesas(listaMesas);// Serializar Mesas
//Empleados
        //Cocineros
        ArrayList<Cocinero> listaCocinero = new ArrayList<>();
        Cocinero Linguini = new Cocinero("Linguini", 0100, 10000, "Clasica de Carne");
        Cocinero Remi = new Cocinero("Remi", 0101, 9000, "Vegetariana");
        Cocinero Gordon = new Cocinero("Gordon", 0102, 12000, "Carnivora");
        Cocinero Ricard = new Cocinero("Ricard", 0103, 9000, "Especial con queso y tocineta");
        Cocinero David = new Cocinero("David", 0104, 8000, "Carnivora");
        listaCocinero.add(Linguini);
        listaCocinero.add(Remi);
        listaCocinero.add(Gordon);
        listaCocinero.add(Ricard);
        listaCocinero.add(David);
        Serializador.serializarCocinero(listaCocinero);

        //Meseros
        ArrayList<Mesero> listaMeseros = new ArrayList<>();
        Mesero mesero1 = new Mesero("Pablo",0200,20000);
        Mesero mesero2 = new Mesero("Sofia",0201,20000);
        Mesero mesero3 = new Mesero("Andres",0202,20000);
        Mesero mesero4 = new Mesero("Monica",0203,20000);
        Mesero mesero5 = new Mesero("Horacio",0204,20000);
        listaMeseros.add(mesero1);
        listaMeseros.add(mesero2);
        listaMeseros.add(mesero3);
        listaMeseros.add(mesero4);
        listaMeseros.add(mesero5);



        //Pedidos
         ArrayList<Pedido> listaPedido = new ArrayList<>();
        Pedido pedido3 = new Pedido(mesa4, "23-10-2023 8:50:00", Linguini);
        pedido3.agregarGaseosaAlPedido(coca_cola, coca_cola);
        pedido3.agregarComidaAlPedido(clasicaDeCarne, dobleCarneTocineta);
        pedido3.confirmarOrden();

        Pedido pedido5 = new Pedido(mesa2, "23-10-2023 5:50:00", Remi);
        pedido5.agregarGaseosaAlPedido(coca_cola, sprite);
        pedido5.agregarComidaAlPedido(vegetariana);
        pedido5.confirmarOrden();

        Pedido pedido4 = new Pedido(mesa1, "23-10-2023 3:50:00", Linguini);
        pedido4.agregarGaseosaAlPedido(quatro, sprite);
        pedido4.agregarComidaAlPedido(clasicaDePollo, especialQuesoYTocineta);
        pedido4.confirmarOrden();
        listaPedido.add(pedido4);
        listaPedido.add(pedido3);
        listaPedido.add(pedido5);
        Serializador.serializarPedido(listaPedido);// Seriliza Pedido



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
        Mesas.crearReserva(576, 2,"25-11-2023 17:00:00");
        Mesas.crearReserva(127, 10,"31-11-2023 20:00:00");
        Mesas.crearReserva(234, 6,"30-11-2023 14:00:00");
        Mesas.crearReserva(29, 2,"28-11-2023 19:00:00");
        }

    }