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
        // la unica para que salga algo en el Case, es que estos metodos retornen algo. asi que en Hamburgueseria se debe printear el metodo.
        // Aunque intentte hacer esto
        //        static String mostrarMenuGaseosas() {
        //        StringBuilder menuGaseosas = new StringBuilder();
        //        for (Gaseosas gaseosa : Gaseosas.listaGaseosas) {
        //            menuGaseosas.append(gaseosa.getNombre()).append(" - Precio: $").append(gaseosa.getPrecio()).append("\n");
        //        }
        //        return menuGaseosas.toString();
        //    }

    }
}