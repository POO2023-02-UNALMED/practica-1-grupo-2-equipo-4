package gestorAplicacion.restaurante;

public interface MenuMethods {
    static void mostrarMenuComidas(){
        for (Comida comida : Comida.listaComida) {
            System.out.println(comida.getNombre() + " - Precio: $" + comida.calcularPrecio());
        }
    }

    static void mostrarMenuGaseosas() {
        for (Gaseosas gaseosa : Gaseosas.listaGaseosas) {
            System.out.println(gaseosa.getNombre() + " - Precio: $" + gaseosa.getPrecio());
        }
    }
}