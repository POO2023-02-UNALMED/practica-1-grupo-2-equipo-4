package uiMain;
import java.io.Serializable;
import java.util.ArrayList;
import gestorAplicacion.administracion.Contabilidad;
import gestorAplicacion.administracion.Factura;
import gestorAplicacion.administracion.Mesero;
import gestorAplicacion.restaurante.Ingredientes;
import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.administracion.Mesero;
import gestorAplicacion.restaurante.*;


import java.util.Map;

public class TestEmpleados implements Serializable {
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
        Comida EspecialQuesoYTocineta = new Comida("Especial con queso y tocineta", ingredientesCarneQuesoYTocineta, cantidadesCarneQuesoYTocineta);

        Ingredientes[] ingredientesClasicaPollo = {pan, carneDeRes, tomate, cebolla, lechuga};
        int[] cantidadesClasicaPollo = {2, 1, 1, 1, 1};
        Comida clasicaDePollo = new Comida("Clasica de Pollo", ingredientesClasicaPollo, cantidadesClasicaPollo);


        Ingredientes[] ingredientesPolloqueso = {pan, carneDePollo, queso, tomate, cebolla, lechuga};
        int[] cantidadespolloconQueso = {2, 1, 1, 1, 1, 1};
        Comida polloconQueso = new Comida("Clasica de Pollo", ingredientesPolloqueso, cantidadespolloconQueso);

        Ingredientes[] ingredientesDobleCarneTocineta = {pan, carneDeRes, queso, tocineta, tomate, cebolla, lechuga};
        int[] cantidadesDobleCarneTocineta = {2, 2, 3, 4, 2, 2, 2};
        Comida DobleCarneTocineta = new Comida("Doble carne tocineta", ingredientesDobleCarneTocineta, cantidadesDobleCarneTocineta);

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


        Mesero mesero1 = new Mesero("Pablo", 1,20000);
        Mesero mesero2 = new Mesero("Sofia", 2,20000);
        Mesero mesero3 = new Mesero("Andres", 3,20000);
        Mesero mesero4 = new Mesero("Monica", 4,20000);
        Mesero mesero5 = new Mesero("Horacio", 5,20000);
        mesero1.agregarMesas(mesa1);
        mesero1.agregarMesas(mesa2);
        mesero1.agregarMesas(mesa3);
        mesero1.agregarMesas(mesa4);
        mesero2.agregarMesas(mesa5);
        mesero2.agregarMesas(mesa6);
        mesero2.agregarMesas(mesa7);
        mesero2.agregarMesas(mesa8);
        mesero3.agregarMesas(mesa9);
        mesero3.agregarMesas(mesa10);
        mesero3.agregarMesas(mesa11);
        mesero3.agregarMesas(mesa12);
        mesero4.agregarMesas(mesa13);
        mesero4.agregarMesas(mesa14);
        mesero4.agregarMesas(mesa15);
        mesero4.agregarMesas(mesa1);
        mesero5.agregarMesas(mesa2);
        mesero5.agregarMesas(mesa3);
        mesero5.agregarMesas(mesa4);
        mesero5.agregarMesas(mesa5);

        System.out.println(mesero1.toString());
        System.out.println(mesero2.toString());
        System.out.println(mesero3.toString());
        System.out.println(mesero4.toString());

        ArrayList<Mesas> mesas = new ArrayList<>();
        mesas.add(mesa1);
        mesas.add(mesa2);  // Serializar las calificaciones en un archivo
        Object Serializador = null;

        // Serializador.serializarMesas(mesas);
        Mesas.crearReserva(1,1,"23-10-2023 1:50:00");
        System.out.println(Mesas.mostrarReserva(1,1,"23-10-2023 1:50:00"));










/*
        Pedido pedido1 = new Pedido(1,mesa1,);
        mesa1.crearReserva(345,1,"10-12-2023 13:00:00");
        mesa2.crearReserva(576, 2,"22-11-2023 13:00:00");
        mesa2.crearReserva(578, 2,"22-10-2023 13:00:00");
        System.out.println(mesa1.toString());
        System.out.println(mesa2.toString());
*/


    }

}


