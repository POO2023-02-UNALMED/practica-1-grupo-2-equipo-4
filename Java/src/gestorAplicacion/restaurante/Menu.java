package gestorAplicacion.restaurante;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.*;

public class Menu implements  Serializable {
    private List<Comida> comidas;
    private List<Gaseosas> gaseosas;

    public Menu() {
        comidas = new ArrayList<>();
        gaseosas = new ArrayList<>();
    }

    public void agregarComida(Comida comida) { //agrega un tipo de comida al menú
        comidas.add(comida);
    }

    public void removerComida(Comida comida) { //remueve un tipo de comida al menú
        comidas.remove(comida);
    }

    public void agregarGaseosa(Gaseosas gaseosa) { //agrega un tipo de gaseosa al menú
        gaseosas.add(gaseosa);
    }

    public void removerGaseosa(Gaseosas gaseosa) { //remueve un tipo de gaseosa al menú
        gaseosas.remove(gaseosa);
    }
    public void mostrarMenu() {
        System.out.println("Comidas:");
        for (Comida comida : comidas) {
            System.out.println(comida.getNombre() + " - Precio: $" + comida.calcularPrecio());
        }

        System.out.println("\nGaseosas:");
        for (Gaseosas gaseosa : gaseosas) {
            System.out.println(gaseosa.getNombre() + " - Precio: $" + gaseosa.getPrecio());
        }
    }
}