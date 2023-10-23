package uiMain;



import gestorAplicacion.restaurante.Ingredientes;
import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;
import gestorAplicacion.restaurante.*;


import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // gaseosas

        Gaseosas coca_cola = new Gaseosas("Coca cola",4000,20);
        Gaseosas Sprite = new Gaseosas("Sprite",3500,20);
        Gaseosas premio = new Gaseosas("Premio", 3000, 20);
        Gaseosas quatro= new Gaseosas("Quatro", 2500, 20);


        // ingredientes
        Ingredientes pan = new Ingredientes("Pan", 1000, 20);
        Ingredientes carneDeRes = new Ingredientes("Carne de res", 6000, 20);
        Ingredientes carneDePollo = new Ingredientes("Carne de pollo", 7000, 20);
        Ingredientes carneVegana = new Ingredientes("Carne vegana", 4000, 20);
        Ingredientes tomate = new Ingredientes("Tomate", 400, 20);
        Ingredientes cebolla = new Ingredientes("Cebolla", 200,20);
        Ingredientes lechuga = new Ingredientes("Lechuga",150, 20);
        Ingredientes queso = new Ingredientes("Queso", 2000, 20);
        Ingredientes tocineta = new Ingredientes("Tocineta", 1000, 20 );

        // comidas
        Ingredientes[] ingredientesClasicaCarne = {pan,carneDeRes, tomate,cebolla,lechuga};
        int[] cantidadesClasicaCarne ={2, 1,1,1,1};
        Comida clasicaDeCarne = new Comida("Clasica de carne", ingredientesClasicaCarne, cantidadesClasicaCarne);

        Ingredientes[] ingredientesCarneQuesoYTocineta = {pan,carneDeRes,queso, tocineta, tomate, cebolla, lechuga};
        int[] cantidadesCarneQuesoYTocineta = {2,1,2,3,1,2,2};
        Comida EspecialQuesoYTocineta = new Comida("Especial con queso y tocineta", ingredientesCarneQuesoYTocineta, cantidadesCarneQuesoYTocineta);

        Ingredientes [] ingredientesDobleCarneTocineta = {pan , carneDeRes, queso, tocineta, tomate, cebolla, lechuga};
        int [] 












/*
        Pedido pedido1 = new Pedido(1,mesa1,);
        mesa1.crearReserva(345,1,"10-12-2023 13:00:00");
        mesa2.crearReserva(576, 2,"22-11-2023 13:00:00");
        mesa2.crearReserva(578, 2,"22-10-2023 13:00:00");
        System.out.println(mesa1.toString());
        System.out.println(mesa2.toString());
*/

     Mesas mesa1 = new Mesas(1,4);
     Mesas mesa2 = new Mesas(2,4);
     Mesas mesa3 = new Mesas(3,7);
     Mesas mesa4 = new Mesas(4,8);
     Mesas mesa5 = new Mesas(5,10);
     Mesas mesa6 = new Mesas(6,10);

     mesa1.crearReserva(789, 1, "11-12-2023 14:00:00");
     mesa2.crearReserva(456, 2, "11-12-2023 14:00:00");





    }

}