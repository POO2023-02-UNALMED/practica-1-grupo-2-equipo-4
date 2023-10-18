package uiMain;

import gestorAplicacion.administracion.Contabilidad;
import gestorAplicacion.restaurante.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

       /* Gaseosas coca_cola = new Gaseosas("Coca cola",2000,9);
        Gaseosas Sprite = new Gaseosas("Sprite",2000,9);


        // Test Comprar Ingredientes
        Ingredientes albahaca = new Ingredientes("albahaca",3657,3);
        Ingredientes tomate = new Ingredientes("tomate",5657,4);
        Ingredientes carneDeCerdo = new Ingredientes("carne de cerdo", 15000, 6);
        Ingredientes huevo = new Ingredientes("huevo", 800, 10);

        // test recetas
        Comida carneALosHuevos = new Comida("Carne a los huevos");
        carneALosHuevos.agregarIngrediente(huevo,6);
        carneALosHuevos.agregarIngrediente(carneDeCerdo,3);
        System.out.println(carneALosHuevos);
        carneALosHuevos.removerIngrediente(huevo, 2);
        carneALosHuevos.agregarIngrediente(carneDeCerdo, 1);
        System.out.println(carneALosHuevos);
        System.out.println(carneALosHuevos.calcularPrecio());
        carneALosHuevos.removerIngrediente(huevo,4);
        System.out.println(carneALosHuevos);


        Menu menu = new Menu();
        menu.agregarGaseosa(coca_cola);
        menu.agregarComida(carneALosHuevos);
        menu.mostrarMenu();
        menu.removerComida(carneALosHuevos);
        menu.removerGaseosa(coca_cola);
        menu.mostrarMenu();

 */
        Mesas mesa1 = new Mesas(1,4);
        Mesas mesa2 = new Mesas(2,4);
        Mesas mesa3 = new Mesas(3,7);
        Mesas mesa4 = new Mesas(4,8);
        Mesas mesa5 = new Mesas(5,10);
        Mesas mesa6 = new Mesas(6,10);

        mesa1.crearReserva(789, 4, "11-12-2023 14:00:00");
        mesa2.crearReserva(576, 8,"aaa");
        System.out.println(mesa1.toString());
        System.out.println(mesa2.toString());

    }

}