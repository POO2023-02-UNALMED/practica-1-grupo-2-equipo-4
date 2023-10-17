package uiMain;

import gestorAplicacion.administracion.Contabilidad;
import gestorAplicacion.restaurante.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {





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
    }

}