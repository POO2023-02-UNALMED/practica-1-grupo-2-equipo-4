package gestorAplicacion.restaurante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Comida {
    public static ArrayList<Comida> listaComida = new ArrayList<>();
    private String nombre;
    private String menucomida = """ 
        Clasica de carne - Precio: $8750.0
        Especial con queso y tocineta - Precio: $16100.0
        Clasica de Pollo - Precio: $8750.0
        Clasica de Pollo con queso - Precio: $11750.0
        Doble carne tocineta - Precio: $25500.0
        Vegetariana - Precio: $11500.0
        Carnibora - Precio: $23000.0
        Clasica de carne - Precio: $8750.0
        Especial con queso y tocineta - Precio: $16100.0
        Clasica de Pollo - Precio: $8750.0
        Clasica de Pollo con queso - Precio: $11750.0
        Doble carne tocineta - Precio: $25500.0
        Vegetariana - Precio: $11500.0
        Carnibora - Precio: $23000.0
           """;

    private HashMap<Ingredientes, Integer> ingredientesDeComida;

    public Comida(String nombre, Ingredientes [] ingredientes, int[] cantidades) {
        this.nombre = nombre;
        this.ingredientesDeComida = new HashMap<>();
        for (int i = 0; i < ingredientes.length; i++) {
            this.ingredientesDeComida.put(ingredientes[i], cantidades[i]);
        }
        listaComida.add(this);
    }

    public void agregarIngrediente(Ingredientes ingrediente, int cantidad) {  /* agrega un ingrediente a la receta, si esté ya estaba en la receta, suma la cantidad
                                                                                especificada */
        if (ingredientesDeComida.containsKey(ingrediente)) {
            int cantidadActual = ingredientesDeComida.get(ingrediente);
            ingredientesDeComida.put(ingrediente, cantidadActual + cantidad);
        } else {
            ingredientesDeComida.put(ingrediente, cantidad);
        }
    }
    public void removerIngrediente(Ingredientes ingrediente, int cantidad) {  /* remueve un ingrediente a la receta */
        if (ingredientesDeComida.containsKey(ingrediente)) {
            int cantidadActual = ingredientesDeComida.get(ingrediente);
            if (cantidadActual <= cantidad) {
                ingredientesDeComida.remove(ingrediente);
            } else {
                ingredientesDeComida.put(ingrediente, cantidadActual - cantidad);
            }
        }
    }

    public Map<Ingredientes, Integer> getIngredientesDeComida() {
        return ingredientesDeComida;
    }
    public void restarCantidad() {
        // Restar la cantidad de ingredientes en el pedido
        for (Map.Entry<Ingredientes, Integer> entry : ingredientesDeComida.entrySet()) {
            Ingredientes ingrediente = entry.getKey();
            int cantidad = entry.getValue();
            ingrediente.restarIngredientes(cantidad);
        }
    }
    public float calcularPrecio() { //recorre los ingredientes de la comida, obtiene el precio de cada ingrediente y lo multiplica por la cantidad utilizada.
                                    // Luego, suma todos los precios parciales para obtener el precio total de la comida.

        float precioTotal = 0;
        for (Map.Entry<Ingredientes, Integer> entry : ingredientesDeComida.entrySet()) {
            Ingredientes ingrediente = entry.getKey();
            int cantidad = entry.getValue();
            precioTotal += ingrediente.precio * cantidad;
        }
        return  precioTotal;
    }

    public float calcularPrecioConGanancia() {

        float precioTotalConGanancia = 0;
        for (Map.Entry<Ingredientes, Integer> entry : ingredientesDeComida.entrySet()) {
            Ingredientes ingrediente = entry.getKey();
            int cantidad = entry.getValue();
            precioTotalConGanancia += ingrediente.precio * cantidad + (ingrediente.precio * cantidad)*10/100;
        }
        return  precioTotalConGanancia;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comida: ").append(nombre).append("\n");
        sb.append("Ingredientes:\n");
        for (Map.Entry<Ingredientes, Integer> entry : ingredientesDeComida.entrySet()) {
            Ingredientes ingrediente = entry.getKey();
            int cantidad = entry.getValue();
            sb.append("- ").append(ingrediente.getNombre()).append(": ").append(cantidad).append("\n");
        }
        return sb.toString();
    }

    public boolean verificarIngredientes() {
        for (Map.Entry<Ingredientes, Integer> entry : ingredientesDeComida.entrySet()) {
            Ingredientes ingrediente = entry.getKey();
            int cantidadNecesaria = entry.getValue();
            if (ingrediente.getCantidad() < cantidadNecesaria) {
                return false;
            }
        }
        return true;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
