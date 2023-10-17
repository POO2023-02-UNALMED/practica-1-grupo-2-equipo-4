package gestorAplicacion.restaurante;

import java.util.HashMap;
import java.util.Map;

public class Comida {
    private String nombre;
    private Map<Ingredientes, Integer> ingredientesDeComida = new HashMap<>();

    public Comida(String nombre) { // Crea una receta de comida
        this.nombre = nombre;
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



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ingredientes necesarios:\n");
        for (Map.Entry<Ingredientes, Integer> entry : ingredientesDeComida.entrySet()) {
            Ingredientes ingrediente = entry.getKey();
            int cantidad = entry.getValue();
            sb.append(ingrediente.getNombre()).append(": ").append(cantidad).append("\n");
        }
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
